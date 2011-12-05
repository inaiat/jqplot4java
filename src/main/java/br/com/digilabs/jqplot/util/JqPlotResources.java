package br.com.digilabs.jqplot.util;

/**
 * Recuros de javascript e css necessários para montar os gráficos
 * @author inaiat
 */
public enum JqPlotResources {

    BarRenderer("$.jqplot.BarRenderer", "plugins/jqplot.barRenderer.min.js"),
    BubbleRenderer("$.jqplot.BubbleRenderer", "plugins/jqplot.bubbleRenderer.min.js"),
    PieRenderer("$.jqplot.PieRenderer", "plugins/jqplot.pieRenderer.min.js"),
    DonutRenderer("$.jqplot.DonutRenderer", "plugins/jqplot.donutRenderer.min.js"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer", "plugins/jqplot.canvasAxisLabelRenderer.min.js"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer", "plugins/jqplot.categoryAxisRenderer.min.js"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer", "plugins/jqplot.canvasAxisTickRenderer.min.js"),
    CanvasTextRenderer("$.jqplot.CanvasTextRenderer","plugins/jqplot.canvasTextRenderer.min.js"),
    DateAxisRenderer("$.jqplot.DateAxisRenderer","plugins/jqplot.dateAxisRenderer.min.js"),
    MeterGaugeRenderer("$.jqplot.MeterGaugeRenderer","plugins/jqplot.meterGaugeRenderer.min.js"),
    PointLabels("$.jqplot.DateAxisRenderer","plugins/jqplot.pointLabels.min.js"),
    ShadowRenderer("$.jqplot.ShadowRenderer", "jquery.jqplot.min.js");
    
    private String className;
    private String resource;

    /**
     * 
     * @param className 
     */
    private JqPlotResources(String className) {
        this(className, null);
    }

    /**
     * 
     * @param className
     * @param resource 
     */
    private JqPlotResources(String className, String resource) {
        this.className = className;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return className;
    }

    /**
     * 
     * @return o nome da classe
     */
    public String getClassName() {
        return className;
    }

    /**
     * Retorna o resurce
     * @return o resource
     */
    public String getResource() {
        return resource;
    }
}

