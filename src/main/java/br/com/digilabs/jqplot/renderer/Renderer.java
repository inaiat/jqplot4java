/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.renderer;

import br.com.digilabs.jqplot.elements.Element;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * Classe abstrata que representa um renderer
 * @author inaiat
 */
public interface Renderer extends Element {

    /**
     * 
     * @return 
     */
    public JqPlotResources resource();
}
