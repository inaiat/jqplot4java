/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.test;


import java.util.Arrays;

import com.github.openjson.JSONException;

import br.com.digilabs.jqplot.JqPlotUtils;
import br.com.digilabs.jqplot.chart.BarChart;
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

    public void testLabeledLine() throws JSONException {
        BarChart<Integer> chart = new BarChart<Integer>();
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        System.out.println(JqPlotUtils.createJquery(chart, "chart"));

    }
}
