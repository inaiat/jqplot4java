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

import br.com.digilabs.jqplot.JqPlotResources;

/**
 * Representa uma serie
 * @author inaiat
 */
public class Serie implements Element {

    private static final long serialVersionUID = 7138260563176853708L;
    private String label;
    private JqPlotResources renderer;
    private RendererOptions rendererOptions;
    private Boolean fill;
    private Integer lineWidth;
    private MarkerOptions markerOptions;
    private Boolean showMarker;
    private Boolean showAlpha;
    private Boolean shadow;
    private Float shadowAlpha;

    /**
     * Construtor
     */
    public Serie() {
    }

    /**
     * 
     * @param label 
     */
    public Serie(String label) {
        this.label = label;
    }

    /**
     * 
     * @return shadowAlpha
     */
    public Float getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * 
     * @param shadowAlpha 
     */
    public void setShadowAlpha(Float shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    /**
     * 
     * @return showAlpha true ou false
     */
    public Boolean getShowAlpha() {
        return showAlpha;
    }

    /**
     * 
     * @param showAlpha 
     */
    public void setShowAlpha(Boolean showAlpha) {
        this.showAlpha = showAlpha;
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
     * @return 
     */
    public Boolean getShowMarker() {
        return showMarker;
    }

    /**
     * 
     * @param showMarker 
     */
    public void setShowMarker(Boolean showMarker) {
        this.showMarker = showMarker;
    }
    
    /**
     * 
     * @return 
     */
    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    /**
     * 
     * @param markerOptions 
     */
    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
    }

    /**
     * 
     * @return 
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
     * @return 
     */
    public RendererOptions getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(RendererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the renderer
     */
    public JqPlotResources getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(JqPlotResources renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the fill
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * @param fill the fill to set
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }
}
