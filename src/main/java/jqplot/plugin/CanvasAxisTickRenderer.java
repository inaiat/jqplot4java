/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.plugin;

import jqplot.Renderer;

/**
 *
 * @author inaiat
 */
public class CanvasAxisTickRenderer implements Renderer {
    
    private String mark;
    private Boolean showMark;
    private Boolean showGridline;
    private Boolean isMinorTick;
    private Float angle;
    private Integer markSize;
    private Boolean show;
    private String labelPosition;
    private PluginClasses formatter;
    private String formatString;
    private String prefix;
    

    public PluginClasses pluginClass() {
        return PluginClasses.CategoryAxisRenderer;
    }
    
}
