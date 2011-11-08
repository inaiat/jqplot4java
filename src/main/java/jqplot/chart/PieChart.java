/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotClasses;
import jqplot.chart.elements.Legend;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author bernardo.moura
 */
public class PieChart extends BaseChart {
    private Legend legend;
    private SeriesDefaults seriesDefaults = new SeriesDefaults();
        
    public PieChart(){
        legend = new Legend(true, "e");
        seriesDefaults.setRenderer(JqPlotClasses.PieRenderer);
    }
    
    public JqPlotClasses getRenderer(){
        return seriesDefaults.getRenderer();
    }
    public void setRenderer(JqPlotClasses renderer){
        seriesDefaults.setRenderer(renderer);
    }
    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public SeriesDefaults getSeriesDefaults() {
        return seriesDefaults;
    }

    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        this.seriesDefaults = seriesDefaults;
    }
    
}
