/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import java.io.Serializable;
import jqplot.JqPlotClasses;

/**
 *
 * @author inaiat
 */
public class Serie implements Element {

    private String label;
    private JqPlotClasses renderer;

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
