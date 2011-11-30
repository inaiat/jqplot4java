package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.ChartData;
import br.com.digilabs.jqplot.data.MeterData;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.MeterGaugeRenderer})
public class DefaultMeterGaugeChart extends DefaultChart {

    private static final long serialVersionUID = -8122703368130701972L;
    private MeterData data = new MeterData(0);

    public DefaultMeterGaugeChart() {
        initialize(null);

    }

    public DefaultMeterGaugeChart(String title) {
        initialize(title);
    }

    protected final void initialize(String title) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.MeterGaugeRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
    }

    public void setValue(Float value) {
        data.setValue(value);
    }

    public void setValue(Integer value) {
        data.setValue(value);
    }
    @Override
    public ChartData getChartData(){
        return data;
    }
}
