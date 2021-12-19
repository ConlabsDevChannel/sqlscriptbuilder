package dev.conlabs.sqlbuilder.lib;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHandler {

	/**
	 * Convert Map to JSON String
	 * @param map
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String parseMapToJson(Map map) {
		 String jsonStr = null;
		 
		 try {
			jsonStr = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(map);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		 
		return jsonStr;
	}
	
	/**
	 * Convert JSON String to Map Object
	 * @param json
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static Map parseJsonToMap(String json) {
		Map jsonMap = null;
		
		try {
			jsonMap = new ObjectMapper().readValue(json, LinkedHashMap.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return jsonMap;
	}
	
}
