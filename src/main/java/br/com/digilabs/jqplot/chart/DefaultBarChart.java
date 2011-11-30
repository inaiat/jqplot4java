package br.com.digilabs.jqplot.chart;

import java.util.Collection;

import br.com.digilabs.jqplot.JqPlotConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.BarData;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.PointLabels;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * 
 * Classe respons�vel pela montagem do gr�fico de Barras.
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CategoryAxisRenderer, JqPlotResources.BarRenderer, JqPlotResources.PointLabels})
public class DefaultBarChart<T extends Number> extends AbstractChart<BarData<T>> {

    BarData<T> barData = new BarData<T>();

    public DefaultBarChart() {
        this(null, null, null);
    }

    public DefaultBarChart(String title) {
        this(title, null, null);
    }

    public DefaultBarChart(String title, String labelX, String labelY) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));

        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.BarRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
        chartConfiguration.getSeriesDefaults().setPointLabels(new PointLabels());

        ro.setFillZero(true);

        Legend legend = new Legend();
        legend.setShow(true);
        legend.setPlacment("outsideGrid");
        chartConfiguration.setLegend(legend);
        chartConfiguration.setLabelX(labelX);
        chartConfiguration.setLabelY(labelY);

        XAxis xAxis = getChartConfiguration().createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);

        getChartConfiguration().createYAxis();
    }

 
    
    public void addValue(Collection<T> value) {
        barData.addValue(value);
    }

    public void addValues(Collection<T>... value) {
        barData.addValues(value);
    }

    public BarData<T> getChartData() {
        return barData;
    }

    public void setChartData(BarData<T> value) {
        this.barData = value;
    }
}
