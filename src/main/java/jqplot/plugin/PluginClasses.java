/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.plugin;

/**
 *
 * @author inaiat
 */
public enum PluginClasses {

    BarRenderer("$.jqplot.barRenderer"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer"),
    LineRenderer("");
    
    private String pluginName;

    private PluginClasses(String pluginName) {
        this.pluginName = pluginName;
    }   

    @Override
    public String toString() {
        return pluginName;
    }
    
    public String getPluginName() {
        return pluginName;
    }
}
