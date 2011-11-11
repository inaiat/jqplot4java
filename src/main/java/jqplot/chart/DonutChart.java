/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.chart.data.Chart;
import jqplot.JqPlotClasses;
import jqplot.chart.data.ChartData;
import jqplot.chart.elements.Legend;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author bernardo.moura
 */
public class DonutChart extends JqPlot {

    private Legend legend;
    private SeriesDefaults seriesDefaults = new SeriesDefaults();

    public DonutChart() {
        legend = new Legend(true, "e");
        seriesDefaults.setRenderer(JqPlotClasses.DonutRenderer);
        seriesDefaults.getRendererOptions().setSliceMargin(4);
        seriesDefaults.getRendererOptions().setDataLabels("value");
        seriesDefaults.getRendererOptions().setShowDataLabels(true);
    }

    public JqPlotClasses getRenderer() {
        return seriesDefaults.getRenderer();
    }

    public void setRenderer(JqPlotClasses renderer) {
        seriesDefaults.setRenderer(renderer);
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public SeriesDefaults getSeriesDefaults() {
        return seriesDefaults;
    }

    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        this.seriesDefaults = seriesDefaults;
    }

}
