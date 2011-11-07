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
import jqplot.plugin.PluginClasses;
import junit.framework.TestCase;

/**
 *
 * @author inaiat
 */
public class JqPlotUtilTest extends TestCase {

    public JqPlotUtilTest(String testName) {
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
        JqPlot jqPlot = new JqPlot();
        jqPlot.setSimpleTitle("TESTE");

        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setLabel("X Axis");
        xAxis.setPad(0F);
        Axis yAxis = jqPlot.createYAxis();
        yAxis.setLabel("Y Axis");
        

        Axis axisDefault = new Axis();
        axisDefault.setLabelRenderer(JqPlotClasses.CanvasAxisLabelRenderer);
        jqPlot.setAxesDefaults(axisDefault);
        
        List<Integer> collection = Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5);       
        

        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1",  collection));

    }
    
      public void testCreateJqueryPie() {
        PieChart jqPlot = new PieChart();
        
        List<Integer> collection = Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5);       
        HashMap<String, List<?>> data = new  HashMap<String, List<?>>();
        data.put("data1", Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5));
        data.put("data2", Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5));
        data.put("data3", Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5));
        // TODO: Fix methods.
        //System.out.println(JqPlotUtil.createPieChartJquery(jqPlot, "chart1",  data));
        HashMap<String, Double> data2 = new  HashMap<String, Double>();
        data2.put("aaa", 1.2);
        data2.put("bbb", 1.3);
        data2.put("ccc", 1.3);
        // TODO:Fix this.
        //System.out.println(JqPlotUtil.createPieChartJquery(jqPlot, "chart1",  data2));
    }
}
