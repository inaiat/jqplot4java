package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.data.BubbleData;
import br.com.digilabs.jqplot.data.item.BubbleItem;
import br.com.digilabs.jqplot.elements.RendererOptions;
import br.com.digilabs.jqplot.elements.SeriesDefaults;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.BubbleRenderer})
public class BubbleChart extends AbstractChart<BubbleData<BubbleItem>> {

    private static final long serialVersionUID = -8122703368130701972L;
    
    private BubbleData<BubbleItem> bubbleData = new BubbleData<BubbleItem>();

    /**
     * Construtor
     */
    public BubbleChart() {
        initialize(null);
    }

    /**
     * Construtor
     * @param title 
     */
    public BubbleChart(String title) {
        initialize(title);
    }

    /**
     * Inicialização
     * @param title 
     */
    protected final void initialize(String title) {
        ChartConfiguration chartConfiguration = getChartConfiguration();
        chartConfiguration.setTitle(new Title(title));
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();
        sd.setRenderer(JqPlotResources.BubbleRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);
    }

    /**
     * 
     * @return chartData
     */
    public BubbleData<BubbleItem> getChartData() {
        return bubbleData;
    }
    
    /**
     * 
     * @param item 
     */
    public void addValue(BubbleItem item) {
        bubbleData.addValue(item);
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public void addValue(Float x, Float y, Float radius, String label) {
        bubbleData.addValue(new BubbleItem(x, y, radius, label));
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public void addValue(Integer x, Integer y, Integer radius, String label) {
        bubbleData.addValue(new BubbleItem(x, y, radius, label));
    }
}
