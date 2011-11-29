/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.chart.config.ChartConfiguration;
import br.com.digilabs.jqplot.chart.data.ChartData;
import br.com.digilabs.jqplot.chart.elements.RendererOptions;
import br.com.digilabs.jqplot.chart.elements.SeriesDefaults;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author bernardo.moura
 */
@JqPlotPlugin(values={JqPlotResources.BubbleRenderer})
public class BubbleChart<T extends ChartData<?>> extends DefaultChart<T> {

    private static final long serialVersionUID = -8122703368130701972L;

    public BubbleChart() {
        initialize(null);
    }

    public BubbleChart(String title) {

        initialize(title);
    }

    protected final void initialize(String title) {
        ChartConfiguration chartConfiguration = getChartConfiguration();
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        ro.setBubbleAlpha(0.6F);
        ro.setHighlightAlpha(0.8F);
        ro.setShowLables(true);
        ro.setFillZero(true);
        sd.setShadow(true);
        sd.setShadowAlpha(0.05F);
        sd.setRenderer(JqPlotResources.BubbleRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);

    }
}
