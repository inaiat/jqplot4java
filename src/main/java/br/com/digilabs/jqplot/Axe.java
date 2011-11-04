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

    /**
     * @return the show
     */
    public boolean isShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(boolean show) {
        this.show = show;
    }

    /**
     * @return the renderer
     */
    public Renderer getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the autoScale
     */
    public boolean isAutoScale() {
        return autoScale;
    }

    /**
     * @param autoScale the autoScale to set
     */
    public void setAutoScale(boolean autoScale) {
        this.autoScale = autoScale;
    }

    /**
     * @return the tickOptions
     */
    public Collection<String> getTickOptions() {
        return tickOptions;
    }

    /**
     * @param tickOptions the tickOptions to set
     */
    public void setTickOptions(Collection<String> tickOptions) {
        this.tickOptions = tickOptions;
    }

    /**
     * @return the ticks
     */
    public Collection<String> getTicks() {
        return ticks;
    }

    /**
     * @param ticks the ticks to set
     */
    public void setTicks(Collection<String> ticks) {
        this.ticks = ticks;
    }
    
}
