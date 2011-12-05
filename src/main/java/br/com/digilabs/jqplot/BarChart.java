package br.com.digilabs.jqplot;

import java.util.Collection;

import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.BarData;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.PointLabels;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CategoryAxisRenderer, JqPlotResources.BarRenderer, JqPlotResources.PointLabels})
public class BarChart<T extends Number> extends AbstractChart<BarData<T>> {

	private static final long serialVersionUID = 3650210485517566138L;

	private BarData<T> barData = new BarData<T>();

    /**
     * Construtor
     */
    public BarChart() {
        this(null, null, null);
    }

    /**
     * Construtor
     * @param title 
     */
    public BarChart(String title) {
        this(title, null, null);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY 
     */
    public BarChart(String title, String labelX, String labelY) {
        ChartConfiguration chartConfiguration = getChartConfiguration();
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
    
    /**
     * Adiciona um valor
     * @param value 
     */
    public void addValue(Collection<T> value) {
        barData.addValue(value);
    }

    /**
     * 
     * @param value 
     */
    public void addValues(Collection<T>... value) {
        barData.addValues(value);
    }

    /**
     * 
     * @return charData
     */
    public BarData<T> getChartData() {
        return barData;
    }

    /**
     * 
     * @param value 
     */
    public void setChartData(BarData<T> value) {
        this.barData = value;
    }
}
