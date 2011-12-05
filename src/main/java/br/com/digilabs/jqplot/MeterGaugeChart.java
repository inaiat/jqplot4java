package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.data.MeterData;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.MeterGaugeRenderer})
public class MeterGaugeChart extends AbstractChart<MeterData> {

    private static final long serialVersionUID = -8122703368130701972L;
    private MeterData data = new MeterData(0F);

    /**
     * Construtor
     */
    public MeterGaugeChart() {
        initialize(null);

    }

    /**
     * Construtor
     * @param title 
     */
    public MeterGaugeChart(String title) {
        initialize(title);
    }

    /**
     * Inicialização
     * @param title 
     */
    protected final void initialize(String title) {
        ChartConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.MeterGaugeRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
    }

    /**
     * 
     * @param value 
     */
    public void setValue(Float value) {
        data.setValue(value);
    }

    /**
     * 
     * @param value 
     */
    public void setValue(Integer value) {
        data.setValue(value.floatValue());
    }

    public MeterData getChartData() {
        return data;
    }

    public void setChartData(MeterData value) {
        this.data = value;
    }
}
