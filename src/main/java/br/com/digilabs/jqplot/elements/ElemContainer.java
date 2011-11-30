package br.com.digilabs.jqplot.elements;

/**
 *
 * @author inaiat
 */
public class ElemContainer implements Element {

    private static final long serialVersionUID = -3849421146501469906L;
    private Float plotWidth;
    private Float plotHeight;

    public ElemContainer(Float plotWidth, Float plotHeight) {
        this.plotWidth = plotWidth;
        this.plotHeight = plotHeight;
    }

    public Float getPlotHeight() {
        return plotHeight;
    }

    public void setPlotHeight(Float plotHeight) {
        this.plotHeight = plotHeight;
    }

    public Float getPlotWidth() {
        return plotWidth;
    }

    public void setPlotWidth(Float plotWidth) {
        this.plotWidth = plotWidth;
    }

    public static void createElement() {
    }
}
