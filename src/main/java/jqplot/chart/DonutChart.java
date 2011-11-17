/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.chart.config.ChartConfiguration;
import jqplot.JqPlotResources;
import jqplot.chart.elements.Legend;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author bernardo.moura
 */
public class DonutChart extends ChartConfiguration {

	private static final long serialVersionUID = 7957575711673711213L;

	private Legend legend;
    private SeriesDefaults seriesDefaults = new SeriesDefaults();

    public DonutChart() {
        legend = new Legend(true, "e");
        seriesDefaults.setRenderer(JqPlotResources.DonutRenderer);
        seriesDefaults.getRendererOptions().setSliceMargin(4);
        seriesDefaults.getRendererOptions().setDataLabels("value");
        seriesDefaults.getRendererOptions().setShowDataLabels(true);
    }

    public JqPlotResources getRenderer() {
        return seriesDefaults.getRenderer();
    }

    public void setRenderer(JqPlotResources renderer) {
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
