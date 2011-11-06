/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.plugin;

import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 *
 * @author inaiat
 */
public enum Plugin {

    BarRenderer(""),
    CanvasAxisLabelRenderer(br.com.digilabs.jqplot.plugin.CanvasAxisLabelRenderer.PLUGIN_NAME);
    //LineRenderer("$.jqplot.barRenderer"),
    //CategoryAxisRenderer("$.jqplot.barRenderer"),
    //DataAxisRenderer("$.jqplot.CategoryAxisRenderer");
    private String pluginName;

    private Plugin(String pluginName) {
        this.pluginName = pluginName;
    }   

    @Override
    public String toString() {
        return pluginName;
    }   

}
