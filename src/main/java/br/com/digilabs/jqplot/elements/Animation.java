package br.com.digilabs.jqplot.elements;

/**
 *
 * @author sbalamaci
 */
public class Animation implements Element {

    private Integer speed;

    /**
     * @return animation speed
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * set animation speed in ms
     * @param speed in ms
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
