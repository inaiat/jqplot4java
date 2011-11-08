/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.elements;

/**
 *
 * @author bernardo.moura
 */
public class RendererOptions implements Element {

    private boolean showDataLabels;
    private String dataLabels;
    private int sliceMargin;
    private int startAngle;

    public String getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(String dataLabels) {
        this.dataLabels = dataLabels;
    }

    public void setStartAngle(int startAngle) {
        this.startAngle = startAngle;
    }

    public int getStartAngle() {
        return startAngle;
    }

    public int getSliceMargin() {
        return sliceMargin;
    }

    public void setSliceMargin(int sliceMargin) {
        this.sliceMargin = sliceMargin;
    }

    public boolean isShowDataLabels() {
        return showDataLabels;
    }

    public void setShowDataLabels(boolean showDataLabels) {
        this.showDataLabels = showDataLabels;
    }
}
