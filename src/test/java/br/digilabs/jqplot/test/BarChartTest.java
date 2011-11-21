/*
 * Copyright 2011 bernardo.moura.
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
package br.digilabs.jqplot.test;

import br.com.digilabs.jqplot.JqPlotUtil;
import br.com.digilabs.jqplot.chart.BarChart;
import br.com.digilabs.jqplot.chart.data.BarData;
import br.com.digilabs.jqplot.chart.elements.PointLabels;
import br.com.digilabs.jqplot.chart.elements.Serie;
import br.com.digilabs.jqplot.chart.elements.TickOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author bernardo.moura
 */
public class BarChartTest extends TestCase {

    public BarChartTest(String testName) {
        super(testName);
    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createJquery method, of class JqPlotUtil.
     */
    public void testCreateJquery() {

        BarChart barChart = new BarChart();

        barChart.getChartConfiguration().getAxes().getYaxis().setPadMin(0);
        barChart.getChartConfiguration().setStackSeries(true);
        barChart.getChartConfiguration().setCaptureRightClick(true);
        barChart.getSeriesDefaults().setPointLabels(new PointLabels());
        barChart.getSeriesDefaults().getRendererOptions().setBarMargin(30);
        barChart.getSeriesDefaults().getRendererOptions().setHighlightMouseDown(true);
        Collection<List<Integer>> lista = new ArrayList<List<Integer>>();
        
        
        Collection<Integer> c1 = new ArrayList<Integer>(Arrays.<Integer>asList(200,600,700,1000));
        Collection<Integer> c2 = new ArrayList<Integer>(Arrays.<Integer>asList(200,600,700,1000));
        Collection<Integer> c3 = new ArrayList<Integer>(Arrays.<Integer>asList(200,600,700,1000));
        
        
        BarData<Integer> data = new BarData<Integer>();
        data.addValues(c1);
        data.addValues(c2);
        data.addValues(c3);
       
        barChart.setChartData(data);
        System.out.println(JqPlotUtil.createJquery(barChart, "chart1"));

 

    }
}
