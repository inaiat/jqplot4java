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

import br.com.digilabs.jqplot.JqPlotResources;

/**
 * Marquer options
 * 
 * @author inaiat
 */
public class MarkerOptions implements Serializable {

    private static final long serialVersionUID = 3501054776797812489L;
    private Boolean show;
    private String style;
    private Integer lineWidth;
    private Float size;
    private String color;
    private Boolean shadow;
    private Float shadowAngle;
    private Integer shadowOffset;
    private Integer shadowDepth;
    private String shadowAlpha;
    private JqPlotResources shadowRenderer;
    private JqPlotResources shapeRenderer;
    
    public MarkerOptions() {
	}   

    
    public MarkerOptions style(String style) {
    	this.style = style;
    	return this;
    }
    
    public MarkerOptions size(Float size) {
    	this.size = size;
    	return this;
    }
  
    public MarkerOptions lineWidth(Integer lineWidth) {
    	this.lineWidth = lineWidth;
    	return this;
    }
    
    public MarkerOptions show(Boolean show) {
    	this.show = show;
    	return this;
    }    

    /**
     * 
     * @return style
     */
    public String getStyle() {
        return style;
    }

    /**
     * 
     * @param style 
     */
    public void setStyle(String style) {
        this.style = style;
    }

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public Integer getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Integer lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getShadow() {
		return shadow;
	}

	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	public Float getShadowAngle() {
		return shadowAngle;
	}

	public void setShadowAngle(Float shadowAngle) {
		this.shadowAngle = shadowAngle;
	}

	public Integer getShadowOffset() {
		return shadowOffset;
	}

	public void setShadowOffset(Integer shadowOffset) {
		this.shadowOffset = shadowOffset;
	}

	public Integer getShadowDepth() {
		return shadowDepth;
	}

	public void setShadowDepth(Integer shadowDepth) {
		this.shadowDepth = shadowDepth;
	}

	public String getShadowAlpha() {
		return shadowAlpha;
	}

	public void setShadowAlpha(String shadowAlpha) {
		this.shadowAlpha = shadowAlpha;
	}

	public JqPlotResources getShadowRenderer() {
		return shadowRenderer;
	}

	public void setShadowRenderer(JqPlotResources shadowRenderer) {
		this.shadowRenderer = shadowRenderer;
	}

	public JqPlotResources getShapeRenderer() {
		return shapeRenderer;
	}

	public void setShapeRenderer(JqPlotResources shapeRenderer) {
		this.shapeRenderer = shapeRenderer;
	}    
    
}
