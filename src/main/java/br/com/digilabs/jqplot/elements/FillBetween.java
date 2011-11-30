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

    public Integer getBaseSeries() {
        return baseSeries;
    }

    public void setBaseSeries(Integer baseSeries) {
        this.baseSeries = baseSeries;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public Integer getSerie1() {
        return serie1;
    }

    public void setSerie1(Integer serie1) {
        this.serie1 = serie1;
    }

    public Integer getSerie2() {
        return serie2;
    }

    public void setSerie2(Integer serie2) {
        this.serie2 = serie2;
    }
    
}
