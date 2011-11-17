/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import jqplot.chart.PieChart;
import jqplot.chart.data.PieChartData;
import junit.framework.TestCase;

/**
 *
 * @author bernardo.moura
 */
public class PieChartTest extends TestCase {

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

    public void testCreatePieJquery() {
        PieChartData chartData = new PieChartData();

        PieChartData pieData = new PieChartData();
        PieChart pieChart = new PieChart();

        Collection<Object> c1 = new ArrayList<Object>();
        c1.add(Arrays.asList("A", 1));
        c1.add(Arrays.asList("B", 2.1));
        c1.add(Arrays.asList("C", 4.4));
        pieData.addValue(c1);

        pieChart.setChartData(pieData);
        System.out.println(JqPlotUtil.createJquery(pieChart, "chart1"));
    }
//
//    public void testCreateDonutJquery() {
//        DonutChart jqPlot = new DonutChart();
//
//        HashMap<String, Double> data = new HashMap<String, Double>();
//        data.put("aaa", 1.2);
//        data.put("bbb", 1.3);
//        data.put("ccc", 1.5);
//
//        System.out.println(JqPlotUtil.createPieChartJquery(jqPlot, "chart1", data));
//    }
}
