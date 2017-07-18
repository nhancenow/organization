package com.nhance.service.organization.test.setup;

import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

/**
 * The Class JSONAdaptor.
 */
@Component("jsonUtil")
public class JSONUtil {

	/** The gson. */
	private final Gson gson;

	/**
	 * Instantiates a new jSON adaptor.
	 */
	public JSONUtil() {
		final GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
		gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());
		gson = gsonBuilder.create();
	}

	/**
	 * To json.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param t
	 *            the t
	 * @return the string
	 */
	public <T> String toJSON(T t) {
		return gson.toJson(t, t.getClass());
	}

	/**
	 * From json.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param jsonStr
	 *            the json str
	 * @param c
	 *            the c
	 * @return the t
	 * @throws JsonSyntaxException
	 *             the json syntax exception
	 */
	public <T> T fromJSON(String jsonStr, Class<T> c) throws JsonSyntaxException {
		JsonReader reader = new JsonReader(new StringReader(jsonStr));
		reader.setLenient(true);
		return gson.fromJson(reader, c);
	}

	/**
	 * The Class DateSerializer.
	 */
	private class DateSerializer implements JsonSerializer<Date> {

		/* (non-Javadoc)
		 * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)
		 */
		public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
			return new JsonPrimitive(date.getTime());
		}
	}

	/**
	 * The Class DateDeserializer.
	 */
	private class DateDeserializer implements JsonDeserializer<Date> {

		/* (non-Javadoc)
		 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
		 */
		public Date deserialize(JsonElement ele, Type type, JsonDeserializationContext context) throws JsonParseException {
			String dateStr = ele.getAsString();
			if (dateStr == null || dateStr.trim().length() == 0) {
				return null;
			}
			return new Date(Long.parseLong(dateStr));
		}
	}
}
