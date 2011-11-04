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
public class Series implements Serializable {
   
    private String label;
    
    private String renderer;    

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
    
    
   
}
