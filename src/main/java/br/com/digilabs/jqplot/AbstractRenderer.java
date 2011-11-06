/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

/**
 *
 * @author inaiat
 */
public abstract class AbstractRenderer implements Renderer {

    @Override
    public String toString() {
        return pluginName();
    }   
    
    
    
//    public enum RendererClass {
//
//        BarRenderer("$.jqplot.LineRenderer"),
//        LineRenderer("$.jqplot.barRenderer"),
//        CategoryAxisRenderer("$.jqplot.barRenderer"),
//        DataAxisRenderer("$.jqplot.CategoryAxisRenderer");
//        
//        private String className;
//
//        private RendererClass(String className) {
//            this.className = className;
//        }
//
//        @Override
//        public String toString() {
//            return className;
//        }
//    }   
//    
//    private RendererClass rendererClass;
//
//    public AbstractRenderer(RendererClass rendererClass) {
//        this.rendererClass = rendererClass;
//    }
//
//    @Override
//    public String toString() {
//        return rendererClass.toString();
//    }
//    
    
}
