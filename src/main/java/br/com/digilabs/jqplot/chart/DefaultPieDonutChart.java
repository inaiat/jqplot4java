package br.com.digilabs.jqplot.chart;

import java.util.Collection;


import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.PieDonutData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

@JqPlotPlugin(values = {JqPlotResources.PieRenderer, JqPlotResources.DonutRenderer})
public class DefaultPieDonutChart<T extends Number> extends
		AbstractChart<PieDonutData<T>> {

	PieDonutData<T> data = new PieDonutData<T>();

	public DefaultPieDonutChart() {
		this(null);
	}

	public DefaultPieDonutChart(String title) {
		getChartConfiguration().setTitle(new Title(title));
		getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
		getChartConfiguration().getSeriesDefaults().setRenderer(
				JqPlotResources.DonutRenderer);
		getChartConfiguration().getSeriesDefaults().setRendererOptions(
				new RendererOptions());
		getChartConfiguration().getSeriesDefaults().getRendererOptions()
				.setSliceMargin(4);
		getChartConfiguration().getSeriesDefaults().getRendererOptions()
				.setShowDataLabels(true);
		getChartConfiguration().getSeriesDefaults().getRendererOptions()
				.setDataLabels("value");
	}

	public void addValue(Collection<LabeledItem<T>> value) {
		data.addValue(value);
	}

	public PieDonutData<T> getChartData() {
		return data;
	}

	public void setChartData(PieDonutData<T> value) {
		this.data=value;
		
	}

}
