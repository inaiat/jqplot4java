/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.test;

import junit.framework.TestCase;
import br.com.digilabs.jqplot.JqPlotUtil;
import br.com.digilabs.jqplot.chart.LabeledLineChart;
import br.com.digilabs.jqplot.chart.LineChart;
import br.com.digilabs.jqplot.data.item.LabeledItem;

/**
 *
 * @author inaiat
 */
public class LineChartTest extends TestCase {

    public LineChartTest(String testName) {
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

    public void testAddValues() {
    	
        Integer[] values = {1, 2, 3, 4, 5};
        LineChart<Integer> instance = new LineChart<Integer>();
        instance.addValues(values);
        System.out.println(JqPlotUtil.createJquery(instance, "chart"));
    }
    
    public void testBarChart() {
        LabeledLineChart<Integer> chart = new LabeledLineChart<Integer>("Test","Incliment Occurrance","Incliment Factor",15);
        chart.addValue(new LabeledItem<Integer>("1/1/2008", 42));
        chart.addValue(new LabeledItem<Integer>("2/14/2008", 56));
        chart.addValue(new LabeledItem<Integer>("3/7/2008", 39));
        chart.addValue(new LabeledItem<Integer>("4/22/2008", 81));
        System.out.println(JqPlotUtil.createJquery(chart, "chart"));
        System.out.println(JqPlotUtil.retriveJavaScriptResources(chart));
    }
}
