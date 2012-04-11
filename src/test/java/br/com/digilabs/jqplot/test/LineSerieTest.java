/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.test;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;
import br.com.digilabs.jqplot.Chart;
import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.JqPlotUtils;
import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.AxisNumber;
import br.com.digilabs.jqplot.axis.AxisString;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.chart.LabeledLineChart;
import br.com.digilabs.jqplot.chart.LineChart;
import br.com.digilabs.jqplot.chart.LineSeriesChart;
import br.com.digilabs.jqplot.data.ChartData;
import br.com.digilabs.jqplot.data.item.LineSeriesItem;
import br.com.digilabs.jqplot.elements.Axes;
import br.com.digilabs.jqplot.elements.Cursor;
import br.com.digilabs.jqplot.elements.Grid;
import br.com.digilabs.jqplot.elements.Highlighter;
import br.com.digilabs.jqplot.elements.Legend;
import br.com.digilabs.jqplot.elements.Location;
import br.com.digilabs.jqplot.elements.MarkerOptions;
import br.com.digilabs.jqplot.elements.Serie;
import br.com.digilabs.jqplot.elements.TickOptions;
import br.com.digilabs.jqplot.renderer.Renderer;

/**
 *
 * @author vinicius
 */
public class LineSerieTest extends TestCase {

    public LineSerieTest(String testName) {
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
    
    public void testLineSeriesChart() {
        LineSeriesChart<Number, Number> chart = new LineSeriesChart<Number, Number>("Curves","X", "Y");
        
        Collection<LineSeriesItem<Number, Number>> linhaSin = new ArrayList<LineSeriesItem<Number,Number>>();
        
        for(double i = 0; i<= 6; i+= 0.01 ){
        	linhaSin.add(new LineSeriesItem<Number, Number>(i, Math.sin(i)+4));
        }
        
        chart.addValue(linhaSin);
        
        Collection<LineSeriesItem<Number, Number>> linhaCos = new ArrayList<LineSeriesItem<Number,Number>>();
        
        for(double i = 0; i<= 6; i+= 0.01 ){
        	linhaCos.add(new LineSeriesItem<Number, Number>(i, Math.cos(i)));
        }
        
        chart.addValue(linhaCos);
        
        Collection<LineSeriesItem<Number, Number>> linhaExp = new ArrayList<LineSeriesItem<Number,Number>>();
        
        for(double i = 0; i<= 2; i+= 0.01 ){
        	linhaExp.add(new LineSeriesItem<Number, Number>(i, Math.exp(i)+1));
        }
        
        chart.addValue(linhaExp);
        
        Collection<LineSeriesItem<Number, Number>> linhaReta = new ArrayList<LineSeriesItem<Number,Number>>();
        
        for(double i = 0; i<= 6; i+= 0.01 ){
        	linhaReta.add(new LineSeriesItem<Number, Number>(i, i));
        }
        
        chart.addValue(linhaReta);

		
		Highlighter highlighter = criarHighlighter();
		
		chart.getChartConfiguration().setHighlighter(highlighter);
		
		chart.addSerie(criarSerie("Seno", "#489104"));
		chart.addSerie(criarSerie("Coseno", "#c91212"));
		chart.addSerie(criarSerie("Exponensial", "#7D02B2"));
		chart.addSerie(criarSerie("Reta", "#066FA7"));
		
		Legend legend = new Legend(true, Location.ne);
		legend.setPlacment("outsideGrid");
		
		
		chart.setLegend(legend);
		
		Axis<?> axis = new AxisNumber();
		axis.setLabelRenderer(JqPlotResources.CanvasAxisLabelRenderer);
		
		chart.setAxesDefaults(axis);
		
		Axes axes = chart.getAxes();
		XAxis xaxis = axes.getXaxis();
		TickOptions tickOptions = new TickOptions();
		tickOptions.setAngle(270);
		tickOptions.setLabelPosition("end");
		
		
		xaxis.setTickOptions(tickOptions);
		xaxis.setTickRenderer(JqPlotResources.CanvasAxisTickRenderer);
		xaxis.setTickInterval(1);
		
		axes.getYaxis().setTickInterval(0.50);

		axes.getYaxis().setMax(8.50);
		axes.getYaxis().setMin(-1.50);
		
		

		TickOptions tickOptionsY = new TickOptions();
		tickOptionsY.setFormatString("%.2f");
		axes.getYaxis().setTickOptions(tickOptionsY);
		
		Grid grid = new Grid();
		grid.setBackground("#ffffff");
		chart.getChartConfiguration().setGrid(grid);
		Cursor cursor = new Cursor();
		cursor.setZoom(true);
		cursor.setClickReset(true);
		chart.getChartConfiguration().setCursor(cursor);
		
		
		
        String json = JqPlotUtils.createJquery(chart, "div3");
        json = json.replaceAll("\\$", "jQuery");
        System.out.println(json);
        
    }

    /**
     * Cria um Highlighter
     * @return
     */
	public Highlighter criarHighlighter() {
		Highlighter highlighter = new Highlighter();
		highlighter.setFormatString("<table style='background:#fafafa'>" +
					"<tr><td COLSPAN=2 style='font-size:12px;color:#0012FF;font-weight:bold'>#serieLabel#</td></tr>"+
      				"<tr><td>DU:</td><td>%s</td></tr>" +
     		 		"<tr><td>Taxa:</td><td>%s%%</td></tr>"+
      				"</table>");
		
		
		
		highlighter.setShow(true);
		highlighter.setSizeAdjust(2.0);
		return highlighter;
	}

    /**
     * Cria uma serie para o gráfico ela é responsável em determinar a cor dos pontos e o nome da linha.
     * @param titulo
     * @param cor
     * @return a Serie criada
     */
	public Serie criarSerie(String titulo, String cor) {
		Serie s = new Serie(titulo);
        
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.setStyle("filledSquare");
        markerOptions.size(1.f);
        
		s.setMarkerOptions(markerOptions );
		s.showLine(true);
		s.setLineWidth(1);
		s.setColor(cor);
		
		return s;
	}
    
    
}
