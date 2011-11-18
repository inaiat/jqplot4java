/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.digilabs.jqplot.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.digilabs.jqplot.JqPlotUtil;
import br.digilabs.jqplot.chart.AreaChart;
import br.digilabs.jqplot.chart.data.AreaFillData;
import br.digilabs.jqplot.json.JSONArray;

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
        List<Integer> l2 = new ArrayList<Integer>(Arrays.<Integer>asList(11, 9, 5, 12, 14));
        List<Integer> l3 = new ArrayList<Integer>(Arrays.<Integer>asList(4, 8, 5, 3, 6));
        List<Integer> l4 = new ArrayList<Integer>(Arrays.<Integer>asList(12, 6, 13, 11, 2));        
		
        @SuppressWarnings("unchecked")
		AreaFillData<Integer> data = new AreaFillData<Integer>(l2, l3, l4);
		
        AreaChart<AreaFillData<Integer>> chart = new AreaChart<AreaFillData<Integer>>();
        chart.getAxes().getXaxis().setTicks(new String[]{"Seg", "Ter", "Qua", "Qui", "Sex"});
        chart.setChartData(data);
        System.out.println(JqPlotUtil.createJquery(chart, "chart1"));

        
        Collection<Integer> x = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        
        JSONArray array = new JSONArray();
        array.put(x);
        
        System.out.println(array);
        
        Collection<JSONArray> c = new ArrayList<JSONArray>();
        c.add(new JSONArray(Arrays.asList("A",1)));        
        c.add(new JSONArray(Arrays.asList("B",2)));        
        System.out.println(new JSONArray(c).toString());
    }
}
