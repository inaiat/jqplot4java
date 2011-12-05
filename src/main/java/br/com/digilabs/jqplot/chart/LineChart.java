package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.LinedData;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.CanvasTextRenderer, JqPlotResources.CategoryAxisRenderer})
public class LineChart<T extends Number> extends AbstractChart<LinedData<T>> {

	private static final long serialVersionUID = -643105267124184518L;

	private LinedData<T> linedData = new LinedData<T>();

    /**
     * Construtor
     */
    public LineChart() {
        this(null, null, null);
    }

    /**
     * Construtor
     * @param title 
     */
    public LineChart(String title) {
        this(title, null, null);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY 
     */
    public LineChart(String title, String labelX, String labelY) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().createAxesDefaults().setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().createXAxis().setPad(0F);
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }

    /**
     * 
     * @param value 
     */
    public void addValue(T value) {
        linedData.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(T... values) {
        linedData.addValues(values);
    }

    /**
     * 
     * @return 
     */
    public LinedData<T> getChartData() {
        return linedData;
    }
}
