package br.com.digilabs.jqplot.chart;


import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.data.LabeledData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.TickOptions;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * Cria gr�fico de linha com etiquetas.
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

    LabeledData labeledData = new LabeledData();

    public LabeledLineChart() {
        this(null, null, null, 15);
    }

    public LabeledLineChart(String title, String labelX, String labelY) {
        this(title, labelX, labelY, 15);
    }

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

    public void addValue(LabeledItem<T> value) {
        labeledData.addValue(value);
    }

    public void addValues(LabeledItem<T>... values) {
        labeledData.addValues(values);
    }

    public LabeledData getChartData() {
        return labeledData;
    }

    public void setChartData(LabeledData value) {
        this.labeledData = value;
    }
}
