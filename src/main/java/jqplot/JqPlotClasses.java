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

    BarRenderer("$.jqplot.barRenderer", "plugins/jqplot.barRenderer.min.js"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer", "plugin/jqplot.canvasAxisLabelRenderer.min.js"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer", "plugin/jqplot.categoryAxisRenderer.min.js"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer", "jqplot.canvasAxisTickRenderer.min.js"),
    LineRenderer(""),
    ShadowRenderer("$.jqplot.ShadowRenderer", "jquery.jqplot.min.js");
    
    private String className;
    private String resource;

    private JqPlotClasses(String className) {
        this(className, null);
    }

    private JqPlotClasses(String className, String resource) {
        this.className = className;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return className;
    }

    public String getClassName() {
        return className;
    }

    public String getResource() {
        return resource;
    }
}
