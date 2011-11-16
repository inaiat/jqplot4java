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
        getChartConfiguration().createAxesDefaults().setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().createXAxis().setPad(0F);
    }

    public LineChart(String title, String labelX, String labelY) {
        this();
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }  
}
