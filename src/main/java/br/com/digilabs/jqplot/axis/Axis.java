/*
 * To change this template, choose Tools | Templates
 * angetd open the template in the editor.
 */
package br.com.digilabs.jqplot.axis;

import br.com.digilabs.jqplot.AbstractRenderer;
import br.com.digilabs.jqplot.plugin.PluginClasses;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
public class Axis implements Serializable {
    
    private Boolean show;
    private AbstractRenderer renderer;
    private Boolean autoScale;
    private Collection<String> tickOptions;
    private Collection<String> ticks;
    @XStreamAsAttribute
    private PluginClasses labelRenderer;
    private String label;
    private Float pad;

    /**
     * @return the show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * @return the renderer
     */
    public AbstractRenderer getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(AbstractRenderer renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the autoScale
     */
    public Boolean getAutoScale() {
        return autoScale;
    }

    /**
     * @param autoScale the autoScale to set
     */
    public void setAutoScale(Boolean autoScale) {
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

    /**
     * @return the labelRenderer
     */
    public PluginClasses getLabelRenderer() {
        return labelRenderer;
    }

    /**
     * @param labelRenderer the labelRenderer to set
     */
    public void setLabelRenderer(PluginClasses labelRenderer) {
        this.labelRenderer = labelRenderer;
    }

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
     * @return the pad
     */
    public Float getPad() {
        return pad;
    }

    /**
     * @param pad the pad to set
     */
    public void setPad(Float pad) {
        this.pad = pad;
    }
   
}
