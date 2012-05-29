/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Renderer options.
 *
 * @author inaiat
 */
public class RendererOptions implements Element {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3555383297912526665L;
    
    /** The show data labels. */
    private Boolean showDataLabels;
    
    /** The data labels. */
    private String dataLabels;
    
    /** The slice margin. */
    private Integer sliceMargin;
    
    /** The start angle. */
    private Integer startAngle;
    
    /** The bar direction. */
    private String barDirection;
    
    /** The highlight mouse down. */
    private Boolean highlightMouseDown;
    
    /** The bar margi	n. */
    private Integer barMargin;
    
    /** The bubble gradients. */
    private Boolean bubbleGradients;
    
    /** The bubble alpha. */
    private Float bubbleAlpha;
    
    /** The highlight alpha. */
    private Float highlightAlpha;
    
    /** The show lables. */
    private Boolean showLables;
    
    /** The show tick labels. */
    private Boolean showTickLabels;
    
    /** The intervals. */
    private List<Integer> intervals;
    
    /** The interval colors. */
    private List<String> intervalColors;
    
    /** The min. */
    private Integer min;
    
    /** The max. */
    private Integer max;
    
    /** The label. */
    private String label;
    
    /** The label position. */
    private String labelPosition;
    
    /** The label height adjust. */
    private Integer labelHeightAdjust;
    
    /** The interval outer radius. */
    private Integer intervalOuterRadius;
    
    /** The line width. */
    private Integer lineWidth;
    
    /** The fill. */
    private Boolean fill;
    
    /** The smooth. */
    private Boolean smooth;
    
    /** The number rows. */
    private Integer numberRows;
    
    /** The margin top. */
    private String marginTop;
    
    /** The padding. */
    private Integer padding;
    
    /** The animation. */
    private Animation animation;
    
    /** The vary bar color. */
    private Boolean varyBarColor;
    
    /**
     * Smooth.
     *
     * @param smooth the smooth
     * @return the renderer options
     */
    public RendererOptions smooth(Boolean smooth) {
    	this.setSmooth(smooth);
    	return this;
    }
    
    /**
     * Vary bar color.
     *
     * @param varyBarColor the vary bar color
     * @return the renderer options
     */
    public RendererOptions varyBarColor(Boolean varyBarColor) {
    	this.setVaryBarColor(varyBarColor);
    	return this;
    }

    /**
     * Gets the padding.
     *
     * @return padding
     */
    public Integer getPadding() {
        return padding;
    }

    /**
     * Sets the padding.
     *
     * @param padding the new padding
     */
    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    /**
     * Gets the margin top.
     *
     * @return marginTop
     */
    public String getMarginTop() {
        return marginTop;
    }

    /**
     * Sets the margin top.
     *
     * @param marginTop the new margin top
     */
    public void setMarginTop(String marginTop) {
        this.marginTop = marginTop;
    }

    /**
     * Gets the number rows.
     *
     * @return numberRows
     */
    public Integer getNumberRows() {
        return numberRows;
    }

    /**
     * Sets the number rows.
     *
     * @param numberRows the new number rows
     */
    public void setNumberRows(Integer numberRows) {
        this.numberRows = numberRows;
    }

    /**
     * Gets the smooth.
     *
     * @return smooth true ou false
     */
    public Boolean getSmooth() {
        return smooth;
    }

