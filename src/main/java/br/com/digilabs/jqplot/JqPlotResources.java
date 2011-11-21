package br.com.digilabs.jqplot;

/**
 *
 * @author inaiat
 */
public enum JqPlotResources {

    BarRenderer("$.jqplot.barRenderer", "plugins/jqplot.barRenderer.min.js"),
    PieRenderer("$.jqplot.PieRenderer", "plugins/jqplot.pieRenderer.min.js"),
    DonutRenderer("$.jqplot.DonutRenderer", "plugins/jqplot.donutRenderer.min.js"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer", "plugins/jqplot.canvasAxisLabelRenderer.min.js"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer", "plugins/jqplot.categoryAxisRenderer.min.js"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer", "plugins/jqplot.canvasAxisTickRenderer.min.js"),
    CanvasTextRenderer("$.jqplot.CanvasTextRenderer","plugins/jqplot.canvasTextRenderer.min.js"),
    ShadowRenderer("$.jqplot.ShadowRenderer", "jquery.jqplot.min.js");
    
    private String className;
    private String resource;

    private JqPlotResources(String className) {
        this(className, null);
    }

    private JqPlotResources(String className, String resource) {
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
