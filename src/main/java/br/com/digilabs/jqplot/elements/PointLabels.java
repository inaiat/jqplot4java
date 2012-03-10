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

import java.io.Serializable;
import java.util.List;

/**
 * PointLabels
 * @author inaiat
 */
public class PointLabels implements Serializable {

    private static final long serialVersionUID = -2768644134500702341L;
    private Boolean show = true;
    private String location;
    private Integer edgeTolerance;
    private List<String> lables;

    /**
     * 
     * @return lista de lables
     */
    public List<String> getLables() {
        return lables;
    }

    /**
     * 
     * @param lables 
     */
    public void setLables(List<String> lables) {
        this.lables = lables;
    }

    /**
     * 
     * @return edgeTolerance
     */
    public Integer getEdgeTolerance() {
        return edgeTolerance;
    }
    
    /**
     * 
     * @param edgeTolerance 
     */
    public void setEdgeTolerance(Integer edgeTolerance) {
        this.edgeTolerance = edgeTolerance;
    }

    /**
     * 
     * @return loocation
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location 
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return show true ou false
     */
    public Boolean isShow() {
        return show;
    }

    /**
     * 
     * @param show 
     */
    public void setShow(Boolean show) {
        this.show = show;
    }
}
