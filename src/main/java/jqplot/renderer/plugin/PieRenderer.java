package jqplot.renderer.plugin;

import jqplot.JqPlotResources;
import jqplot.chart.elements.Renderer;
import jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author bernardo.moura
 */
@JqPlotPlugin(values= {JqPlotResources.PieRenderer})
public class PieRenderer implements Renderer {

	private static final long serialVersionUID = 1L;

	public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }
}
