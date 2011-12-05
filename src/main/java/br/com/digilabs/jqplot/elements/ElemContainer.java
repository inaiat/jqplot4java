package br.com.digilabs.jqplot.elements;

/**
 * 
 * @author inaiat
 */
public class ElemContainer implements Element {

    private static final long serialVersionUID = -3849421146501469906L;
    private Float plotWidth;
    private Float plotHeight;

    /**
     * 
     * @param plotWidth
     * @param plotHeight 
     */
    public ElemContainer(Float plotWidth, Float plotHeight) {
        this.plotWidth = plotWidth;
        this.plotHeight = plotHeight;
    }

    /**
     * 
     * @return plotHeight
     */
    public Float getPlotHeight() {
        return plotHeight;
    }

    /**
     * 
     * @param plotHeight 
     */
    public void setPlotHeight(Float plotHeight) {
        this.plotHeight = plotHeight;
    }

    /**
     * 
     * @return plotWidth
     */
    public Float getPlotWidth() {
        return plotWidth;
    }

    /**
     * 
     * @param plotWidth 
     */
    public void setPlotWidth(Float plotWidth) {
        this.plotWidth = plotWidth;
    }

    public static void createElement() {
    }
}
