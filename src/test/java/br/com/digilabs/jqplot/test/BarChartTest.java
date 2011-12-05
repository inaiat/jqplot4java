/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.test;


import java.util.Arrays;

import junit.framework.TestCase;

import org.json.JSONException;

import br.com.digilabs.jqplot.BarChart;
import br.com.digilabs.jqplot.util.JavaScriptGenerator;

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

    public void testLabeledLine() throws JSONException, org.json.JSONException {
        BarChart<Integer> chart = new BarChart<Integer>();
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        chart.addValue(Arrays.<Integer>asList(200, 600, 700, 1000));
        System.out.println(JavaScriptGenerator.createJquery(chart, "chart"));

    }
}
