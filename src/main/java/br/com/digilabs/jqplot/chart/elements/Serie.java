/* To change this template, choose Tools | Templates
/*
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.chart.elements;

import br.com.digilabs.jqplot.JqPlotResources;

/**
 *
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

    public Serie() {
    }

    public Serie(String label) {
        this.label = label;
    }

    public Float getShadowAlpha() {
        return shadowAlpha;
    }

    public void setShadowAlpha(Float shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    public Boolean getShowAlpha() {
        return showAlpha;
    }

    public void setShowAlpha(Boolean showAlpha) {
        this.showAlpha = showAlpha;
    }

    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    public Boolean getShowMarker() {
        return showMarker;
    }

    public void setShowMarker(Boolean showMarker) {
        this.showMarker = showMarker;
    }

    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

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
