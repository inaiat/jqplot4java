package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.data.PieData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.PieRenderer})
public class PieChart<T extends Number> extends AbstractChart<PieData<T>> {

	private static final long serialVersionUID = -9078771567964143651L;

	private PieData<T> data = new PieData<T>();

    /**
     * Construtor
     */
    public PieChart() {
        this(null);
    }

    /**
     * Construtor
     * @param title 
     */
    public PieChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setLegend(new Legend(true, "e"));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.PieRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);

    }

    /**
     * 
     * @param label
     * @param value 
     */
    public void addValue(String label, T value) {
        data.addValue(new LabeledItem<T>(label, value));
    }

    /**
     * 
     * @param value 
     */
    public void addValue(LabeledItem<T> value) {
        data.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(LabeledItem<T>... values) {
        data.addValues(values);
    }

    /**
     * 
     * @return chartData
     */
    public PieData<T> getChartData() {
        return data;
    }

    /**
     * 
     * @param value 
     */
    public void setChartData(PieData<T> value) {
        this.data = value;
    }
}