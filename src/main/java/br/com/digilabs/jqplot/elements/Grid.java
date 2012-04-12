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

import java.io.Serializable;

import br.com.digilabs.jqplot.axis.Axis;

/**
 * Object representing the grid on which the plot is drawn.  The grid in this context is the area bounded by the axes, 
 * the area which will contain the series.  Note, the series are drawn on their own canvas.  
 * The Grid object cannot be instantiated directly, but is created by the Plot oject.  
 * Grid properties can be set or overriden by the options passed in from the user. 
 * 
 * @param <T> Type of {@link Axis}
 * 
 * @author inaiat
 */
public class Grid<T extends Serializable> implements Element {

    private static final long serialVersionUID = 5478580499167992682L;
    private Boolean drawGridLines;
    private String gridLineColer;
    private Double gridLineWidth;
    
    /** The background. */
    private String background;
    private String borderColor;
    private Double borderWidth;
    private Boolean drawBorder;
    private Boolean shadow;
    private Double shadowAngle;
    private Double shadowOffset;
    private Double shadowWidth;
    private Double shadowDepth;
    private String shadowColor;
    private String shadowAlpha;
    private Float left;
    private Float top;
    private Float right;
    private Float bottom;
    private Float width;
    private Float height;
    private Axis<T>[] axis;
    private String[] rendererOptions;

    /**
     * 
     * @return array de Axis
     */
    public Axis<T>[] getAxis() {
        return axis;
    }

    /**
     * Sets the axis.
     *
     * @param axis the new axis
     */
    public void setAxis(Axis<T>[] axis) {
        this.axis = axis;
    }

    /**
     * 
     * @return background
     */
    public String getBackground() {
        return background;
    }

    /**
     * 
     * @param background 
     */
    public void setBackground(String background) {
        this.background = background;
    }

    /**
     * 
     * @return borderColor
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 
     * @param borderColor 
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 
     * @return borderWidth
     */
    public Double getBorderWidth() {
        return borderWidth;
    }

    /**
     * 
     * @param borderWidth 
     */
    public void setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * 
     * @return bottom
     */
    public Float getBottom() {
        return bottom;
    }

    /**
     * 
     * @param bottom 
     */
    public void setBottom(Float bottom) {
        this.bottom = bottom;
    }

    /**
     * 
     * @return drawBorder true ou false
     */
    public Boolean getDrawBorder() {
        return drawBorder;
    }

    /**
     * 
     * @param drawBorder 
     */
    public void setDrawBorder(Boolean drawBorder) {
        this.drawBorder = drawBorder;
    }

    /**
     * 
     * @return drawGridLines true ou false
     */
    public Boolean getDrawGridLines() {
        return drawGridLines;
    }

    /**
     * 
     * @param drawGridLines 
     */
    public void setDrawGridLines(Boolean drawGridLines) {
        this.drawGridLines = drawGridLines;
    }

    /**
     * 
     * @return gridLineColer
     */
    public String getGridLineColer() {
        return gridLineColer;
    }

    /**
     * 
     * @param gridLineColer 
     */
    public void setGridLineColer(String gridLineColer) {
        this.gridLineColer = gridLineColer;
    }

    /**
     * 
     * @return gridLineWidth
     */
    public Double getGridLineWidth() {
        return gridLineWidth;
    }

    /**
     * 
     * @param gridLineWidth 
     */
    public void setGridLineWidth(Double gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
    }

    /**
     * 
     * @return height
     */
    public Float getHeight() {
        return height;
    }

    /**
     * 
     * @param height 
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * 
     * @return left
     */
    public Float getLeft() {
        return left;
    }

    /**
     * 
     * @param left 
     */
    public void setLeft(Float left) {
        this.left = left;
    }

    /**
     * 
     * @return rendererOptions
     */
    public String[] getRendererOptions() {
        return rendererOptions;
    }

    /**
     * 
     * @param rendererOptions 
     */
    public void setRendererOptions(String[] rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    /**
     * 
     * @return right
     */
    public Float getRight() {
        return right;
    }

    /**
     * 
     * @param right 
     */
    public void setRight(Float right) {
        this.right = right;
    }

    /**
     * 
     * @return shadow
     */
    public Boolean getShadow() {
        return shadow;
    }

    /**
     * 
     * @param shadow 
     */
    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    /**
     * 
     * @return shadowAlpha
     */
    public String getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * 
     * @param shadowAlpha 
     */
    public void setShadowAlpha(String shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    /**
     * 
     * @return shadowAngle
     */
    public Double getShadowAngle() {
        return shadowAngle;
    }

    /**
     * 
     * @param shadowAngle 
     */
    public void setShadowAngle(Double shadowAngle) {
        this.shadowAngle = shadowAngle;
    }

    /**
     * 
     * @return shadowColor
     */
    public String getShadowColor() {
        return shadowColor;
    }

    /**
     * 
     * @param shadowColor 
     */
    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * 
     * @return shadowDepth
     */
    public Double getShadowDepth() {
        return shadowDepth;
    }

    /**
     * 
     * @param shadowDepth 
     */
    public void setShadowDepth(Double shadowDepth) {
        this.shadowDepth = shadowDepth;
    }

    /**
     * 
     * @return shadowOffSet
     */
    public Double getShadowOffset() {
        return shadowOffset;
    }

    /**
     * 
     * @param shadowOffset 
     */
    public void setShadowOffset(Double shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    /**
     * 
     * @return shadowWidth
     */
    public Double getShadowWidth() {
        return shadowWidth;
    }

    /**
     * 
     * @param shadowWidth 
     */
    public void setShadowWidth(Double shadowWidth) {
        this.shadowWidth = shadowWidth;
    }

    /**
     * 
     * @return top
     */
    public Float getTop() {
        return top;
    }

    /**
     * 
     * @param top 
     */
    public void setTop(Float top) {
        this.top = top;
    }

    /**
     * 
     * @return width
     */
    public Float getWidth() {
        return width;
    }

    /**
     * 
     * @param width 
     */
    public void setWidth(Float width) {
        this.width = width;
    }
}
