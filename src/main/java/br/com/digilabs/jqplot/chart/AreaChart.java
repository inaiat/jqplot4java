package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.AreaFillData;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

import java.util.List;

/**
 * @author inaiat
 */
public class AreaChart<T extends Number> extends AbstractChart<AreaFillData<T>> {

	private static final long serialVersionUID = 6050878600406620553L;

	private AreaFillData<T> data = new AreaFillData<T>();

    /**
     * Construtor
     */
    public AreaChart() {
        this(null);
    }

    /**
     * Construtor
     * @param title 
     */
    public AreaChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setStackSeries(true);
        getChartConfiguration().setShowMarker(false);
        SeriesDefaults defaults = new SeriesDefaults();
        defaults.setFill(true);
        setSeriesDefaults(defaults);
        XAxis xAxis = createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
    }

    /**
     * 
     * @return areaFillData
     */
    public AreaFillData<T> getChartData() {
        return data;
    }

    /**
     * Adiciona um valor
     * @param value 
     */
    public void addValue(List<T> value) {
        data.addValue(value);
    }

    /**
     * Adiciona uma lista de valores
     * @param value 
     */
    public void addValues(List<T>... value) {
        data.addValues(value);
    }
}