    /**
     * Sets the smooth.
     *
     * @param smooth the new smooth
     */
    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
    }

    /**
     * Gets the fill.
     *
     * @return fill true ou false
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * Sets the fill.
     *
     * @param fill the new fill
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    /**
     * Gets the line width.
     *
     * @return lineWidth
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the line width.
     *
     * @param lineWidth the new line width
     */
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * Gets the interval colors.
     *
     * @return Lista de cores intervalColors
     */
    public List<String> getIntervalColors() {
        if (intervalColors == null) {
            intervalColors = new ArrayList<String>();
        }
        return intervalColors;
    }

    /**
     * Sets the interval colors.
     *
     * @param intervalColors the new interval colors
     */
    public void setIntervalColors(List<String> intervalColors) {
        this.intervalColors = intervalColors;
    }

    /**
     * Gets the intervals.
     *
     * @return lista  de intervalos
     */
    public List<Integer> getIntervals() {
        if (intervals == null) {
            intervals = new ArrayList<Integer>();
        }

        return intervals;
    }

    /**
     * Sets the intervals.
     *
     * @param intervals the new intervals
     */
    public void setIntervals(List<Integer> intervals) {
        this.intervals = intervals;
    }

    /**
     * Gets the interval outer radius.
     *
     * @return intervalOuterRadius
     */
    public Integer getIntervalOuterRadius() {
        return intervalOuterRadius;
    }

    /**
     * Sets the interval outer radius.
     *
     * @param intervalOuterRadius the new interval outer radius
     */
    public void setIntervalOuterRadius(Integer intervalOuterRadius) {
        this.intervalOuterRadius = intervalOuterRadius;
    }

    /**
     * Gets the label.
     *
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets the label height adjust.
     *
     * @return labelHeightAdjust
     */
    public Integer getLabelHeightAdjust() {
        return labelHeightAdjust;
    }

    /**
     * Sets the label height adjust.
     *
     * @param labelHeightAdjust the new label height adjust
     */
    public void setLabelHeightAdjust(Integer labelHeightAdjust) {
        this.labelHeightAdjust = labelHeightAdjust;
    }

    /**
     * Gets the label position.
     *
     * @return laelPosition
     */
    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Sets the label position.
     *
     * @param labelPosition the new label position
     */
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    /**
     * Gets the max.
     *
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    /**
     * Sets the max.
     *
     * @param max the new max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * Gets the min.
     *
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    /**
     * Sets the min.
     *
     * @param min the new min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * Gets the show tick labels.
     *
     * @return showTickLabels
     */
    public Boolean getShowTickLabels() {
        return showTickLabels;
    }

    /**
     * Sets the show tick labels.
     *
     * @param showTickLabels the new show tick labels
     */
    public void setShowTickLabels(Boolean showTickLabels) {
        this.showTickLabels = showTickLabels;
    }

    /**
     * Gets the show lables.
     *
     * @return showLables flag true ou false
     */
    public Boolean getShowLables() {
        return showLables;
    }

    /**
     * Sets the show lables.
     *
     * @param showLables the new show lables
     */
    public void setShowLables(Boolean showLables) {
        this.showLables = showLables;
    }

    /**
     * Gets the bubble alpha.
     *
     * @return bubbleAlpha
     */
    public Float getBubbleAlpha() {
        return bubbleAlpha;
    }

    /**
     * Sets the bubble alpha.
     *
     * @param bubbleAlpha the new bubble alpha
     */
    public void setBubbleAlpha(Float bubbleAlpha) {
        this.bubbleAlpha = bubbleAlpha;
    }

    /**
     * Gets the highlight alpha.
     *
     * @return highLigthAlpha
     */
    public Float getHighlightAlpha() {
        return highlightAlpha;
    }

    /**
     * Sets the highlight alpha.
     *
     * @param highlightAlpha the new highlight alpha
     */
    public void setHighlightAlpha(Float highlightAlpha) {
        this.highlightAlpha = highlightAlpha;
    }

    /**
     * Gets the bubble gradients.
     *
     * @return bubbleGradients
     */
    public Boolean getBubbleGradients() {
        return bubbleGradients;
    }

    /**
     * Sets the bubble gradients.
     *
     * @param bubbleGradients the new bubble gradients
     */
    public void setBubbleGradients(Boolean bubbleGradients) {
        this.bubbleGradients = bubbleGradients;
    }

    /**
     * Gets the bar margin.
     *
     * @return barMargin
     */
    public Integer getBarMargin() {
        return barMargin;
    }

    /**
     * Sets the bar margin.
     *
     * @param barMargin the new bar margin
     */
    public void setBarMargin(Integer barMargin) {
        this.barMargin = barMargin;
    }

    /**
     * Checks if is highlight mouse down.
     *
     * @return highLigthMouseDown
     */
    public Boolean isHighlightMouseDown() {
        return highlightMouseDown;
    }

    /**
     * Sets the highlight mouse down.
     *
     * @param highlightMouseDown the new highlight mouse down
     */
    public void setHighlightMouseDown(Boolean highlightMouseDown) {
        this.highlightMouseDown = highlightMouseDown;
    }

    /**
     * Gets the bar direction.
     *
     * @return barDirection
     */
    public String getBarDirection() {
        return barDirection;
    }

    /**
     * Sets the bar direction.
     *
     * @param barDirection the new bar direction
     */
    public void setBarDirection(String barDirection) {
        this.barDirection = barDirection;
    }

    /**
     * Checks if is fill zero.
     *
     * @return fillZero true ou false
     */
    public Boolean isFillZero() {
        return fillZero;
    }

    /**
     * Sets the fill zero.
     *
     * @param fillZero the new fill zero
     */
    public void setFillZero(Boolean fillZero) {
        this.fillZero = fillZero;
    }
    
    /** The fill zero. */
    private Boolean fillZero;

    /**
     * Gets the show data labels.
     *
     * @return the showDataLabels
     */
    public Boolean getShowDataLabels() {
        return showDataLabels;
    }

    /**
     * Sets the show data labels.
     *
     * @param showDataLabels the showDataLabels to set
     */
    public void setShowDataLabels(Boolean showDataLabels) {
        this.showDataLabels = showDataLabels;
    }

    /**
     * Gets the data labels.
     *
     * @return the dataLabels
     */
    public String getDataLabels() {
        return dataLabels;
    }

    /**
     * Sets the data labels.
     *
     * @param dataLabels the dataLabels to set
     */
    public void setDataLabels(String dataLabels) {
        this.dataLabels = dataLabels;
    }

    /**
     * Gets the slice margin.
     *
     * @return the sliceMargin
     */
    public Integer getSliceMargin() {
        return sliceMargin;
    }

    /**
     * Sets the slice margin.
     *
     * @param sliceMargin the sliceMargin to set
     */
    public void setSliceMargin(Integer sliceMargin) {
        this.sliceMargin = sliceMargin;
    }

    /**
     * Gets the start angle.
     *
     * @return the startAngle
     */
    public Integer getStartAngle() {
        return startAngle;
    }

    /**
     * Sets the start angle.
     *
     * @param startAngle the startAngle to set
     */
    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * Gets the animation.
     *
     * @return the animation
     */
    public Animation getAnimation() {
        return animation;
    }

    /**
     * Sets the animation.
     *
     * @param animation object for setting
     * different animation speed
     */
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

	/**
	 * Gets the vary bar color.
	 *
	 * @return the vary bar color
	 */
	public Boolean getVaryBarColor() {
		return varyBarColor;
	}

	/**
	 * Sets the vary bar color.
	 *
	 * @param varyBarColor the new vary bar color
	 */
	public void setVaryBarColor(Boolean varyBarColor) {
		this.varyBarColor = varyBarColor;
	}
}
