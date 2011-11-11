/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart;

import jqplot.JqPlotClasses;
import jqplot.chart.data.LinedData;

/**
 *
 * @author inaiat
 */
public class LineChart<N extends Number> extends LinedData<N> {    

    public LineChart() {
        createAxesDefaults().setLabelRenderer(JqPlotClasses.CanvasAxisLabelRenderer);
        createXAxis().setPad(0F);
    }

    public LineChart(String title, String labelX, String labelY) {
        this();
        setLabelX(labelX);
        setLabelY(labelY);
    }  
}
