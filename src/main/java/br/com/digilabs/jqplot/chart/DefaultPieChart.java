package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.PieData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.PieRenderer})
public class DefaultPieChart<T extends Number> extends AbstractChart<PieData<T>> {

    private PieData<T> data = new PieData<T>();

    public DefaultPieChart() {
        this(null);
    }

    public DefaultPieChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setLegend(new Legend(true, "e"));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.PieRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);

    }

    public void addValue(String label, T value) {
        data.addValue(new LabeledItem<T>(label, value));
    }

    public void addValue(LabeledItem<T> value) {
        data.addValue(value);
    }

    public void addValues(LabeledItem<T>... values) {
        data.addValues(values);
    }

    public PieData<T> getChartData() {
        return data;
    }

    public void setChartData(PieData<T> value) {
        this.data = value;
    }
}