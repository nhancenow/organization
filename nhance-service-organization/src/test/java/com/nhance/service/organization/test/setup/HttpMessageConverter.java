package com.nhance.service.organization.test.setup;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

/**
 * The Class HttpMessageConverter.
 */
public class HttpMessageConverter extends AbstractHttpMessageConverter<Object> {
	
	Logger logger = Logger.getLogger(HttpMessageConverter.class);
	
	@Override
	protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
		try {
			byte[] payload = IOUtils.toByteArray(inputMessage.getBody()) ;
			logger.info("Request From Frontend : " + new String(payload));
			Object object = (Object) new JSONUtil().fromJSON(new String(payload), clazz);
			return object;
		} catch (IOException ex) {
			throw new HttpMessageNotReadableException("Could not read JSON: " + ex.getMessage(), ex);
		}
	}

	@Override
	protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		String jsonString = new JSONUtil().toJSON(object) ;
		logger.info("Response To Frontend : " + jsonString);
		byte[]  payload = jsonString.getBytes() ;
		IOUtils.write(payload, outputMessage.getBody());
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return true;
	}

}

