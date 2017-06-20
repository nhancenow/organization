/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NSeqEntity.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * The Class SequenceStore.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public class SequenceStore extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6923260710215556287L;

	/** The sequence number. */
	private Long sequenceNumber;

	/** The sequence name. */
	private String sequenceCode;

	/**
	 * Gets the sequence number.
	 *
	 * @return the sequence number
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the sequence number.
	 *
	 * @param sequenceNumber the new sequence number
	 */
	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * Gets the sequence code.
	 *
	 * @return the sequence code
	 */
	public String getSequenceCode() {
		return sequenceCode;
	}

	/**
	 * Sets the sequence code.
	 *
	 * @param sequenceCode the new sequence code
	 */
	public void setSequenceCode(String sequenceCode) {
		this.sequenceCode = sequenceCode;
	}
	

}
