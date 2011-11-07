/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.Arrays;
import java.util.List;
import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.plugin.PluginClasses;
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
        JqPlot jqPlot = new JqPlot();
        jqPlot.setSimpleTitle("TESTE");

        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setLabel("X Axis");
        xAxis.setPad(0F);
        Axis yAxis = jqPlot.createYAxis();
        yAxis.setLabel("Y Axis");
        

        Axis axisDefault = new Axis();
        axisDefault.setLabelRenderer(PluginClasses.CanvasAxisLabelRenderer);
        jqPlot.setAxesDefaults(axisDefault);
        
        List<Integer> collection = Arrays.<Integer>asList(3,7,9,1,4,6,8,2,5);       
        

        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1",  collection));

    }
}
