/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart.elements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inaiat
 */
public class RendererOptions implements Element {

    private static final long serialVersionUID = -3555383297912526665L;
    private Boolean showDataLabels;
    private String dataLabels;
    private Integer sliceMargin;
    private Integer startAngle;
    private String barDirection;
    private Boolean highlightMouseDown;
    private Integer barMargin;
    private Boolean bubbleGradients;
    private Float bubbleAlpha;
    private Float highlightAlpha;
    private Boolean showLables;
    private Boolean showTickLabels;
    private List<Integer> intervals;
    private List<String> intervalColors;
    private Integer min;
    private Integer max;
    private String label;
    private String labelPosition;
    private Integer labelHeightAdjust;
    private Integer intervalOuterRadius;

    public List<String> getIntervalColors() {
        if(intervalColors == null){
            intervalColors = new ArrayList<String> ();
        }
        return intervalColors;
    }

    public void setIntervalColors(List<String> intervalColors) {
        this.intervalColors = intervalColors;
    }

    public List<Integer> getIntervals() {
        if(intervals  == null){
            intervals = new ArrayList<Integer> ();
        }

        return intervals;
    }

    public void setIntervals(List<Integer> intervals) {
        this.intervals = intervals;
    }

    public Integer getIntervalOuterRadius() {
        return intervalOuterRadius;
    }

    public void setIntervalOuterRadius(Integer intervalOuterRadius) {
        this.intervalOuterRadius = intervalOuterRadius;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getLabelHeightAdjust() {
        return labelHeightAdjust;
    }

    public void setLabelHeightAdjust(Integer labelHeightAdjust) {
        this.labelHeightAdjust = labelHeightAdjust;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Boolean getShowTickLabels() {
        return showTickLabels;
    }

    public void setShowTickLabels(Boolean showTickLabels) {
        this.showTickLabels = showTickLabels;
    }

    public Boolean getShowLables() {
        return showLables;
    }

    public void setShowLables(Boolean showLables) {
        this.showLables = showLables;
    }

    public Float getBubbleAlpha() {
        return bubbleAlpha;
    }

    public void setBubbleAlpha(Float bubbleAlpha) {
        this.bubbleAlpha = bubbleAlpha;
    }

    public Float getHighlightAlpha() {
        return highlightAlpha;
    }

    public void setHighlightAlpha(Float highlightAlpha) {
        this.highlightAlpha = highlightAlpha;
    }

    public Boolean getBubbleGradients() {
        return bubbleGradients;
    }

    public void setBubbleGradients(Boolean bubbleGradients) {
        this.bubbleGradients = bubbleGradients;
    }

    public Integer getBarMargin() {
        return barMargin;
    }

    public void setBarMargin(Integer barMargin) {
        this.barMargin = barMargin;
    }

    public Boolean isHighlightMouseDown() {
        return highlightMouseDown;
    }

    public void setHighlightMouseDown(Boolean highlightMouseDown) {
        this.highlightMouseDown = highlightMouseDown;
    }

    public String getBarDirection() {
        return barDirection;
    }

    public void setBarDirection(String barDirection) {
        this.barDirection = barDirection;
    }

    public Boolean isFillZero() {
        return fillZero;
    }

    public void setFillZero(Boolean fillZero) {
        this.fillZero = fillZero;
    }
    private Boolean fillZero;

    /**
     * @return the showDataLabels
     */
    public Boolean getShowDataLabels() {
        return showDataLabels;
    }

    /**
     * @param showDataLabels the showDataLabels to set
     */
    public void setShowDataLabels(Boolean showDataLabels) {
        this.showDataLabels = showDataLabels;
    }

    /**
     * @return the dataLabels
     */
    public String getDataLabels() {
        return dataLabels;
    }

    /**
     * @param dataLabels the dataLabels to set
     */
    public void setDataLabels(String dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * @return the sliceMargin
     */
    public Integer getSliceMargin() {
        return sliceMargin;
    }

    /**
     * @param sliceMargin the sliceMargin to set
     */
    public void setSliceMargin(Integer sliceMargin) {
        this.sliceMargin = sliceMargin;
    }

    /**
     * @return the startAngle
     */
    public Integer getStartAngle() {
        return startAngle;
    }

    /**
     * @param startAngle the startAngle to set
     */
    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }
}
