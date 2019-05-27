package com.arun.framework.Serializer.interfaces;

public interface Serializable {
	
	<T> T stringToPOJO(String object, Class<T> type) throws Exception;


}
