/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.chart.data;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author bernardo.moura
 */                                 
public interface Chart<T> extends Serializable {
    
    Collection<T> getData();    
}
