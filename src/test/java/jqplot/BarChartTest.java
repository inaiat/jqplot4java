/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.Set;
import jqplot.plugin.BarRenderer;
import junit.framework.TestCase;

/**
 *
 * @author inaiat
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

    public void barChartTest() {
        JqPlot jqPlot = new JqPlot();
        jqPlot.setSimpleTitle("Concern vs. Occurrance");
        Serie serie = jqPlot.createSerie();
        serie.setRenderer(new BarRenderer());

        axisDefault.setLabelRenderer(PluginClasses.CanvasAxisLabelRenderer);
        jqPlot.setAxesDefaults(axisDefault);


        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setLabel("X Axis");
        xAxis.setPad(0F);
        Axis yAxis = jqPlot.createYAxis();
        yAxis.setLabel("Y Axis");


        Axis axisDefault = new Axis();

        List<Integer> collection = Arrays.<Integer>asList(3, 7, 9, 1, 4, 6, 8, 2, 5);


        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1", collection));
    }
}
