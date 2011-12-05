package br.com.digilabs.jqplot.chart;


import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.data.LabeledData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.TickOptions;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {
    JqPlotResources.DateAxisRenderer,
    JqPlotResources.CanvasTextRenderer,
    JqPlotResources.CategoryAxisRenderer,
    JqPlotResources.DateAxisRenderer,
    JqPlotResources.CanvasAxisLabelRenderer,
    JqPlotResources.CanvasAxisTickRenderer
})
public class LabeledLineChart<T extends Number> extends AbstractChart<LabeledData<T>> {

	private static final long serialVersionUID = -6833884146696085085L;

	LabeledData<T> labeledData = new LabeledData<T>();

    /**
     * Construtor
     */
    public LabeledLineChart() {
        this(null, null, null, 15);
    }

    /**
     * Construtor
     * @param title
     * @param labelX
     * @param labelY 
     */
    public LabeledLineChart(String title, String labelX, String labelY) {
        this(title, labelX, labelY, 15);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY
     * @param tickAngle 
     */
    public LabeledLineChart(String title, String labelX, String labelY,
            Integer tickAngle) {
        getChartConfiguration().setTitle(new Title(title));
        Axis xAxis = getChartConfiguration().createXAxis();
        xAxis.setRenderer(JqPlotResources.DateAxisRenderer);
        xAxis.setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        xAxis.setTickRenderer(JqPlotResources.CanvasAxisTickRenderer);
        TickOptions tickOptions = new TickOptions();
        tickOptions.setAngle(tickAngle);
        xAxis.setTickOptions(tickOptions);
        getChartConfiguration().createYAxis().setLabelRenderer(
                JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }

    /**
     * 
     * @param value 
     */
    public void addValue(LabeledItem<T> value) {
        labeledData.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(LabeledItem<T>... values) {
        labeledData.addValues(values);
    }

    /**
     * 
     * @return 
     */
    public LabeledData<T> getChartData() {
        return labeledData;
    }
}
