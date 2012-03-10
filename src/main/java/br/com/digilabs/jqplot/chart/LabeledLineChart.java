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
package br.com.digilabs.jqplot.chart;


import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.data.LabeledData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.TickOptions;
import br.com.digilabs.jqplot.elements.Title;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * 
 * @author inaiat
 */
@JqPlotPlugin(values = {
    JqPlotResources.DateAxisRenderer,
    JqPlotResources.CanvasTextRenderer,
    JqPlotResources.CategoryAxisRenderer,
    JqPlotResources.DateAxisRenderer,
    JqPlotResources.CanvasAxisLabelRenderer,
    JqPlotResources.CanvasAxisTickRenderer
})
public class LabeledLineChart<T extends Number> extends AbstractChart<LabeledData<T>> {

	private static final long serialVersionUID = -6833884146696085085L;

	LabeledData<T> labeledData = new LabeledData<T>();

    /**
     * Construtor
     */
    public LabeledLineChart() {
        this(null, null, null, 15);
    }

    /**
     * Construtor
     * @param title
     * @param labelX
     * @param labelY 
     */
    public LabeledLineChart(String title, String labelX, String labelY) {
        this(title, labelX, labelY, 15);
    }

    /**
     * Construtor
     * 
     * @param title
     * @param labelX
     * @param labelY
     * @param tickAngle 
     */
    public LabeledLineChart(String title, String labelX, String labelY,
            Integer tickAngle) {
        getChartConfiguration().setTitle(new Title(title));
        Axis xAxis = getChartConfiguration().createXAxis();
        xAxis.setRenderer(JqPlotResources.DateAxisRenderer);
        xAxis.setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
        xAxis.setTickRenderer(JqPlotResources.CanvasAxisTickRenderer);
        TickOptions tickOptions = new TickOptions();
        tickOptions.setAngle(tickAngle);
        xAxis.setTickOptions(tickOptions);
        getChartConfiguration().createYAxis().setLabelRenderer(
                JqPlotResources.CanvasAxisLabelRenderer);
        getChartConfiguration().setLabelX(labelX);
        getChartConfiguration().setLabelY(labelY);
    }

    /**
     * 
     * @param value 
     */
    public void addValue(LabeledItem<T> value) {
        labeledData.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(LabeledItem<T>... values) {
        labeledData.addValues(values);
    }

    /**
     * 
     * @return 
     */
    public LabeledData<T> getChartData() {
        return labeledData;
    }
}
