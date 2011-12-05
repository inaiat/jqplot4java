package br.com.digilabs.jqplot.elements;

/**
 * SeriesDafaults
 * @author inaiat
 */
public class SeriesDefaults extends Serie {

    private static final long serialVersionUID = -7921968769382552293L;
    private PointLabels pointLabels;

    /**
     * 
     * @return pointLables
     */
    public PointLabels getPointLabels() {
        return pointLabels;
    }

    /**
     * 
     * @param pointLabels 
     */
    public void setPointLabels(PointLabels pointLabels) {
        this.pointLabels = pointLabels;
    }
}
