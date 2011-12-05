package br.com.digilabs.jqplot.data.item;

import java.io.Serializable;

/**
 * Representa um item do bubble chart
 * @author inaiat
 */
public class BubbleItem implements Serializable {

	private static final long serialVersionUID = 8361687784430405282L;

	private Float x;
    private Float y;
    private Float radius;
    private String label;

    /**
     * Construtor
     */
    public BubbleItem() {
    }

    /**
     * Construtor
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public BubbleItem(Float x, Float y, Float radius, String label) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.label = label;
    }

    /**
     * Construtor
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public BubbleItem(Integer x, Integer y, Integer radius, String label) {
        this.x = x.floatValue();
        this.y = y.floatValue();
        this.radius = radius.floatValue();
        this.label = label;
    }

    /**
     * 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label 
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * 
     * @return radius
     */
    public Float getRadius() {
        return radius;
    }

    /**
     * 
     * @param radius 
     */
    public void setRadius(Float radius) {
        this.radius = radius;
    }

    /**
     * 
     * @return x
     */
    public Float getX() {
        return x;
    }

    /**
     * 
     * @param x 
     */
    public void setX(Float x) {
        this.x = x;
    }

    /**
     * 
     * @return y
     */
    public Float getY() {
        return y;
    }

    /**
     * 
     * @param y 
     */
    public void setY(Float y) {
        this.y = y;
    }
}
