/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotResources;
import jqplot.chart.data.ChartData;
import jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values={JqPlotResources.CanvasTextRenderer, JqPlotResources.CategoryAxisRenderer})
public class LineChart<T extends ChartData> extends DefaultChart<T> {

    public LineChart() {
        getJqPlot().createAxesDefaults().setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        getJqPlot().createXAxis().setPad(0F);
    }

    public LineChart(String title, String labelX, String labelY) {
        this();
        getJqPlot().setLabelX(labelX);
        getJqPlot().setLabelY(labelY);
    }  
}
