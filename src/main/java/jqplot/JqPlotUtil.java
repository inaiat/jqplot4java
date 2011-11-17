package jqplot;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.enums.EnumConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.io.json.JsonWriter.Format;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import jqplot.chart.Chart;
import jqplot.chart.config.ChartConfiguration;
import jqplot.metadata.JqPlotPlugin;
import jqplot.renderer.plugin.BarRenderer;
import jqplot.renderer.plugin.CanvasAxisLabelRenderer;
import jqplot.renderer.plugin.CanvasAxisTickRenderer;
import jqplot.renderer.plugin.CategoryAxisRenderer;
import jqplot.renderer.plugin.DonutRenderer;
import jqplot.renderer.plugin.PieRenderer;

/**
 *
 * @author inaiat
 */
public class JqPlotUtil {

    private static final Class<?>[] RESOURCES = new Class<?>[]{
        BarRenderer.class,
        PieRenderer.class,
        DonutRenderer.class,
        CanvasAxisLabelRenderer.class,
        CanvasAxisTickRenderer.class,
        CategoryAxisRenderer.class
    };

    public static List<String> retriveJavaScriptResources(Chart jqPlot) {
        List<String> resources = new ArrayList<String>();
        for (Class<?> clazz : RESOURCES) {
            if (clazz.isAnnotationPresent(JqPlotPlugin.class)) {
                JqPlotResources[] jqPlotResourceses = clazz.getAnnotation(JqPlotPlugin.class).values();
                for (JqPlotResources jqPlotResources : jqPlotResourceses) {
                    resources.add(jqPlotResources.getResource());                    
                }
            }
        }
        return resources;
    }

    public static String createPieChartJquery(Chart chart, String divId, HashMap<String, ?> data) {
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }
        });
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){\r\n");
        builder.append("   $.jqplot('").append(divId).append("',[ ");
        builder.append(xstream.toXML(data));
        builder.append("], ");
        builder.append(pieChartToJson(chart));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(Chart chart, String divId) {
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }            
            
        });          

        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){\r\n");
        builder.append("   $.jqplot('").append(divId).append("', ");
        builder.append(chart.getChartData().toJsonString());
        builder.append(", ");
        builder.append(jqPlotToJson(chart.getChartConfiguration()));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(Chart chart, String divId, HashMap<String, ?> data) {
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }
        });
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){\r\n");
        builder.append("   $.jqplot('").append(divId).append("', ");
        builder.append(xstream.toXML(data));
        builder.append(", ");
        builder.append(jqPlotToJson((ChartConfiguration)chart));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(Chart chart, String divId, Collection<? extends Serializable> data) {
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }
        });
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){\r\n");
        builder.append("   $.jqplot('").append(divId).append("', ");
        builder.append(xstream.toXML(data));
        builder.append(", ");
        builder.append(jqPlotToJson((ChartConfiguration)chart));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String pieChartToJson(Chart jqPlot) {

        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE) {

                    @Override
                    public void addAttribute(String name, String value) {

                        if (!name.equals("class")) {
                            super.addAttribute(name, value);
                        }

                    }

                    @Override
                    protected void addValue(String value, Type type) {
                        // TODO: See if it's the best way to do this. 
                        // Passing null to avoid having quotes on $. object. 
                        // With null is being serialized like a JSObject.
                        if (value.contains("$")) {
                            super.addValue(value, null);
                        } else {
                            super.addValue(value, type);
                        }
                    }
                };
            }
        }) {
        };
        EnumConverter converter = new EnumConverter() {

            @Override
            public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
                JqPlotResources plugin = (JqPlotResources) source;
                writer.setValue(plugin.getClassName());
            }
        };

        converter.canConvert(JqPlotResources.class);

        xstream.registerConverter(converter);


        return xstream.toXML(jqPlot);
    }

    public static String jqPlotToJson(ChartConfiguration jqPlot) {

        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE) {

                    @Override
                    public void addAttribute(String name, String value) {
                        if (!name.contains("class")) {
                            super.addAttribute(name, value);
                        }
                    }

                    @Override
                    protected void addValue(String value, Type type) {
                        // TODO: See if it's the best way to do this. 
                        // Passing null to avoid having quotes on $. object. 
                        // With null is being serialized like a JSObject.
                        if (value.contains("$")) {
                            super.addValue(value, null);
                        } else {
                            super.addValue(value, type);
                        }
                    }
                };
            }
        }) {
        };

        EnumConverter converter = new EnumConverter() {

            @Override
            public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
                JqPlotResources plugin = (JqPlotResources) source;
                writer.setValue(plugin.getClassName());
            }
        };

        converter.canConvert(JqPlotResources.class);

        xstream.registerConverter(converter);


        return xstream.toXML(jqPlot);
    }
}
