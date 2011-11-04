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
package br.com.digilabs.jqplot;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author inaiat
 */
public class JqPlot implements Serializable {

    private Collection<Serie> series;
    private Collection<Serie> seriesDefaults;
    private Collection<Axe> axes;
    private Title title;

    public void setSimpleTitle(String title) {
        if (title == null) {
            this.setTitle(new Title(title));
        } else {
            this.getTitle().setText(title);
        }
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
        this.series = series;
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
        this.seriesDefaults = seriesDefaults;
    }

    /**
     * @return the axes
     */
    public Collection<Axe> getAxes() {
        return axes;
    }

    /**
     * @param axes the axes to set
     */
    public void setAxes(Collection<Axe> axes) {
        this.axes = axes;
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
    
    
}
