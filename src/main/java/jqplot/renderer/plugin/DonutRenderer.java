package jqplot.renderer.plugin;

import jqplot.JqPlotResources;
import jqplot.chart.elements.Renderer;
import jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author bernardo.moura
 */
public class DonutRenderer implements Renderer {

	private static final long serialVersionUID = -3572013159602499333L;

	public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }

}
