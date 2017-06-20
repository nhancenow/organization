/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OutletMapperTest.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.test.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.api.organization.dto.OutletDto;
import com.nhance.api.organization.mapper.OutletMapper;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.bom.organization.domain.OrganizationType;
import com.nhance.bom.organization.domain.Outlet;
import com.nhnace.api.organization.test.setup.OrganizationTestSetup;

/**
 * The Class OutletMapperTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrganizationTestSetup.class })
@ActiveProfiles(profiles = "test")
public class OutletMapperTest {
	
	/**
	 * Map model to entity.
	 */
	@Test
	public void mapModelToEntity() {
		OutletDto outletDto = createOutletrDto();
		Outlet  outlet = OutletMapper.INSTANCE.mapModelToEntity(outletDto);
		Assert.assertEquals(outletDto.getOrganizationName(), outlet.getOrganizationName());
		Assert.assertEquals(outletDto.getOrganizationType(), outlet.getOrganizationType());
		Assert.assertEquals(outletDto.getOrganizationEmail(), outlet.getOrganizationEmail());
		Assert.assertEquals(outletDto.getOrganizationPhone(), outlet.getOrganizationPhone());
		Assert.assertEquals(outletDto.getOrganizationStatus(), outlet.getOrganizationStatus());
		Assert.assertEquals(outletDto.getOrganizationOnboardDate(), outlet.getOrganizationOnboardDate());
		Assert.assertEquals(outletDto.getOrganizationOnboardedBy(), outlet.getOrganizationOnboardedBy());
		Assert.assertEquals(outletDto.getOrganizationLogo(), outlet.getOrganizationLogo());
		Assert.assertEquals(outletDto.getCountry().getCode(), outlet.getCountry().getCode());
		Assert.assertEquals(outletDto.getCurrency().getCode(), outlet.getCurrency().getCode());
		
		Assert.assertEquals(outletDto.getAddressDto().getCity(), outlet.getOrganizationAddress().getCity());
		Assert.assertEquals(outletDto.getAddressDto().getCountry(), outlet.getOrganizationAddress().getCountry());
		Assert.assertEquals(outletDto.getAddressDto().getDistrict(), outlet.getOrganizationAddress().getDistrict());
		Assert.assertEquals(outletDto.getAddressDto().getLatitude(), outlet.getOrganizationAddress().getLatitude());
		Assert.assertEquals(outletDto.getAddressDto().getLineOne(), outlet.getOrganizationAddress().getLineOne());
		Assert.assertEquals(outletDto.getAddressDto().getLineTwo(), outlet.getOrganizationAddress().getLineTwo());
		Assert.assertEquals(outletDto.getAddressDto().getLongitude(), outlet.getOrganizationAddress().getLongitude());
		Assert.assertEquals(outletDto.getAddressDto().getMobileNumber(), outlet.getOrganizationAddress().getMobileNumber());
		Assert.assertEquals(outletDto.getAddressDto().getName(), outlet.getOrganizationAddress().getName());
		Assert.assertEquals(outletDto.getAddressDto().getPinCode(), outlet.getOrganizationAddress().getPinCode());
		Assert.assertEquals(outletDto.getAddressDto().getState(), outlet.getOrganizationAddress().getState());
		Assert.assertEquals(outletDto.getAddressDto().getAddressType(), outlet.getOrganizationAddress().getAddressType());
	}
	
	/**
	 * Map entity to model.
	 */
	@Test
	public void mapEntityToModel() {
		Outlet outlet = createOutlet();
		OutletDto outletDto = OutletMapper.INSTANCE.mapEntityToModel(outlet);
		Assert.assertEquals(outlet.getOrganizationName(), outletDto.getOrganizationName());
		Assert.assertEquals(outlet.getOrganizationType(), outletDto.getOrganizationType());
		Assert.assertEquals(outlet.getOrganizationEmail(), outletDto.getOrganizationEmail());
		Assert.assertEquals(outlet.getOrganizationPhone(), outletDto.getOrganizationPhone());
		Assert.assertEquals(outlet.getOrganizationStatus(), outletDto.getOrganizationStatus());
		Assert.assertEquals(outlet.getOrganizationOnboardDate(), outletDto.getOrganizationOnboardDate());
		Assert.assertEquals(outlet.getOrganizationOnboardedBy(), outletDto.getOrganizationOnboardedBy());
		Assert.assertEquals(outlet.getOrganizationLogo(), outletDto.getOrganizationLogo());
		Assert.assertEquals(outlet.getCountry().getCode(), outletDto.getCountry().getCode());
		Assert.assertEquals(outlet.getCurrency().getCode(), outletDto.getCurrency().getCode());
		
		Assert.assertEquals(outlet.getOrganizationAddress().getCity(), outletDto.getAddressDto().getCity());
		Assert.assertEquals(outlet.getOrganizationAddress().getCountry(), outletDto.getAddressDto().getCountry());
		Assert.assertEquals(outlet.getOrganizationAddress().getDistrict(), outletDto.getAddressDto().getDistrict());
		Assert.assertEquals(outlet.getOrganizationAddress().getLatitude(), outletDto.getAddressDto().getLatitude());
		Assert.assertEquals(outlet.getOrganizationAddress().getLineOne(), outletDto.getAddressDto().getLineOne());
		Assert.assertEquals(outlet.getOrganizationAddress().getLineTwo(), outletDto.getAddressDto().getLineTwo());
		Assert.assertEquals(outlet.getOrganizationAddress().getLongitude(), outletDto.getAddressDto().getLongitude());
		Assert.assertEquals(outlet.getOrganizationAddress().getMobileNumber(), outletDto.getAddressDto().getMobileNumber());
		Assert.assertEquals(outlet.getOrganizationAddress().getName(), outletDto.getAddressDto().getName());
		Assert.assertEquals(outlet.getOrganizationAddress().getPinCode(), outletDto.getAddressDto().getPinCode());
		Assert.assertEquals(outlet.getOrganizationAddress().getState(), outletDto.getAddressDto().getState());
		Assert.assertEquals(outlet.getOrganizationAddress().getAddressType(), outletDto.getAddressDto().getAddressType());
	}

	/**
	 * Creates the outlet.
	 *
	 * @return the outlet
	 */
	private Outlet createOutlet() {
		Outlet outlet = new Outlet();
		outlet.setOrganizationName("Organization1");
		outlet.setOrganizationType(OrganizationType.BRAND.getCode());
		outlet.setOrganizationEmail("saroj3030@gmail.com");
		outlet.setOrganizationPhone("9620521051");
		outlet.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		outlet.setOrganizationOnboardDate(new Date());
		outlet.setOrganizationOnboardedBy("Saroj");
		outlet.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		outlet.setOrganizationOnboardedBy("saroj");
		
		Country country = new Country();
		country.setCode("IND");
		outlet.setCountry(country);
		
		Currency currency = new Currency();
		currency.setCode("INR");
		outlet.setCurrency(currency);
		
		Set<TimeZone> timeZones = new HashSet<TimeZone>();
		TimeZone timeZone = new TimeZone();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZone();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		outlet.setTimeZones(timeZones);
		
		Address address = new Address();
		address.setAddressType(AddressType.OFFICE.getCode());
		address.setName("Saroj");
		address.setMobileNumber("9620521051");
		address.setLineOne("lineOne");
		address.setLineTwo("lineTwo");
		address.setCountry("country");
		address.setState("state");
		address.setDistrict("district");
		address.setCity("city");
		address.setPinCode("pinCode");
		outlet.setOrganizationAddress(address);
		
		return outlet;
		
	}

	/**
	 * Creates the outletr dto.
	 *
	 * @return the outlet dto
	 */
	private OutletDto createOutletrDto() {
		OutletDto outletDto = new OutletDto();
		outletDto.setOrganizationName("Organization1");
		outletDto.setOrganizationType(OrganizationType.BRAND.getCode());
		outletDto.setOrganizationEmail("saroj3030@gmail.com");
		outletDto.setOrganizationPhone("9620521051");
		outletDto.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		outletDto.setOrganizationOnboardDate(new Date());
		outletDto.setOrganizationOnboardedBy("Saroj");
		outletDto.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		outletDto.setOrganizationOnboardedBy("saroj");
		
		CountryDto country = new CountryDto();
		country.setCode("IND");
		outletDto.setCountry(country);
		
		CurrencyDto currency = new CurrencyDto();
		currency.setCode("INR");
		outletDto.setCurrency(currency);
		
		List<TimeZoneDto> timeZones = new ArrayList<TimeZoneDto>();
		TimeZoneDto timeZone = new TimeZoneDto();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZoneDto();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		outletDto.setTimeZones(timeZones);
		
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
		outletDto.setAddressDto(addressDto);
		
		return outletDto;
		
	}

}
