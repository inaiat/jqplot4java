/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import com.thoughtworks.xstream.annotations.XStreamOmitField;
import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public interface Renderer extends Serializable {

    public JqPlotClasses jqplotClass();
}
