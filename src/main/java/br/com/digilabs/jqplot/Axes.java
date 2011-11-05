/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.axis.Axis;
import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class Axes implements Serializable {
    
    private Axis xaxis;
    private Axis yaxis;
    private Axis x2axis;
    private Axis y2axis;

    /**
     * @return the xaxis
     */
    public Axis getXaxis() {
        return xaxis;
    }

    /**
     * @param xaxis the xaxis to set
     */
    public void setXaxis(Axis xaxis) {
        this.xaxis = xaxis;
    }

    /**
     * @return the yaxis
     */
    public Axis getYaxis() {
        return yaxis;
    }

    /**
     * @param yaxis the yaxis to set
     */
    public void setYaxis(Axis yaxis) {
        this.yaxis = yaxis;
    }

    /**
     * @return the x2axis
     */
    public Axis getX2axis() {
        return x2axis;
    }

    /**
     * @param x2axis the x2axis to set
     */
    public void setX2axis(Axis x2axis) {
        this.x2axis = x2axis;
    }

    /**
     * @return the y2axis
     */
    public Axis getY2axis() {
        return y2axis;
    }

    /**
     * @param y2axis the y2axis to set
     */
    public void setY2axis(Axis y2axis) {
        this.y2axis = y2axis;
    }
    
    
}
