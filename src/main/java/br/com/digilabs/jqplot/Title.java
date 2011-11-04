/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

import java.io.Serializable;

/**
 *
 * @author inaiat
 */
public class Title implements Serializable {
    
    private String text;
    private boolean show;
    private String fontFamily;
    private String fontSize;
    private String textAlign;
    private String textColor;
    private String renderer;
    private String rendererOptions;
    private String escapeHtml;

    public Title() {
    }
    
    public Title(String text) {
        this.text = text;
    }
    

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the show
     */
    public boolean isShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(boolean show) {
        this.show = show;
    }

    /**
     * @return the fontFamily
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * @param fontFamily the fontFamily to set
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * @return the fontSize
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return the textAlign
     */
    public String getTextAlign() {
        return textAlign;
    }

    /**
     * @param textAlign the textAlign to set
     */
    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    /**
     * @return the textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * @param textColor the textColor to set
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * @return the renderer
     */
    public String getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the rendererOptions
     */
    public String getRendererOptions() {
        return rendererOptions;
    }

    /**
     * @param rendererOptions the rendererOptions to set
     */
    public void setRendererOptions(String rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    /**
     * @return the escapeHtml
     */
    public String getEscapeHtml() {
        return escapeHtml;
    }

    /**
     * @param escapeHtml the escapeHtml to set
     */
    public void setEscapeHtml(String escapeHtml) {
        this.escapeHtml = escapeHtml;
    }   
    
    
}
