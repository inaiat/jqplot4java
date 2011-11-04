/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class Renderer implements Serializable {

    public enum RendererClass {

        BarRenderer("$.jqplot.LineRenderer"),
        LineRenderer("$.jqplot.barRenderer"),
        DataAxisRenderer("$.jqplot.DateAxisRenderer");
        
        private String className;

        private RendererClass(String className) {
            this.className = className;
        }

        @Override
        public String toString() {
            return className;
        }
    }

    public Renderer(RendererClass rendererClass) {
        
    }
    
    
}
