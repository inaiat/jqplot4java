/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.elements;


/**
 * A 'tick' object showing the value of a tick/gridline on the plot.
 * 
 * @author inaiat
 */
public class TickOptions implements Element {

    private static final long serialVersionUID = -8139093369426118021L;
    private String formatString;
    private Integer angle;
    private String labelPosition;
    

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

    /**
     * 
     * @return the labelPosition
     */
    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * 
     * @param labelPosition to set
     */
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }
}
