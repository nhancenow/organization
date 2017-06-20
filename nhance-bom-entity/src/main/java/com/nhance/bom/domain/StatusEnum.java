package com.nhance.bom.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class StatusEnum.
 */
public class StatusEnum {

	/** The status map. */
	private static Map<Integer, String> statusMap = new HashMap<Integer, String>();

	/** The Constant ACTIVE. */
	public static final StatusEnum ACTIVE = new StatusEnum(1, "Active");

	/** The Constant INACTIVE. */
	public static final StatusEnum INACTIVE = new StatusEnum(2, "InActive");

	/** The Constant DELETED. */
	public static final StatusEnum DELETED = new StatusEnum(3, "Deleted");
	
	/** The code. */
	private Integer code;

	/** The text. */
	private String text;

	/**
	 * Gets the terminal status map.
	 * 
	 * @return the terminal status map
	 */
	public static Map<Integer, String> getStatusMap() {
		return statusMap;
	}

	/**
	 * Instantiates a new status enum.
	 * 
	 * @param code
	 *            the code
	 * @param text
	 *            the text
	 */
	public StatusEnum(Integer code, String text) {
		this.code = code;
		this.text = text;
		String exisintgValue = statusMap.put(code, text);
		if (exisintgValue != null) {

			throw new IllegalArgumentException("The code " + code
					+ " already exists in StatusEEnum");
		}
	}

	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public Integer getCode() {
		return code;
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
	 * Gets the message.
	 * 
	 * @param code
	 *            the code
	 * @return the message
	 */
	public static String getMessage(final Integer code) {
		if (statusMap.get(code) != null) {
			return statusMap.get(code);
		}
		return String.valueOf(code);
	}

}
