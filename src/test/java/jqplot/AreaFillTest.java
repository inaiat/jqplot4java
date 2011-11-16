/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.io.json.JsonWriter.Format;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }
        });
        
        Collection<Integer> x = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        //x.add(new Integer[]{1,2,3});
        //x.add(new Integer[]{1,2,3});
        //x.add(1);
        //x.add(2);
        //x.add(3);   
        
        Collection<Collection<Integer>> c = new ArrayList<Collection<Integer>>();
        
        Class clazz = c.getClass();
                
        
        c.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
        
        
        System.out.println(xstream.toXML(c.toArray()));



    }
}
