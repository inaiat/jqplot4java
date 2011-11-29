/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.chart.data.LinedData;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values={JqPlotResources.CanvasTextRenderer, JqPlotResources.CategoryAxisRenderer})
public class SimpleLineChart<T extends Number> extends LineChart<LinedData<T>> {

    LinedData<T> data = new LinedData<T>();
    
    public SimpleLineChart() {
        getChartConfiguration().createAxesDefaults().setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().createXAxis().setPad(0F);
        setChartData(data);
    }

    public SimpleLineChart(String title, String labelX, String labelY) {
        this();
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }    
    
    public void addValues(T... values) {
        data.addValues(values);
    }
    
}
