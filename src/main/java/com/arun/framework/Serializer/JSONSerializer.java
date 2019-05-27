package com.arun.framework.Serializer;

import org.testng.util.Strings;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.arun.framework.Serializer.interfaces.Serializable;

public class JSONSerializer implements Serializable {

	static ObjectMapper jsonMapper = new ObjectMapper();


	/**
	 * Converts a JSON string to POJO
	 * 
	 * @param json
	 *            - JSON string
	 * @param type
	 *            - type of class with respect to POJO
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @author Arun Baluni
	 */
	public <T> T stringToPOJO(String json, Class<T> type) throws Exception {
		if (Strings.isNullOrEmpty(json)) {
			throw new Exception("Input json is empty or null");
		}
		
		return jsonMapper.readValue(json, type);
	}
}
