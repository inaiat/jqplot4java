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
import java.util.Collection;
import jqplot.chart.LineChart;
import jqplot.chart.data.LinedData;
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
//        BarChart jqPlot = new BarChart();
//        jqPlot.setSimpleTitle("TESTE");
//
//        XAxis xAxis = jqPlot.createXAxis();
//        xAxis.setLabel("X Axis");
//        xAxis.setPad(0F);
//        Axis yAxis = jqPlot.createYAxis();
//        yAxis.setLabel("Y Axis");
//
//
//        Axis axisDefault = new Axis();
//        axisDefault.setLabelRenderer(JqPlotClasses.CanvasAxisLabelRenderer);
//        jqPlot.setAxesDefaults(axisDefault);

        LineChart<LinedData> lineChart = new LineChart<LinedData>();
        LinedData data = new LinedData(1, 2, 3, 4, 5, 6);
        lineChart.setChartData(data);
                
        //chart.addValues(1, 2, 3, 4, 5, 6);


        System.out.println(JqPlotUtil.createJquery(lineChart, "chart1"));

        //System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1", collection));
    }

    private void json(Collection<?> c) {
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver() {

            @Override
            public HierarchicalStreamWriter createWriter(Writer writer) {
                Format format = new Format(new char[]{}, new char[]{}, Format.COMPACT_EMPTY_ELEMENT);
                JsonWriter jsonWriter = new JsonWriter(writer, JsonWriter.DROP_ROOT_MODE, format);
                return jsonWriter;
            }
        });
        System.out.println(xstream.toXML(c));
    }

    public void testLineChart() {
//        LineChart chart = new LineChart("Teste", "label x", "label y");  
//        System.out.println(JqPlotUtil.createJquery(chart, "chart1"));
    }
}
