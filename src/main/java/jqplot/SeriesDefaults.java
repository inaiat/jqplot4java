/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import jqplot.plugin.PluginClasses;

/**
 *
 * @author bernardo.moura
 */
public class SeriesDefaults {
    private PluginClasses renderer;
    private RendererOptions rendererOptions = new RendererOptions();

    public PluginClasses getRenderer() {
        return renderer;
    }

    public void setRenderer(PluginClasses renderer) {
        this.renderer = renderer;
    }

    public RendererOptions getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(RendererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
    }
    
    
}
