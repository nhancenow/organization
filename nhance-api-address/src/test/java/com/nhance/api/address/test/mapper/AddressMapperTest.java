/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: AddressMapperTest.java
*
* Date Author Changes
* 16 Jun, 2017 Saroj Created
*/
package com.nhance.api.address.test.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.address.mapper.AddressMapper;
import com.nhance.api.address.test.setup.AddressTestSetup;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.domain.StatusEnum;

/**
 * The Class AddressMapperTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AddressTestSetup.class })
@ActiveProfiles(profiles = "test")
public class AddressMapperTest {
	
	/**
	 * Map model to entity.
	 */
	@Test
	public void mapModelToEntity() {
		AddressDto addressDto = createAddressDto();
		Address address = AddressMapper.INSTANCE.mapModelToEntity(addressDto);
		Assert.assertEquals(addressDto.getCity(), address.getCity());
		Assert.assertEquals(addressDto.getCountry(), address.getCountry());
		Assert.assertEquals(addressDto.getDistrict(), address.getDistrict());
		Assert.assertEquals(addressDto.getLatitude(), address.getLatitude());
		Assert.assertEquals(addressDto.getLineOne(), address.getLineOne());
		Assert.assertEquals(addressDto.getLineTwo(), address.getLineTwo());
		Assert.assertEquals(addressDto.getLongitude(), address.getLongitude());
		Assert.assertEquals(addressDto.getMobileNumber(), address.getMobileNumber());
		Assert.assertEquals(addressDto.getName(), address.getName());
		Assert.assertEquals(addressDto.getPinCode(), address.getPinCode());
		Assert.assertEquals(addressDto.getState(), address.getState());
		Assert.assertEquals(addressDto.getAddressType(), address.getAddressType());
	}
	
	/**
	 * Map entity to model.
	 */
	@Test
	public void mapEntityToModel() {
		Address address = createAddress();
		AddressDto dto = AddressMapper.INSTANCE.mapEntityToModel(address);
		Assert.assertEquals(address.getCity(), dto.getCity());
		Assert.assertEquals(address.getCountry(), dto.getCountry());
		Assert.assertEquals(address.getDistrict(), dto.getDistrict());
		Assert.assertEquals(address.getLatitude(), dto.getLatitude());
		Assert.assertEquals(address.getLineOne(), dto.getLineOne());
		Assert.assertEquals(address.getLineTwo(), dto.getLineTwo());
		Assert.assertEquals(address.getLongitude(), dto.getLongitude());
		Assert.assertEquals(address.getMobileNumber(), dto.getMobileNumber());
		Assert.assertEquals(address.getName(), dto.getName());
		Assert.assertEquals(address.getPinCode(), dto.getPinCode());
		Assert.assertEquals(address.getState(), dto.getState());
		Assert.assertEquals(address.getAddressType(), dto.getAddressType());
	}

	/**
	 * Creates the address.
	 *
	 * @return the address
	 */
	private Address createAddress() {
		Address address = new Address();
		address.setAddressType(AddressType.OFFICE.getCode());
		address.setName("Saroj_A");
		address.setMobileNumber("9620521051_A");
		address.setLineOne("lineOne_A");
		address.setLineTwo("lineTwo_A");
		address.setCountry("country_A");
		address.setState("state_A");
		address.setDistrict("district_A");
		address.setCity("city_A");
		address.setPinCode("pinCode_A");
		address.setLatitude("10.77_A");
		address.setLongitude("11.55_A");
		address.setStatus(StatusEnum.ACTIVE.getCode());
		return address;
	}

	/**
	 * Creates the address dto.
	 *
	 * @return the address dto
	 */
	private AddressDto createAddressDto() {
		AddressDto addressDto = new AddressDto();
		addressDto.setAddressType(AddressType.OFFICE.getCode());
		addressDto.setName("Saroj");
		addressDto.setMobileNumber("9620521051");
		addressDto.setLineOne("lineOne");
		addressDto.setLineTwo("lineTwo");
		addressDto.setCountry("country");
		addressDto.setState("state");
		addressDto.setDistrict("district");
		addressDto.setCity("city");
		addressDto.setPinCode("pinCode");
		addressDto.setLatitude("10.77");
		addressDto.setLongitude("11.55");
		return addressDto;
	}

}
