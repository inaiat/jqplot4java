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
package br.com.digilabs.jqplot;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Utility class to provide json from {@link Chart} object.
 * 
 * @author inaiat
 */
public class JqPlotUtils {
	
	private static class JqPlotSerializar implements JsonSerializer<JqPlotResources> {

		public JsonElement serialize(JqPlotResources src, Type typeOfSrc,
				JsonSerializationContext context) {			
			return new JsonPrimitive(src.getClassName());
		}		
	}

	/**
	 * Return javascript's resources from Chart
	 * 
	 * @param chart
	 * @return lista de com os javascripts dos gráficos
	 */
	public static List<String> retriveJavaScriptResources(Chart<?> chart) {
		List<String> resources = new ArrayList<String>();

		Class<?> clazz = chart.getClass();
		if (clazz.isAnnotationPresent(JqPlotPlugin.class)) {
			JqPlotResources[] jqPlotResourceses = clazz.getAnnotation(
					JqPlotPlugin.class).values();
			for (JqPlotResources jqPlotResources : jqPlotResourceses) {
				resources.add(jqPlotResources.getResource());
			}
		}

		// can it/should we make this more generic?
		if (chart.getChartConfiguration().getHighlighter() != null) {
			resources.add(JqPlotResources.Highlighter.getResource());
		}

		return resources;
	}

	/**
	 * Return JqPlot (Jquery) chart.
	 * 
	 * @param chart
	 * @param divId
	 * @return jquery criado
	 */
	public static String createJquery(Chart<?> chart, String divId) {
		return createJquery(chart, divId, null);
	}

	/**
	 * Return JqPlot (Jquery) chart with javascript variable
	 * 
	 * @param chart
	 * @param divId
	 * @param javaScriptVar
	 * @return jquery criado
	 */
	public static String createJquery(Chart<?> chart, String divId,
			String javaScriptVar) {
		StringBuilder builder = new StringBuilder();
		builder.append("$(document).ready(function(){\r\n");
		if (javaScriptVar != null) {
			builder.append("   var ").append(javaScriptVar).append("=");
		}
		builder.append("   $.jqplot('").append(divId).append("', ");
		builder.append(chart.getChartData().toJsonString());
		builder.append(", ");
		builder.append(jqPlotToJson(chart.getChartConfiguration()));
		builder.append(");\r\n");
		builder.append("});\r\n");
		return builder.toString();
	}
	

	public static String jqPlotToJson(ChartConfiguration<?> jqPlot) {
		Gson gson = new GsonBuilder()
		.setPrettyPrinting()
		.registerTypeAdapter(JqPlotResources.class,new JqPlotSerializar())
		.create();
		return gson.toJson(jqPlot);
	}
}
