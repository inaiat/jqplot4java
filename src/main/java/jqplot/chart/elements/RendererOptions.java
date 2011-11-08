/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import jqplot.plugin.PieRenderer;

/**
 *
 * @author bernardo.moura
 */
public class RendererOptions {

    private boolean showDataLabels = true;
    private String dataLabels;
    private int sliceMargin = 3;
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
