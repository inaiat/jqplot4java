/*
 *  Copyright 2011 Inaiat.
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
package br.com.digilabs.jqplot;

/**
 * 
 * Resources of JqPlot aka Plugins.
 * 
 * @author inaiat
 */
public enum JqPlotResources {

    Highlighter("$.jqplot.Highlighter", "plugins/jqplot.highlighter.min.js"),

    BarRenderer("$.jqplot.BarRenderer", "plugins/jqplot.barRenderer.min.js"),
    BubbleRenderer("$.jqplot.BubbleRenderer", "plugins/jqplot.bubbleRenderer.min.js"),
    PieRenderer("$.jqplot.PieRenderer", "plugins/jqplot.pieRenderer.min.js"),
    DonutRenderer("$.jqplot.DonutRenderer", "plugins/jqplot.donutRenderer.min.js"),
    CanvasAxisLabelRenderer("$.jqplot.CanvasAxisLabelRenderer", "plugins/jqplot.canvasAxisLabelRenderer.min.js"),
    CategoryAxisRenderer("$.jqplot.CategoryAxisRenderer", "plugins/jqplot.categoryAxisRenderer.min.js"),
    CanvasAxisTickRenderer("$.jqplot.CanvasAxisTickRenderer", "plugins/jqplot.canvasAxisTickRenderer.min.js"),
    CanvasTextRenderer("$.jqplot.CanvasTextRenderer","plugins/jqplot.canvasTextRenderer.min.js"),
    DateAxisRenderer("$.jqplot.DateAxisRenderer","plugins/jqplot.dateAxisRenderer.min.js"),
    MeterGaugeRenderer("$.jqplot.MeterGaugeRenderer","plugins/jqplot.meterGaugeRenderer.min.js"),
    PointLabels("$.jqplot.DateAxisRenderer","plugins/jqplot.pointLabels.min.js"),
    ShadowRenderer("$.jqplot.ShadowRenderer", "jquery.jqplot.min.js");
    
    private String className;
    private String resource;

    /**
     * 
     * @param className 
     */
    private JqPlotResources(String className) {
        this(className, null);
    }

    /**
     * 
     * @param className
     * @param resource 
     */
    private JqPlotResources(String className, String resource) {
        this.className = className;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return className;
    }

    /**
     * 
     * @return o nome da classe
     */
    public String getClassName() {
        return className;
    }

    /**
     * Retorna o resurce
     * @return o resource
     */
    public String getResource() {
        return resource;
    }
}

