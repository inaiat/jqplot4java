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
 * SeriesDafaults
 * @author inaiat
 */
public class SeriesDefaults extends Serie {

    private static final long serialVersionUID = -7921968769382552293L;
    private PointLabels pointLabels;
    private Trendline trendline;

    /**
     * 
     * @return pointLables
     */
    public PointLabels getPointLabels() {
        return pointLabels;
    }

    /**
     * 
     * @param pointLabels 
     */
    public void setPointLabels(PointLabels pointLabels) {
        this.pointLabels = pointLabels;
    }

    public Trendline getTrendline() {
	return trendline;
    }

    public void setTrendline(Trendline trendline) {
	this.trendline = trendline;
    }
}
