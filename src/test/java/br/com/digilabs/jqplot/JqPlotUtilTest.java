/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.plugin.CanvasAxisLabelRenderer;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import java.io.Writer;
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
        System.out.println("createJquery");
        JqPlot jqPlot = new JqPlot();
        jqPlot.setSimpleTitle("TESTE");

        XAxis xAxis = jqPlot.createXAxis();
        xAxis.setLabel("X Axis");
        xAxis.setPad(0F);
        Axis yAxis = jqPlot.createYAxis();
        yAxis.setLabel("Y Axis");
        

        Axis axisDefault = new Axis();
        axisDefault.setLabelRenderer(new CanvasAxisLabelRenderer());
        jqPlot.setAxesDefaults(axisDefault);

        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                return new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE);
            }
                
        });
        System.out.println(xstream.toXML(jqPlot));

        String divId = "";
        String expResult = "";
        String result = JqPlotUtil.createJquery(jqPlot, divId, "teste");
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
