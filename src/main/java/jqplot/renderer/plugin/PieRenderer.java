/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot.renderer.plugin;

import jqplot.JqPlotResources;
import jqplot.chart.elements.Renderer;
import jqplot.metadata.JqPlotPlugin;

/**
 *
 * @author bernardo.moura
 */
@JqPlotPlugin(values= {JqPlotResources.PieRenderer})
public class PieRenderer implements Renderer {
// Group: Properties
    //
    // prop: diameter
    // Outer diameter of the pie, auto computed by default

    private String diameter;
    // prop: padding
    // padding between the pie and plot edges, legend, etc.
    private double padding;
    // prop: sliceMargin
    // angular spacing between pie slices in degrees.
    private double sliceMargin;
    // prop: fill
    // true or false, wether to fil the slices.
    private boolean fill;
    // prop: shadowOffset
    // offset of the shadow from the slice and offset of 
    // each succesive stroke of the shadow from the last.
    private int shadowOffset;
    // prop: shadowAlpha
    // transparency of the shadow (0 = transparent, 1 = opaque)
    private double shadowAlpha;
    // prop: shadowDepth
    // number of strokes to apply to the shadow, 
    // each stroke offset shadowOffset from the last.
    private int shadowDepth;
    // prop: highlightMouseOver
    // True to highlight slice when moused over.
    // This must be false to enable highlightMouseDown to highlight when clicking on a slice.
    private boolean highlightMouseOver;
    // prop: highlightMouseDown
    // True to highlight when a mouse button is pressed over a slice.
    // This will be disabled if highlightMouseOver is true.
    private boolean highlightMouseDown;
    // prop: highlightColors
    // an array of colors to use when highlighting a slice.
    private String[] highlightColors;
    private String dataLabels;
    // prop: showDataLabels
    // true to show data labels on slices.
    private boolean showDataLabels;
    // prop: dataLabelFormatString
    // Format string for data labels.  If none, '%s' is used for "label" and for arrays, '%d' for value and '%d%%' for percentage.
    private String dataLabelFormatString;
    // prop: dataLabelThreshold
    // Threshhold in percentage (0-100) of pie area, below which no label will be displayed.
    // This applies to all label types, not just to percentage labels.
    private int dataLabelThreshold ;
    // prop: dataLabelPositionFactor
    // A Multiplier (0-1) of the pie radius which controls position of label on slice.
    // Increasing will slide label toward edge of pie, decreasing will slide label toward center of pie.
    private double dataLabelPositionFactor;
    // prop: dataLabelNudge
    // Number of pixels to slide the label away from (+) or toward (-) the center of the pie.
    private int dataLabelNudge;
    // prop: dataLabelCenterOn
    // True to center the data label at its position.
    // False to set the inside facing edge of the label at its position.
    private boolean dataLabelCenterOn;
    // prop: startAngle
    // Angle to start drawing pie in degrees.  
    // According to orientation of canvas coordinate system:
    // 0 = on the positive x axis
    // -90 = on the positive y axis.
    // 90 = on the negaive y axis.
    // 180 or - 180 = on the negative x axis.
    private int startAngle;
    // TODO:?? Should pass java class PieTickRenderer?
    //private tickRenderer  = $.jqplot.PieTickRenderer;
    // Used as check for conditions where pie shouldn't be drawn.
    private boolean _drawData;
    private String _type = "pie";

    public JqPlotResources resource() {
        return JqPlotResources.PieRenderer;
    }
}
