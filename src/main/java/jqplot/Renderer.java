/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.io.Serializable;
import jqplot.plugin.PluginClasses;

/**
 *
 * @author inaiat
 */
public interface Renderer extends Serializable {
   public PluginClasses pluginClass();
}
