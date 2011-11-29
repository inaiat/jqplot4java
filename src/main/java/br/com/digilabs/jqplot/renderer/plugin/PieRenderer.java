package br.com.digilabs.jqplot.renderer.plugin;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.chart.elements.Renderer;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author inaiat
 */
@JqPlotPlugin(values= {JqPlotResources.PieRenderer})
public class PieRenderer implements Renderer {

	private static final long serialVersionUID = 1L;

	public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }
}
