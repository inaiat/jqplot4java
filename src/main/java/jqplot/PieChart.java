/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import jqplot.plugin.PluginClasses;

/**
 *
 * @author bernardo.moura
 */
public class PieChart {
    private Legend legend;
    private SeriesDefaults seriesDefaults = new SeriesDefaults();
        
    public PieChart(){
        legend = new Legend(true, "e");
        seriesDefaults.setRenderer(PluginClasses.PieRenderer);
    }
    
    public PluginClasses getRenderer(){
        return seriesDefaults.getRenderer();
    }
    public void setRenderer(PluginClasses renderer){
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
