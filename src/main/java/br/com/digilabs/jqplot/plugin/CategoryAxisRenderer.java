/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.plugin;

import br.com.digilabs.jqplot.AbstractRenderer;

/**
 *
 * @author inaiat
 */
public class CategoryAxisRenderer extends AbstractRenderer {

    public static final String PLUGIN_NAME = "$.jqplot.CategoryAxisRenderer";
    
    private Boolean sortMergedLabels;
    private AbstractRenderer tickRenderer;
    
    /**
     * @return the sortMergedLabels
     */
    public Boolean getSortMergedLabels() {
        return sortMergedLabels;
    }

    /**
     * @param sortMergedLabels the sortMergedLabels to set
     */
    public void setSortMergedLabels(Boolean sortMergedLabels) {
        this.sortMergedLabels = sortMergedLabels;
    }

    /**
     * @return the tickRenderer
     */
    public AbstractRenderer getTickRenderer() {
        return tickRenderer;
    }

    /**
     * @param tickRenderer the tickRenderer to set
     */
    public void setTickRenderer(AbstractRenderer tickRenderer) {
        this.tickRenderer = tickRenderer;
    }

    public String pluginName() {
        return PLUGIN_NAME;
    }
    
}
