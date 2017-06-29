/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: AddressRepositoryTest.java
*
* Date Author Changes
* 19 Jun, 2017 Saroj Created
*/
package com.nhance.api.address.test.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.address.repository.AddressRepository;
import com.nhance.api.address.test.setup.AddressTestSetup;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.domain.StatusEnum;

/**
 * The Class AddressRepositoryTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AddressTestSetup.class })
@ActiveProfiles(profiles = "test")
public class AddressRepositoryTest {
	
	/** The address repository. */
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * Clean up.
	 */
	@After
	public void cleanUp() {
		addressRepository.deleteAll();
	}
	
	/**
	 * Adds the address.
	 */
	@Test
	public void addAddress() {
		Address address = new Address();
		address.setAddressType(AddressType.OFFICE.getCode());
		address.setName("Address Test");
		address.setMobileNumber("9620521051");
		address.setLineOne("lineOne");
		address.setLineTwo("lineTwo");
		address.setCountry("country");
		address.setState("state");
		address.setDistrict("district");
		address.setCity("city");
		address.setPinCode("pinCode");
		address.setStatus(StatusEnum.ACTIVE.getCode());
		address = addressRepository.save(address);
		Assert.assertNotNull(address.getId());
	}

}
 