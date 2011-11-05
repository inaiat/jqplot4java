/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.plugin;

import br.com.digilabs.jqplot.Renderer;

/**
 *
 * @author inaiat
 */
public enum Plugin {

    BarRenderer(BarRenderer.class);
    //LineRenderer("$.jqplot.barRenderer"),
    //CategoryAxisRenderer("$.jqplot.barRenderer"),
    //DataAxisRenderer("$.jqplot.CategoryAxisRenderer");
    private Class<? extends Renderer> className;

    private Plugin(Class<? extends Renderer> className) {
        this.className = className;
    }

    public Renderer get() throws IllegalAccessException, InstantiationException {
        return className.newInstance();
    }
}
