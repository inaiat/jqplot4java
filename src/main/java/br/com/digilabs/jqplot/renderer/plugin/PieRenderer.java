package br.com.digilabs.jqplot.renderer.plugin;

import br.com.digilabs.jqplot.metadata.JqPlotPlugin;
import br.com.digilabs.jqplot.renderer.Renderer;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * Renderizador de uma chart Pie
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.PieRenderer})
public class PieRenderer implements Renderer {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return 
     */
    public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }
}
