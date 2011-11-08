/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import java.io.Serializable;

/**
 *
 * @author bernardo.moura
 */
public class ElemContainer implements Element {
    private Float plotWidth;
    private Float plotHeight;

    public ElemContainer(Float plotWidth, Float plotHeight){
        this.plotWidth = plotWidth;
        this.plotHeight = plotHeight;
    }
    public Float getPlotHeight() {
        return plotHeight;
    }

    public void setPlotHeight(Float plotHeight) {
        this.plotHeight = plotHeight;
    }

    public Float getPlotWidth() {
        return plotWidth;
    }

    public void setPlotWidth(Float plotWidth) {
        this.plotWidth = plotWidth;
    }
    
    public static void createElement(){
    
    }
    
}
