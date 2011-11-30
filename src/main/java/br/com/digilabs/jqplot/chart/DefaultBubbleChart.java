package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotConfiguration;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.BubbleData;
import br.com.digilabs.jqplot.data.item.BubbleItem;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.BubbleRenderer})
public class DefaultBubbleChart<T extends BubbleItem> extends AbstractChart<BubbleData<T>> {

    private static final long serialVersionUID = -8122703368130701972L;
    BubbleData<BubbleItem> bubbleData = new BubbleData<BubbleItem>();

    public DefaultBubbleChart() {
        initialize(null);
    }

    public DefaultBubbleChart(String title) {
        initialize(title);
    }

    protected final void initialize(String title) {
        JqPlotConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.BubbleRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
    }

    public BubbleData getChartData() {
        return bubbleData;
    }

    public void setChartData(BubbleData value) {
        this.bubbleData = value;
        
    }
    public void addValue(BubbleItem item) {
        bubbleData.addValue(item);
    }
    public void addValue(Float x, Float y, Float radius, String label) {
        bubbleData.addValue(new BubbleItem(x, y, radius, label));
    }
}
