/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 *
 * @author inaiat
 */

public class AbstractRenderer implements Renderer {

    @XStreamOmitField
    private final JqPlotClasses clazz;

    public AbstractRenderer(JqPlotClasses clazz) {
        this.clazz = clazz;
    }

    public JqPlotClasses jqplotClass() {
        return clazz;
    }
}
