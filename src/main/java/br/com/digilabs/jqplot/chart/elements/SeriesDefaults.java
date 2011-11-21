/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart.elements;

/**
 *
 * @author bernardo.moura
 */
public class SeriesDefaults extends Serie {

    private static final long serialVersionUID = -7921968769382552293L;
    private PointLabels pointLabels;

    public PointLabels getPointLabels() {
        return pointLabels;
    }

    public void setPointLabels(PointLabels pointLabels) {
        this.pointLabels = pointLabels;
    }
}
