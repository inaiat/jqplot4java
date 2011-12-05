package br.com.digilabs.jqplot.elements;

import java.io.Serializable;

/**
 * Marquer options
 * 
 * @author inaiat
 */
public class MarkerOptions implements Serializable {

    private static final long serialVersionUID = 3501054776797812489L;
    private String style;

    /**
     * 
     * @return style
     */
    public String getStyle() {
        return style;
    }

    /**
     * 
     * @param style 
     */
    public void setStyle(String style) {
        this.style = style;
    }
}
