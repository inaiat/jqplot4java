/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.plugin.PluginClasses;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.enums.EnumConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import java.io.Writer;

/**
 *
 * @author inaiat
 */
public class JqPlotUtil {

    public static String createJquery(JqPlot jqPlot, String divId, String data) {
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){");
        builder.append("   $.jqplot('").append(divId).append("', ").append(data).append(");");
        return builder.toString();
    }

    public static String jqPlotToJson(JqPlot jqPlot) {
        
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
            }
        });

        EnumConverter converter = new EnumConverter() {

            @Override
            public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
                PluginClasses plugin = (PluginClasses) source;
                writer.setValue(plugin.getPluginName());
            }
        };
        converter.canConvert(PluginClasses.class);

        xstream.registerConverter(converter);
        
        return xstream.toXML(jqPlot);
    }
}
