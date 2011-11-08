/*
 * Copyright 2011 inaiat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jqplot;

import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.axis.YAxis;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
public class JqPlot implements Serializable {

    private Collection<Serie> series;
    private Collection<Serie> seriesDefaults;
    private Axes axes;
    private Title title;
    private Axis axesDefaults;
    
    public void setSimpleTitle(String title) {
        if (getTitle() == null) {
            this.setTitle(new Title(title));
        } else {
            this.getTitle().setText(title);
        }
    }

    public Axes createAxes() {
        if (this.getAxes() == null) {
            this.setAxes(new Axes());
        }
        return this.getAxes();
    }

    public XAxis createXAxis() {
        XAxis xAxis = new XAxis();
        createAxes().setXaxis(xAxis);
        return xAxis;
    }

    public YAxis createYAxis() {
        YAxis yAxis = new YAxis();
        createAxes().setYaxis(yAxis);
        return yAxis;
    }

    /**
     * @return the series
     */
    public Collection<Serie> getSeries() {
        return series;
    }

    /**
     * @param series the series to set
     */
    public void setSeries(Collection<Serie> series) {
        this.setSeries(series);
    }

    /**
     * @return the seriesDefaults
     */
    public Collection<Serie> getSeriesDefaults() {
        return seriesDefaults;
    }

    /**
     * @param seriesDefaults the seriesDefaults to set
     */
    public void setSeriesDefaults(Collection<Serie> seriesDefaults) {
        this.setSeriesDefaults(seriesDefaults);
    }

    /**
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * @return the axesDefaults
     */
    public Axis getAxesDefaults() {
        return axesDefaults;
    }

    /**
     * @param axesDefaults the axesDefaults to set
     */
    public void setAxesDefaults(Axis axesDefaults) {
        this.axesDefaults = axesDefaults;
    }

    /**
     * @return the axes
     */
    public Axes getAxes() {
        return axes;
    }

    /**
     * @param axes the axes to set
     */
    public void setAxes(Axes axes) {
        this.axes = axes;
    }    
    
}
