package br.com.digilabs.jqplot.renderer.plugin;

import br.com.digilabs.jqplot.renderer.Renderer;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * Renderizador de um chart Donut
 * @author inaiat
 */
public class DonutRenderer implements Renderer {

    private static final long serialVersionUID = -3572013159602499333L;

    public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }
}
