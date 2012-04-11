package br.com.digilabs.jqplot.elements;

public class Cursor implements Element {
	
	private static final long serialVersionUID = -2461086260114020418L;
	
	private String style;
	private Boolean show = true;
	private Boolean showTooltip;
	private Boolean followMouse;
	private String tooltipLocation;
	private Integer tooltipOffset;
	private Boolean showTooltipGridPosition;
	private Boolean showTooltipUnitPosition;
	private Boolean showTooltipDataPosition;
	private String tooltipFormatString;
	private Boolean useAxesFormatters;
	private Boolean zoom;
	private Boolean looseZoom;
	private Boolean clickReset;
	private Boolean dblClickReset;
	private Boolean showVerticalLine;
	private Boolean showHorizontalLine;
	/**
	 * ‘none’, ‘x’ or ‘y’
	 */
	private String constrainZoomTo;	
	private Integer intersectionThreshold;
	private Boolean showCursorLegend;
	private String cursorLegendFormatString;
	private Boolean constrainOutsideZoom;
	private Boolean showTooltipOutsideZoom;
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Boolean getShow() {
		return show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public Boolean getShowTooltip() {
		return showTooltip;
	}
	public void setShowTooltip(Boolean showTooltip) {
		this.showTooltip = showTooltip;
	}
	public Boolean getFollowMouse() {
		return followMouse;
	}
	public void setFollowMouse(Boolean followMouse) {
		this.followMouse = followMouse;
	}
	public String getTooltipLocation() {
		return tooltipLocation;
	}
	public void setTooltipLocation(String tooltipLocation) {
		this.tooltipLocation = tooltipLocation;
	}
	public Integer getTooltipOffset() {
		return tooltipOffset;
	}
	public void setTooltipOffset(Integer tooltipOffset) {
		this.tooltipOffset = tooltipOffset;
	}
	public Boolean getShowTooltipGridPosition() {
		return showTooltipGridPosition;
	}
	public void setShowTooltipGridPosition(Boolean showTooltipGridPosition) {
		this.showTooltipGridPosition = showTooltipGridPosition;
	}
	public Boolean getShowTooltipUnitPosition() {
		return showTooltipUnitPosition;
	}
	public void setShowTooltipUnitPosition(Boolean showTooltipUnitPosition) {
		this.showTooltipUnitPosition = showTooltipUnitPosition;
	}
	public Boolean getShowTooltipDataPosition() {
		return showTooltipDataPosition;
	}
	public void setShowTooltipDataPosition(Boolean showTooltipDataPosition) {
		this.showTooltipDataPosition = showTooltipDataPosition;
	}
	public String getTooltipFormatString() {
		return tooltipFormatString;
	}
	public void setTooltipFormatString(String tooltipFormatString) {
		this.tooltipFormatString = tooltipFormatString;
	}
	public Boolean getUseAxesFormatters() {
		return useAxesFormatters;
	}
	public void setUseAxesFormatters(Boolean useAxesFormatters) {
		this.useAxesFormatters = useAxesFormatters;
	}
	public Boolean getZoom() {
		return zoom;
	}
	public void setZoom(Boolean zoom) {
		this.zoom = zoom;
	}
	public Boolean getLooseZoom() {
		return looseZoom;
	}
	public void setLooseZoom(Boolean looseZoom) {
		this.looseZoom = looseZoom;
	}
	public Boolean getClickReset() {
		return clickReset;
	}
	public void setClickReset(Boolean clickReset) {
		this.clickReset = clickReset;
	}
	public Boolean getDblClickReset() {
		return dblClickReset;
	}
	public void setDblClickReset(Boolean dblClickReset) {
		this.dblClickReset = dblClickReset;
	}
	public Boolean getShowVerticalLine() {
		return showVerticalLine;
	}
	public void setShowVerticalLine(Boolean showVerticalLine) {
		this.showVerticalLine = showVerticalLine;
	}
	public Boolean getShowHorizontalLine() {
		return showHorizontalLine;
	}
	public void setShowHorizontalLine(Boolean showHorizontalLine) {
		this.showHorizontalLine = showHorizontalLine;
	}
	public String getConstrainZoomTo() {
		return constrainZoomTo;
	}
	/**
	 * ‘none’, ‘x’ or ‘y’
	 * @param constrainZoomTo
	 */
	public void setConstrainZoomTo(String constrainZoomTo) {
		this.constrainZoomTo = constrainZoomTo;
	}
	public Integer getIntersectionThreshold() {
		return intersectionThreshold;
	}
	public void setIntersectionThreshold(Integer intersectionThreshold) {
		this.intersectionThreshold = intersectionThreshold;
	}
	public Boolean getShowCursorLegend() {
		return showCursorLegend;
	}
	public void setShowCursorLegend(Boolean showCursorLegend) {
		this.showCursorLegend = showCursorLegend;
	}
	public String getCursorLegendFormatString() {
		return cursorLegendFormatString;
	}
	public void setCursorLegendFormatString(String cursorLegendFormatString) {
		this.cursorLegendFormatString = cursorLegendFormatString;
	}
	public Boolean getConstrainOutsideZoom() {
		return constrainOutsideZoom;
	}
	public void setConstrainOutsideZoom(Boolean constrainOutsideZoom) {
		this.constrainOutsideZoom = constrainOutsideZoom;
	}
	public Boolean getShowTooltipOutsideZoom() {
		return showTooltipOutsideZoom;
	}
	public void setShowTooltipOutsideZoom(Boolean showTooltipOutsideZoom) {
		this.showTooltipOutsideZoom = showTooltipOutsideZoom;
	}
	
	

}
