/* To change this template, choose Tools | Templates
/*
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import jqplot.JqPlotClasses;

/**
 *
 * @author inaiat
 */
public class Serie implements Element {

    private String label;
    private JqPlotClasses renderer;
    private RendererOptions rendererOptions = new RendererOptions();

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
    public JqPlotClasses getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(JqPlotClasses renderer) {
        this.renderer = renderer;
    }
}
