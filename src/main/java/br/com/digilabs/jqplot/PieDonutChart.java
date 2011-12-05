package br.com.digilabs.jqplot;

import java.util.Collection;


import br.com.digilabs.jqplot.data.PieDonutData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.DonutRenderer})
public class PieDonutChart<T extends Number> extends AbstractChart<PieDonutData<T>> {

	private static final long serialVersionUID = -4671992800819368331L;

	PieDonutData<T> data = new PieDonutData<T>();

    /**
     * Construtor
     */
    public PieDonutChart() {
        this(null);
    }

    /**
     * 
     * @param title 
     */
    public PieDonutChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(
                JqPlotResources.DonutRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(
                new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setSliceMargin(4);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setDataLabels("value");
    }

    /**
     * 
     * @param value 
     */
    public void addValue(Collection<LabeledItem<T>> value) {
        data.addValue(value);
    }

    /**
     * 
     * @return 
     */
    public PieDonutData<T> getChartData() {
        return data;
    }

    /**
     * 
     * @param value 
     */
    public void setChartData(PieDonutData<T> value) {
        this.data = value;

    }
}
