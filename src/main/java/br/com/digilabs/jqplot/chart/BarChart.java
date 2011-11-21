package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.chart.config.ChartConfiguration;
import br.com.digilabs.jqplot.chart.data.ChartData;
import br.com.digilabs.jqplot.chart.elements.Legend;
import br.com.digilabs.jqplot.chart.elements.RendererOptions;
import br.com.digilabs.jqplot.chart.elements.Serie;
import br.com.digilabs.jqplot.chart.elements.SeriesDefaults;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author bernardo.moura
 */
public class BarChart<T extends ChartData<?>> extends DefaultChart<T> {

    private static final long serialVersionUID = -8122703368130701972L;
    
    public BarChart() {

        initialize(null, null, null);

    }

    public BarChart(String title, String labelX, String labelY) {
        this();
        initialize(title, labelX, labelY);
    }

    protected final void initialize(String title, String labelX, String labelY) {
        ChartConfiguration chartConfiguration = getChartConfiguration();
        SeriesDefaults sd = new SeriesDefaults();
        RendererOptions ro = new RendererOptions();

        ro.setFillZero(true);

        sd.setRenderer(JqPlotResources.BarRenderer);
        sd.setRendererOptions(ro);
        chartConfiguration.setSeriesDefaults(sd);

        Legend legend = new Legend();
        legend.setShow(true);
        legend.setPlacment("outsideGrid");
        chartConfiguration.setLegend(legend);
        chartConfiguration.setLabelX(labelX);
        chartConfiguration.setLabelY(labelY);

        
        XAxis xAxis = getChartConfiguration().createXAxis();
        xAxis.setRenderer(JqPlotResources.CategoryAxisRenderer);
        
        YAxis yAxis = getChartConfiguration().createYAxis();
        
    }
    
    
    
    
}
