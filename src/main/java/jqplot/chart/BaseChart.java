/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import java.io.Serializable;
import jqplot.chart.elements.SeriesDefaults;

/**
 *
 * @author bernardo.moura
 */
public class BaseChart implements Serializable {

    private SeriesDefaults seriesDefaults;

    public SeriesDefaults getSeriesDefaults() {
        return seriesDefaults;
    }

    public void setSeriesDefaults(SeriesDefaults seriesDefaults) {
        this.seriesDefaults = seriesDefaults;
    }
}
