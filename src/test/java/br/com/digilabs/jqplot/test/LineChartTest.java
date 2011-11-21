/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.test;

import junit.framework.TestCase;
import br.com.digilabs.jqplot.JqPlotUtil;
import br.com.digilabs.jqplot.chart.LineChart;
import br.com.digilabs.jqplot.chart.data.LinedData;

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
        String result = JqPlotUtil.createJquery(lineChart, "chart1");
        
        String  extectedResult = "$(document).ready(function(){\r\n" +
        		"   $.jqplot('chart1', [[1,2,3,4,5,6]], {\n" +
        		"  \"axes\": {\n" +
        		"    \"xaxis\": {\n" +
        		"      \"pad\": 0.0\n" +
        		"    }\n" +
        		"  },\n" +
        		"  \"axesDefaults\": {\n" +
        		"    \"labelRenderer\": $.jqplot.CanvasAxisLabelRenderer\n" +
        		"  }\n" +
        		"});\r\n" +
        		"});\r\n";
        
        
        System.out.println(result);
        System.out.println(extectedResult);
        
        assertEquals(extectedResult, result);
        
    }
}
  		
        		
        		
        		
        		