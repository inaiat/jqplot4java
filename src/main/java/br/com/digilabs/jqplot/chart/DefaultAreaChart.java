package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.data.AreaFillData;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;

import java.util.List;

/**
 *
 * @author inaiat
 */
public class DefaultAreaChart<T extends Number> extends AbstractChart<AreaFillData<T>> {

    private AreaFillData<T> data = new AreaFillData<T>();

    public DefaultAreaChart() {
        this(null);
    }

    public DefaultAreaChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setStackSeries(true);
        getChartConfiguration().setShowMarker(false);
        SeriesDefaults defaults = new SeriesDefaults();
        defaults.setFill(true);
        setSeriesDefaults(defaults);
        XAxis xAxis = createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
    }

    public AreaFillData<T> getChartData() {
        return data;
    }

    public void setChartData(AreaFillData<T> value) {
        this.data = value;
    }

    public void addValue(List<T> value) {
        data.addValue(value);
    }

    public void addValues(List<T>... value) {
        data.addValues(value);
    }
}
