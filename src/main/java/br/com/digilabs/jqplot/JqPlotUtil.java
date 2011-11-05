/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot;

/**
 *
 * @author inaiat
 */
public class JqPlotUtil {
    
    public static String createJquery(JqPlot jqPlot,String divId, String data) {
        StringBuilder builder = new StringBuilder();
        builder.append("$(document).ready(function(){");
        builder.append("   $.jqplot('").append(divId).append("', ").append(data).append(");");
        return builder.toString();
    }
    
}
