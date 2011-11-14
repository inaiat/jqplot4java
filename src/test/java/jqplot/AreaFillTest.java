/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jqplot.chart.AreaChart;
import jqplot.chart.data.AreaFillData;
import junit.framework.TestCase;

/**
 *
 * @author inaiat
 */
public class AreaFillTest extends TestCase {
    
    public AreaFillTest(String testName) {
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
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(11, 9, 5, 12, 14));
        List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(4, 8, 5, 3, 6));
        List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(12, 6, 13, 11, 2));        
        AreaFillData<Integer> data = new AreaFillData<Integer>(l2, l3, l4);        
        AreaChart<AreaFillData> chart = new AreaChart<AreaFillData>();
        chart.getAxes().getXaxis().setTicks(new String[]{"Seg", "Ter", "Qua", "Qui", "Sex"});  
        chart.setChartData(data);
        System.out.println(JqPlotUtil.createJquery(chart, "chart1"));
    }
}
