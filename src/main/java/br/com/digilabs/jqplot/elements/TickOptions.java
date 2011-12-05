package br.com.digilabs.jqplot.elements;

import java.io.Serializable;

/**
 * TickOPtions
 * @author inaiat
 */
public class TickOptions implements Serializable {

    private static final long serialVersionUID = -8139093369426118021L;
    private String formatString;
    private Integer angle;

    /**
     * 
     * @return formatString
     */
    public String getFormatString() {
        return formatString;
    }

    /**
     * 
     * @param formatString 
     */
    public void setFormatString(String formatString) {
        this.formatString = formatString;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    /**
     * @return the angle
     */
    public Integer getAngle() {
        return angle;
    }
}
