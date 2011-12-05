package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.support.JqPlotJsonMapHierarchicalWriter;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;



import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.enums.EnumConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;

/**
 * Classe utilitária
 * 
 * @author inaiat
 */
public class JavaScriptUtil {

    /**
     * Retorna os recursos de javascript
     * @param chart
     * @return lista de com os javascripts dos gráficos
     */
    public static List<String> retriveJavaScriptResources(Chart<?> chart) {
        List<String> resources = new ArrayList<String>();
        Class<?> clazz = chart.getClass();
        if (clazz.isAnnotationPresent(JqPlotPlugin.class)) {
            JqPlotResources[] jqPlotResourceses = clazz.getAnnotation(
                    JqPlotPlugin.class).values();
            for (JqPlotResources jqPlotResources : jqPlotResourceses) {
                resources.add(jqPlotResources.getResource());
            }
        }
        return resources;
    }

    /**
     * Cria um comando jquery
     * @param chart
     * @param divId
     * @return jquery criado
     */
    public static String createJquery(Chart<?> chart, String divId) {
        return createJquery(chart, divId, null);
    }

    /**
     * Cria um comando jquery
     * @param chart
     * @param divId
     * @param javaScriptVar
     * @return jquery criado
     */
    public static String createJquery(Chart<?> chart, String divId, String javaScriptVar) {
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){\r\n");
        if (javaScriptVar != null) {
            builder.append("   var ").append(javaScriptVar).append("=");
        }
        builder.append("   $.jqplot('").append(divId).append("', ");
        builder.append(chart.getChartData().toJsonString());
        builder.append(", ");
        builder.append(jqPlotToJson(chart.getChartConfiguration()));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    /**
     * Retorna o um json a partir de uma configuração jqplot
     * @param jqPlot
     * @return 
     */
    public static String jqPlotToJson(ChartConfiguration jqPlot) {

        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JqPlotJsonMapHierarchicalWriter(writer, JsonWriter.DROP_ROOT_MODE) {

                    @Override
                    public void addAttribute(String name, String value) {
                        if (!name.contains("class")) {
                            super.addAttribute(name, value);
                        }
                    }
                };
            }
        }) {
        };

        EnumConverter converter = new EnumConverter() {

            @Override
            public void marshal(Object source, HierarchicalStreamWriter writer,
                    MarshallingContext context) {
                JqPlotResources plugin = (JqPlotResources) source;
                writer.setValue(plugin.getClassName());
            }
        };

        converter.canConvert(JqPlotResources.class);

        xstream.registerConverter(converter);

        return xstream.toXML(jqPlot);
    }
}
