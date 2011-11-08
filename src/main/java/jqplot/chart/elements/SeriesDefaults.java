/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import java.io.Serializable;
import jqplot.JqPlotClasses;

/**
 *
 * @author bernardo.moura
 */
public class SeriesDefaults implements Element {
    private JqPlotClasses renderer;
    private RendererOptions rendererOptions = new RendererOptions();

    public JqPlotClasses getRenderer() {
        return renderer;
    }

    public void setRenderer(JqPlotClasses renderer) {
        this.renderer = renderer;
    }

    public RendererOptions getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(RendererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
    }
    
    
}
