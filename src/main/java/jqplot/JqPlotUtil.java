/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import jqplot.chart.BaseChart;
import jqplot.chart.data.ChartData;
import jqplot.metadata.JqPlotPlugin;
import jqplot.renderer.plugin.BarRenderer;
import jqplot.renderer.plugin.CanvasAxisLabelRenderer;
import jqplot.renderer.plugin.CanvasAxisTickRenderer;
import jqplot.renderer.plugin.CategoryAxisRenderer;

/**
 *
 * @author inaiat
 */
public class JqPlotUtil {

    private static final Class<?>[] RESOURCES = new Class<?>[]{
        BarRenderer.class,
        CanvasAxisLabelRenderer.class,
        CanvasAxisTickRenderer.class,
        CategoryAxisRenderer.class
    };

    public static List<String> retriveJavaScriptResources(BaseChart jqPlot) {
        List<String> resources = new ArrayList<String>();
        for (Class<?> clazz : RESOURCES) {
            if (clazz.isAnnotationPresent(JqPlotPlugin.class)) {
                resources.add(clazz.getAnnotation(JqPlotPlugin.class).value().getResource());
            }
        }
        return resources;
    }

    public static String createPieChartJquery(BaseChart jqPlot, String divId, HashMap<String, ?> data) {
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
        builder.append(pieChartToJson(jqPlot));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(BaseChart jqPlot, String divId) {
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
        builder.append(xstream.toXML(jqPlot.getData()));
        builder.append(", ");
        builder.append(jqPlotToJson(jqPlot));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(BaseChart jqPlot, String divId, HashMap<String, ?> data) {
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
        builder.append(jqPlotToJson(jqPlot));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String createJquery(BaseChart jqPlot, String divId, Collection<? extends Serializable> data) {
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
        builder.append(jqPlotToJson(jqPlot));
        builder.append(");\r\n");
        builder.append("});\r\n");
        return builder.toString();
    }

    public static String pieChartToJson(BaseChart jqPlot) {

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
                JqPlotClasses plugin = (JqPlotClasses) source;
                writer.setValue(plugin.getClassName());
            }
        };

        converter.canConvert(JqPlotClasses.class);

        xstream.registerConverter(converter);


        return xstream.toXML(jqPlot);
    }

    public static String jqPlotToJson(BaseChart jqPlot) {

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
                JqPlotClasses plugin = (JqPlotClasses) source;
                writer.setValue(plugin.getClassName());
            }
        };

        converter.canConvert(JqPlotClasses.class);

        xstream.registerConverter(converter);


        return xstream.toXML(jqPlot);
    }
}
