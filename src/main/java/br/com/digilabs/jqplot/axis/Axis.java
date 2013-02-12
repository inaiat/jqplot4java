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
package br.com.digilabs.jqplot.axis;

import java.io.Serializable;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.elements.TickOptions;

/**
 * An individual axis object. Cannot be instantiated directly, but created by
 * the Plot oject. Axis properties can be set or overriden by the options passed
 * in from the user.
 * 
 * @see http://www.jqplot.com/docs/files/jqplot-core-js.html#Axis
 * 
 * @param <T>
 *            type of Axis, can be String, Number, Date, etc. This is necessary
 *            because min,max and tickInterval can be variants types.
 * 
 * @author inaiat
 */
public class Axis<T extends Serializable> implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5426777530263336010L;

    /** The show. */
    private Boolean show;

    /** The renderer. */
    private JqPlotResources renderer;

    /** The auto scale. */
    private Boolean autoScale;

    /** The tick options. */
    private TickOptions tickOptions;

    /** The ticks. */
    private String[] ticks;

    /** The label renderer. */
    private JqPlotResources labelRenderer;

    /** The tick renderer. */
    private JqPlotResources tickRenderer;

    /** The label. */
    private String label;

    /** The pad. */
    private Float pad;

    /** The pad min. */
    private Float padMin;

    /** The pad max. */
    private Float padMax;

    /** The min. */
    private T min;

    /** The max. */
    private T max;

    /** The tick interval. */
    private T tickInterval;

    /**
     * Gets the tick interval.
     * 
     * @return the tick interval
     */
    public T getTickInterval() {
	return tickInterval;
    }

    /**
     * Sets the tick interval.
     * 
     * @param tickInterval
     *            the new tick interval
     */
    public void setTickInterval(T tickInterval) {
	this.tickInterval = tickInterval;
    }

    /**
     * Gets the pad min.
     * 
     * @return the pad min
     */
    public Float getPadMin() {
	return padMin;
    }

    /**
     * Sets the pad min.
     * 
     * @param padMin
     *            the new pad min
     */
    public void setPadMin(Float padMin) {
	this.padMin = padMin;
    }

    /**
     * Gets the pad max.
     * 
     * @return the pad max
     */
    public Float getPadMax() {
	return padMax;
    }

    /**
     * Sets the pad max.
     * 
     * @param padMax
     *            the new pad max
     */
    public void setPadMax(Float padMax) {
	this.padMax = padMax;
    }

    /**
     * Gets the show.
     * 
     * @return the show
     */
    public Boolean getShow() {
	return show;
    }

    /**
     * Sets the show.
     * 
     * @param show
     *            the show to set
     */
    public void setShow(Boolean show) {
	this.show = show;
    }

    /**
     * Gets the auto scale.
     * 
     * @return the autoScale
     */
    public Boolean getAutoScale() {
	return autoScale;
    }

    /**
     * Sets the auto scale.
     * 
     * @param autoScale
     *            the autoScale to set
     */
    public void setAutoScale(Boolean autoScale) {
	this.autoScale = autoScale;
    }

    /**
     * Gets the tick options.
     * 
     * @return the tickOptions
     */
    public TickOptions getTickOptions() {
	return tickOptions;
    }

    /**
     * Sets the tick options.
     * 
     * @param tickOptions
     *            the tickOptions to set
     */
    public void setTickOptions(TickOptions tickOptions) {
	this.tickOptions = tickOptions;
    }

    /**
     * Gets the label renderer.
     * 
     * @return the labelRenderer
     */
    public JqPlotResources getLabelRenderer() {
	return labelRenderer;
    }

    /**
     * Sets the label renderer.
     * 
     * @param labelRenderer
     *            the labelRenderer to set
     */
    public void setLabelRenderer(JqPlotResources labelRenderer) {
	this.labelRenderer = labelRenderer;
    }

    /**
     * Gets the tick renderer.
     * 
     * @return the tickRenderer
     */
    public JqPlotResources getTickRenderer() {
	return tickRenderer;
    }

    /**
     * Sets the tick renderer.
     * 
     * @param tickRenderer
     *            the tickRenderer to set
     */
    public void setTickRenderer(JqPlotResources tickRenderer) {
	this.tickRenderer = tickRenderer;
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
	return label;
    }

    /**
     * Sets the label.
     * 
     * @param label
     *            the label to set
     */
    public void setLabel(String label) {
	this.label = label;
    }

    /**
     * Gets the pad.
     * 
     * @return the pad
     */
    public Float getPad() {
	return pad;
    }

    /**
     * Sets the pad.
     * 
     * @param pad
     *            the pad to set
     */
    public void setPad(Float pad) {
	this.pad = pad;
    }

    /**
     * Gets the renderer.
     * 
     * @return the renderer
     */
    public JqPlotResources getRenderer() {
	return renderer;
    }

    /**
     * Sets the renderer.
     * 
     * @param renderer
     *            the renderer to set
     */
    public void setRenderer(JqPlotResources renderer) {
	this.renderer = renderer;
    }

    /**
     * Gets the ticks.
     * 
     * @return the ticks
     */
    public String[] getTicks() {
	return ticks;
    }
    
    /**
     * Sets the ticks.
     * 
     * @param ticks
     *            the ticks to set
     */
    public void setTicks(String... ticks) {
	this.ticks = ticks;
    }

    /**
     * Gets the min.
     * 
     * @return the min
     */
    public T getMin() {
	return min;
    }

    /**
     * Sets the min.
     * 
     * @param min
     *            the new min
     */
    public void setMin(T min) {
	this.min = min;
    }

    /**
     * Gets the max.
     * 
     * @return the max
     */
    public T getMax() {
	return max;
    }

    /**
     * Sets the max.
     * 
     * @param max
     *            the new max
     */
    public void setMax(T max) {
	this.max = max;
    }

}
