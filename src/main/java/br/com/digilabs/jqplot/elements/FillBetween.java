package br.com.digilabs.jqplot.elements;

import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class FillBetween implements Serializable {

    private static final long serialVersionUID = 8516029001505871387L;
    private Integer serie1;
    private Integer serie2;
    private String color;
    private Integer baseSeries;
    private Boolean fill;

    /**
     * 
     * @return baseSeries
     */
    public Integer getBaseSeries() {
        return baseSeries;
    }

    /**
     * 
     * @param baseSeries 
     */
    public void setBaseSeries(Integer baseSeries) {
        this.baseSeries = baseSeries;
    }

    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return fill true ou false
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * 
     * @param fill 
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    /**
     * 
     * @return serie1
     */
    public Integer getSerie1() {
        return serie1;
    }

    /**
     * 
     * @param serie1 
     */
    public void setSerie1(Integer serie1) {
        this.serie1 = serie1;
    }

    /**
     * 
     * @return serie2
     */
    public Integer getSerie2() {
        return serie2;
    }

    /**
     * 
     * @param serie2 
     */
    public void setSerie2(Integer serie2) {
        this.serie2 = serie2;
    }
}
