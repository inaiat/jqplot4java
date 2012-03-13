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
 * Renderer options
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
    private Integer lineWidth;
    private Boolean fill;
    private Boolean smooth;
    private Integer numberRows;
    private String marginTop;
    private Integer padding;
    private Boolean varyBarColor;
    
    public RendererOptions smooth(Boolean smooth) {
    	this.setSmooth(smooth);
    	return this;
    }
    
    public RendererOptions varyBarColor(Boolean varyBarColor) {
    	this.setVaryBarColor(varyBarColor);
    	return this;
    }

    /**
     * 
     * @return padding
     */
    public Integer getPadding() {
        return padding;
    }

    /**
     * 
     * @param padding 
     */
    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    /**
     * 
     * @return marginTop
     */
    public String getMarginTop() {
        return marginTop;
    }

    /**
     * 
     * @param marginTop 
     */
    public void setMarginTop(String marginTop) {
        this.marginTop = marginTop;
    }

    /**
     * 
     * @return numberRows
     */
    public Integer getNumberRows() {
        return numberRows;
    }

    /**
     * 
     * @param numberRows 
     */
    public void setNumberRows(Integer numberRows) {
        this.numberRows = numberRows;
    }

    /**
     * 
     * @return smooth true ou false
     */
    public Boolean getSmooth() {
        return smooth;
    }

    /**
     * 
     * @param smooth 
     */
    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
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
     * @return lineWidth
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * 
     * @param lineWidth 
     */
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
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
     * 
     * @param intervalColors 
     */
    public void setIntervalColors(List<String> intervalColors) {
        this.intervalColors = intervalColors;
    }

    /**
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
     * 
     * @param intervals 
     */
    public void setIntervals(List<Integer> intervals) {
        this.intervals = intervals;
    }

    /**
     * 
     * @return intervalOuterRadius
     */
    public Integer getIntervalOuterRadius() {
        return intervalOuterRadius;
    }

    /**
     * 
     * @param intervalOuterRadius 
     */
    public void setIntervalOuterRadius(Integer intervalOuterRadius) {
        this.intervalOuterRadius = intervalOuterRadius;
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
     * @return labelHeightAdjust
     */
    public Integer getLabelHeightAdjust() {
        return labelHeightAdjust;
    }

    /**
     * 
     * @param labelHeightAdjust 
     */
    public void setLabelHeightAdjust(Integer labelHeightAdjust) {
        this.labelHeightAdjust = labelHeightAdjust;
    }

    /**
     * 
     * @return laelPosition
     */
    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition 
     */
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    /**
     * 
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    /**
     * 
     * @param max 
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    /**
     * 
     * @param min 
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * 
     * @return showTickLabels
     */
    public Boolean getShowTickLabels() {
        return showTickLabels;
    }

    /**
     * 
     * @param showTickLabels 
     */
    public void setShowTickLabels(Boolean showTickLabels) {
        this.showTickLabels = showTickLabels;
    }

    /**
     * 
     * @return showLables flag true ou false
     */
    public Boolean getShowLables() {
        return showLables;
    }

    /**
     * 
     * @param showLables 
     */
    public void setShowLables(Boolean showLables) {
        this.showLables = showLables;
    }

    /**
     * 
     * @return bubbleAlpha
     */
    public Float getBubbleAlpha() {
        return bubbleAlpha;
    }

    /**
     * 
     * @param bubbleAlpha 
     */
    public void setBubbleAlpha(Float bubbleAlpha) {
        this.bubbleAlpha = bubbleAlpha;
    }

    /**
     * 
     * @return highLigthAlpha
     */
    public Float getHighlightAlpha() {
        return highlightAlpha;
    }

    /**
     * 
     * @param highlightAlpha 
     */
    public void setHighlightAlpha(Float highlightAlpha) {
        this.highlightAlpha = highlightAlpha;
    }

    /**
     * 
     * @return bubbleGradients
     */
    public Boolean getBubbleGradients() {
        return bubbleGradients;
    }

    /**
     * 
     * @param bubbleGradients 
     */
    public void setBubbleGradients(Boolean bubbleGradients) {
        this.bubbleGradients = bubbleGradients;
    }

    /**
     * 
     * @return barMargin
     */
    public Integer getBarMargin() {
        return barMargin;
    }

    /**
     * 
     * @param barMargin 
     */
    public void setBarMargin(Integer barMargin) {
        this.barMargin = barMargin;
    }

    /**
     * 
     * @return highLigthMouseDown
     */
    public Boolean isHighlightMouseDown() {
        return highlightMouseDown;
    }

    /**
     * 
     * @param highlightMouseDown 
     */
    public void setHighlightMouseDown(Boolean highlightMouseDown) {
        this.highlightMouseDown = highlightMouseDown;
    }

    /**
     * 
     * @return barDirection
     */
    public String getBarDirection() {
        return barDirection;
    }

    /**
     * 
     * @param barDirection 
     */
    public void setBarDirection(String barDirection) {
        this.barDirection = barDirection;
    }

    /**
     * 
     * @return fillZero true ou false
     */
    public Boolean isFillZero() {
        return fillZero;
    }

    /**
     * 
     * @param fillZero 
     */
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

	public Boolean getVaryBarColor() {
		return varyBarColor;
	}

	public void setVaryBarColor(Boolean varyBarColor) {
		this.varyBarColor = varyBarColor;
	}
}
