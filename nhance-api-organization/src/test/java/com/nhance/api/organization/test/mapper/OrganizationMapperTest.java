/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationMapperTest.java
*
* Date Author Changes
* 16 Jun, 2017 Saroj Created
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
import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.api.organization.mapper.OrganizationMapper;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Organization;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.bom.organization.domain.OrganizationType;
import com.nhnace.api.organization.test.setup.OrganizationTestSetup;

/**
 * The Class OrganizationMapperTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrganizationTestSetup.class })
@ActiveProfiles(profiles = "test")
public class OrganizationMapperTest {
	
	/**
	 * Map model to entity.
	 */
	@Test
	public void mapModelToEntity() {
		OrganizationDto organizationDto = createOrganizationDto();
		Organization  organization = OrganizationMapper.INSTANCE.mapModelToEntity(organizationDto);
		Assert.assertEquals(organizationDto.getOrganizationName(), organization.getOrganizationName());
		Assert.assertEquals(organizationDto.getOrganizationType(), organization.getOrganizationType());
		Assert.assertEquals(organizationDto.getOrganizationEmail(), organization.getOrganizationEmail());
		Assert.assertEquals(organizationDto.getOrganizationPhone(), organization.getOrganizationPhone());
		Assert.assertEquals(organizationDto.getOrganizationStatus(), organization.getOrganizationStatus());
		Assert.assertEquals(organizationDto.getOrganizationOnboardDate(), organization.getOrganizationOnboardDate());
		Assert.assertEquals(organizationDto.getOrganizationOnboardedBy(), organization.getOrganizationOnboardedBy());
		Assert.assertEquals(organizationDto.getOrganizationLogo(), organization.getOrganizationLogo());
		Assert.assertEquals(organizationDto.getCountry().getCode(), organization.getCountry().getCode());
		Assert.assertEquals(organizationDto.getCurrency().getCode(), organization.getCurrency().getCode());
		
		Assert.assertEquals(organizationDto.getAddressDto().getCity(), organization.getOrganizationAddress().getCity());
		Assert.assertEquals(organizationDto.getAddressDto().getCountry(), organization.getOrganizationAddress().getCountry());
		Assert.assertEquals(organizationDto.getAddressDto().getDistrict(), organization.getOrganizationAddress().getDistrict());
		Assert.assertEquals(organizationDto.getAddressDto().getLatitude(), organization.getOrganizationAddress().getLatitude());
		Assert.assertEquals(organizationDto.getAddressDto().getLineOne(), organization.getOrganizationAddress().getLineOne());
		Assert.assertEquals(organizationDto.getAddressDto().getLineTwo(), organization.getOrganizationAddress().getLineTwo());
		Assert.assertEquals(organizationDto.getAddressDto().getLongitude(), organization.getOrganizationAddress().getLongitude());
		Assert.assertEquals(organizationDto.getAddressDto().getMobileNumber(), organization.getOrganizationAddress().getMobileNumber());
		Assert.assertEquals(organizationDto.getAddressDto().getName(), organization.getOrganizationAddress().getName());
		Assert.assertEquals(organizationDto.getAddressDto().getPinCode(), organization.getOrganizationAddress().getPinCode());
		Assert.assertEquals(organizationDto.getAddressDto().getState(), organization.getOrganizationAddress().getState());
		Assert.assertEquals(organizationDto.getAddressDto().getAddressType(), organization.getOrganizationAddress().getAddressType());
	}
	
	/**
	 * Map entity to model.
	 */
	@Test
	public void mapEntityToModel() {
		Organization organization = createOrganization();
		OrganizationDto  organizationDto = OrganizationMapper.INSTANCE.mapEntityToModel(organization);
		Assert.assertEquals(organization.getOrganizationName(), organizationDto.getOrganizationName());
		Assert.assertEquals(organization.getOrganizationType(), organizationDto.getOrganizationType());
		Assert.assertEquals(organization.getOrganizationEmail(), organizationDto.getOrganizationEmail());
		Assert.assertEquals(organization.getOrganizationPhone(), organizationDto.getOrganizationPhone());
		Assert.assertEquals(organization.getOrganizationStatus(), organizationDto.getOrganizationStatus());
		Assert.assertEquals(organization.getOrganizationOnboardDate(), organizationDto.getOrganizationOnboardDate());
		Assert.assertEquals(organization.getOrganizationOnboardedBy(), organizationDto.getOrganizationOnboardedBy());
		Assert.assertEquals(organization.getOrganizationLogo(), organizationDto.getOrganizationLogo());
		Assert.assertEquals(organization.getCountry().getCode(), organizationDto.getCountry().getCode());
		Assert.assertEquals(organization.getCurrency().getCode(), organizationDto.getCurrency().getCode());
		
		Assert.assertEquals(organization.getOrganizationAddress().getCity(), organizationDto.getAddressDto().getCity());
		Assert.assertEquals(organization.getOrganizationAddress().getCountry(), organizationDto.getAddressDto().getCountry());
		Assert.assertEquals(organization.getOrganizationAddress().getDistrict(), organizationDto.getAddressDto().getDistrict());
		Assert.assertEquals(organization.getOrganizationAddress().getLatitude(), organizationDto.getAddressDto().getLatitude());
		Assert.assertEquals(organization.getOrganizationAddress().getLineOne(), organizationDto.getAddressDto().getLineOne());
		Assert.assertEquals(organization.getOrganizationAddress().getLineTwo(), organizationDto.getAddressDto().getLineTwo());
		Assert.assertEquals(organization.getOrganizationAddress().getLongitude(), organizationDto.getAddressDto().getLongitude());
		Assert.assertEquals(organization.getOrganizationAddress().getMobileNumber(), organizationDto.getAddressDto().getMobileNumber());
		Assert.assertEquals(organization.getOrganizationAddress().getName(), organizationDto.getAddressDto().getName());
		Assert.assertEquals(organization.getOrganizationAddress().getPinCode(), organizationDto.getAddressDto().getPinCode());
		Assert.assertEquals(organization.getOrganizationAddress().getState(), organizationDto.getAddressDto().getState());
		Assert.assertEquals(organization.getOrganizationAddress().getAddressType(), organizationDto.getAddressDto().getAddressType());
	}

	/**
	 * Creates the organization.
	 *
	 * @return the organization
	 */
	private Organization createOrganization() {
		Organization organization = new Organization();
		organization.setOrganizationName("Organization1");
		organization.setOrganizationType(OrganizationType.BRAND.getCode());
		organization.setOrganizationEmail("saroj3030@gmail.com");
		organization.setOrganizationPhone("9620521051");
		organization.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		organization.setOrganizationOnboardDate(new Date());
		organization.setOrganizationOnboardedBy("Saroj");
		organization.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		
		Country country = new Country();
		country.setCode("IND");
		organization.setCountry(country);
		
		Currency currency = new Currency();
		currency.setCode("INR");
		organization.setCurrency(currency);
		
		Set<TimeZone> timeZones = new HashSet<TimeZone>();
		TimeZone timeZone = new TimeZone();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZone();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		organization.setTimeZones(timeZones);
		
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
		organization.setOrganizationAddress(address);
		
		return organization;
	}

	/**
	 * Creates the organization dto.
	 *
	 * @return the organization dto
	 */
	private OrganizationDto createOrganizationDto() {
		OrganizationDto organizationDto = new OrganizationDto();
		organizationDto.setOrganizationName("Organization1");
		organizationDto.setOrganizationType(OrganizationType.BRAND.getCode());
		organizationDto.setOrganizationEmail("saroj3030@gmail.com");
		organizationDto.setOrganizationPhone("9620521051");
		organizationDto.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		organizationDto.setOrganizationOnboardDate(new Date());
		organizationDto.setOrganizationOnboardedBy("Saroj");
		organizationDto.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		
		CountryDto countryDto = new CountryDto();
		countryDto.setCode("IND");
		organizationDto.setCountry(countryDto);
		
		CurrencyDto currencyDto = new CurrencyDto();
		currencyDto.setCode("INR");
		organizationDto.setCurrency(currencyDto);
		
		List<TimeZoneDto> timeZones = new ArrayList<TimeZoneDto>();
		TimeZoneDto timeZoneDto = new TimeZoneDto();
		timeZoneDto.setCode("IST");
		timeZones.add(timeZoneDto);
		
		timeZoneDto = new TimeZoneDto();
		timeZoneDto.setCode("UTC");
		timeZones.add(timeZoneDto);
		organizationDto.setTimeZones(timeZones);
		
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
		organizationDto.setAddressDto(addressDto);
		
		return organizationDto;
	}

}
