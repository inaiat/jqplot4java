/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
public class Axe implements Serializable {
    
    private boolean show;
    private Renderer renderer;
    private boolean autoScale;
    private Collection<String> tickOptions;
    private Collection<String> ticks;
    
}
