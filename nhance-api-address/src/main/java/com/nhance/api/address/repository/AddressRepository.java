/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: AddressRepository.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.address.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.nhance.bom.address.domain.Address;

/**
 * The Interface AddressRepository.
 */
@Repository("addressRepository")
public interface AddressRepository extends GraphRepository<Address> {
	
	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the address
	 */
	public Address findByName(String name);
	
	/**
	 * Find by mobile number.
	 *
	 * @param mobileNumber the mobile number
	 * @return the address
	 */
	public Address findByMobileNumber(String mobileNumber);
	
	/**
	 * Find by pin code.
	 *
	 * @param pinCode the pin code
	 * @return the address
	 */
	public Address findByPinCode(String pinCode);

}
