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

import br.com.digilabs.jqplot.axis.X2Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.Y2Axis;
import br.com.digilabs.jqplot.axis.YAxis;

/**
 * Representa as coordenadas de uma Axis
 * @author inaiat
 */
public class Axes implements Element {

    private static final long serialVersionUID = -1464182411022493685L;
    private XAxis xaxis;
    private YAxis yaxis;
    private X2Axis x2axis;
    private Y2Axis y2axis;

    /**
     * @return the xaxis
     */
    public XAxis getXaxis() {
        return xaxis;
    }

    /**
     * @param xaxis the xaxis to set
     */
    public void setXaxis(XAxis xaxis) {
        this.xaxis = xaxis;
    }

    /**
     * @return the yaxis
     */
    public YAxis getYaxis() {
        return yaxis;
    }

    /**
     * @param yaxis the yaxis to set
     */
    public void setYaxis(YAxis yaxis) {
        this.yaxis = yaxis;
    }

    /**
     * @return the x2axis
     */
    public X2Axis getX2axis() {
        return x2axis;
    }

    /**
     * @param x2axis the x2axis to set
     */
    public void setX2axis(X2Axis x2axis) {
        this.x2axis = x2axis;
    }

    /**
     * @return the y2axis
     */
    public Y2Axis getY2axis() {
        return y2axis;
    }

    /**
     * @param y2axis the y2axis to set
     */
    public void setY2axis(Y2Axis y2axis) {
        this.y2axis = y2axis;
    }
}
