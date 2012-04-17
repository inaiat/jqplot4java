/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.elements;

/**
 * Plot Title object.
 *
 * @author inaiat
 */
public class Title implements Element {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -277067293084389272L;
    
    /** The text. */
    private String text;
    
    /** The show. */
    private Boolean show;
    
    /** The font family. */
    private String fontFamily;
    
    /** The font size. */
    private String fontSize;
    
    /** The text align. */
    private String textAlign;
    
    /** The text color. */
    private String textColor;
    
    /** The renderer. */
    private String renderer;
    
    /** The renderer options. */
    private String rendererOptions;
    
    /** The escape html. */
    private String escapeHtml;

    /**
     * Instantiates a new title.
     */
    public Title() {
    }

    /**
     * Instantiates a new title.
     *
     * @param text the text
     */
    public Title(String text) {
        this.text = text;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the show.
     *
     * @param show the new show
     */
    public void setShow(boolean show) {
        this.setShow((Boolean) show);
    }

    /**
     * Gets the font family.
     *
     * @return the font family
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the font family.
     *
     * @param fontFamily the new font family
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Gets the font size.
     *
     * @return the fontSize
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the font size.
     *
     * @param fontSize the fontSize to set
     */
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Gets the text align.
     *
     * @return the textAlign
     */
    public String getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the text align.
     *
     * @param textAlign the textAlign to set
     */
    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    /**
     * Gets the text color.
     *
     * @return the textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the text color.
     *
     * @param textColor the textColor to set
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * Gets the renderer.
     *
     * @return the renderer
     */
    public String getRenderer() {
        return renderer;
    }

    /**
     * get'.
     *
     * @param renderer the renderer to set
     */
    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    /**
     * Gets the renderer options.
     *
     * @return the rendererOptions
     */
    public String getRendererOptions() {
        return rendererOptions;
    }

    /**
     * Sets the renderer options.
     *
     * @param rendererOptions the rendererOptions to set
     */
    public void setRendererOptions(String rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    /**
     * Gets the escape html.
     *
     * @return the escapeHtml
     */
    public String getEscapeHtml() {
        return escapeHtml;
    }

    /**
     * Sets the escape html.
     *
     * @param escapeHtml the escapeHtml to set
     */
    public void setEscapeHtml(String escapeHtml) {
        this.escapeHtml = escapeHtml;
    }

    /**
     * Gets the show.
     *
     * @return the show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * Sets the show.
     *
     * @param show the show to set
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * Sets the text.
     *
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}
