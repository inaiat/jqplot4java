/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import jqplot.chart.LineChart;
import jqplot.chart.data.LinedData;
import junit.framework.TestCase;

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

    /**
     * Test of createJquery method, of class JqPlotUtil.
     */
    public void testCreateJquery() {       
        
        LineChart<LinedData<Integer>> lineChart = new LineChart<LinedData<Integer>>();
        LinedData<Integer> data = new LinedData<Integer>(1, 2, 3, 4, 5, 6);
        lineChart.setChartData(data);            
        System.out.println(JqPlotUtil.createJquery(lineChart, "chart1"));
    }

}
