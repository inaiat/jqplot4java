/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.chart.BarChart;
import jqplot.chart.PieChart;
import junit.framework.TestCase;

/**
 *
 * @author bernardo.moura
 */
public class PieChartTest  extends TestCase {

    public PieChartTest(String testName) {
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


     public void testCreateJqueryPie() {
        PieChart jqPlot = new PieChart();
        
        List<Integer> collection = Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5);       
     
        HashMap<String, Double> data = new  HashMap<String, Double>();
        data.put("aaa", 1.2);
        data.put("bbb", 1.3);
        data.put("ccc", 1.5);
        
        System.out.println(JqPlotUtil.createPieChartJquery(jqPlot, "chart1",  data));
    }
}
