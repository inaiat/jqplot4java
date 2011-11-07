/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

/**
 *
 * @author inaiat
 */
public enum JqPlotClasses {

    BarRenderer("$.jqplot.barRenderer"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer"),
    LineRenderer(""),
    PieRenderer("$.jqplot.PieRenderer"),
    ShadowRenderer("$.jqplot.shadowRenderer");
    private String pluginName;

    private JqPlotClasses(String pluginName) {
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
