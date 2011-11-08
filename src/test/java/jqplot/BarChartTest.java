/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.Arrays;
import java.util.List;
import jqplot.axis.Axis;
import jqplot.axis.XAxis;
import jqplot.chart.BarChart;
import jqplot.renderer.plugin.CanvasAxisTickRenderer;
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
    
    public void testBarChart() {
        BarChart jqPlot = new BarChart();
        jqPlot.setSimpleTitle("Concern vs. Occurrance");
        Serie serie = new Serie();
        serie.setRenderer(JqPlotClasses.BarRenderer);

        Axis axisDefault = new Axis();
        
        axisDefault.setTickRenderer(JqPlotClasses.CanvasAxisTickRenderer);
        CanvasAxisTickRenderer canvasAxisTickRenderer = new CanvasAxisTickRenderer();
        canvasAxisTickRenderer.setAngle(-30F);
        canvasAxisTickRenderer.setFontSize("10pt");
        axisDefault.setTickOptions(canvasAxisTickRenderer);
        jqPlot.setAxesDefaults(axisDefault);
        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setRenderer(JqPlotClasses.CategoryAxisRenderer);
        

        List<Integer> collection = Arrays.<Integer>asList(3, 7, 9, 1, 4, 6, 8, 2, 5);
        
        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1", collection));
        
        
        List<String> resouces = JqPlotUtil.retriveJavaScriptResources(jqPlot);
        for (String string : resouces) {
            System.out.println(string);            
        }
        
        
    }
}
