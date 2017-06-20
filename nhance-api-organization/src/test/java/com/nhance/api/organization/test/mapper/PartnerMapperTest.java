/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PartnerMapperTest.java
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
import com.nhance.api.organization.dto.PartnerDto;
import com.nhance.api.organization.mapper.PartnerMapper;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.bom.organization.domain.OrganizationType;
import com.nhance.bom.organization.domain.Partner;
import com.nhance.bom.organization.domain.PartnerType;
import com.nhnace.api.organization.test.setup.OrganizationTestSetup;

/**
 * The Class PartnerMapperTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrganizationTestSetup.class })
@ActiveProfiles(profiles = "test")
public class PartnerMapperTest {
	
	/**
	 * Map model to entity.
	 */
	@Test
	public void mapModelToEntity() {
		PartnerDto partnerDto = createPartnerDto();
		Partner partner = PartnerMapper.INSTANCE.mapModelToEntity(partnerDto);
		Assert.assertEquals(partnerDto.getOrganizationName(), partner.getOrganizationName());
		Assert.assertEquals(partnerDto.getOrganizationType(), partner.getOrganizationType());
		Assert.assertEquals(partnerDto.getOrganizationEmail(), partner.getOrganizationEmail());
		Assert.assertEquals(partnerDto.getOrganizationPhone(), partner.getOrganizationPhone());
		Assert.assertEquals(partnerDto.getOrganizationStatus(), partner.getOrganizationStatus());
		Assert.assertEquals(partnerDto.getOrganizationOnboardDate(), partner.getOrganizationOnboardDate());
		Assert.assertEquals(partnerDto.getOrganizationOnboardedBy(), partner.getOrganizationOnboardedBy());
		Assert.assertEquals(partnerDto.getOrganizationLogo(), partner.getOrganizationLogo());
		Assert.assertEquals(partnerDto.getCountry().getCode(), partner.getCountry().getCode());
		Assert.assertEquals(partnerDto.getCurrency().getCode(), partner.getCurrency().getCode());
		
		Assert.assertEquals(partnerDto.getAddressDto().getCity(), partner.getOrganizationAddress().getCity());
		Assert.assertEquals(partnerDto.getAddressDto().getCountry(), partner.getOrganizationAddress().getCountry());
		Assert.assertEquals(partnerDto.getAddressDto().getDistrict(), partner.getOrganizationAddress().getDistrict());
		Assert.assertEquals(partnerDto.getAddressDto().getLatitude(), partner.getOrganizationAddress().getLatitude());
		Assert.assertEquals(partnerDto.getAddressDto().getLineOne(), partner.getOrganizationAddress().getLineOne());
		Assert.assertEquals(partnerDto.getAddressDto().getLineTwo(), partner.getOrganizationAddress().getLineTwo());
		Assert.assertEquals(partnerDto.getAddressDto().getLongitude(), partner.getOrganizationAddress().getLongitude());
		Assert.assertEquals(partnerDto.getAddressDto().getMobileNumber(), partner.getOrganizationAddress().getMobileNumber());
		Assert.assertEquals(partnerDto.getAddressDto().getName(), partner.getOrganizationAddress().getName());
		Assert.assertEquals(partnerDto.getAddressDto().getPinCode(), partner.getOrganizationAddress().getPinCode());
		Assert.assertEquals(partnerDto.getAddressDto().getState(), partner.getOrganizationAddress().getState());
		Assert.assertEquals(partnerDto.getAddressDto().getAddressType(), partner.getOrganizationAddress().getAddressType());
	}
	
	/**
	 * Map entity to model.
	 */
	@Test
	public void mapEntityToModel() {
		Partner partner = createPartner();
		PartnerDto partnerDto = PartnerMapper.INSTANCE.mapEntityToModel(partner);
		Assert.assertEquals(partner.getOrganizationName(), partnerDto.getOrganizationName());
		Assert.assertEquals(partner.getOrganizationType(), partnerDto.getOrganizationType());
		Assert.assertEquals(partner.getOrganizationEmail(), partnerDto.getOrganizationEmail());
		Assert.assertEquals(partner.getOrganizationPhone(), partnerDto.getOrganizationPhone());
		Assert.assertEquals(partner.getOrganizationStatus(), partnerDto.getOrganizationStatus());
		Assert.assertEquals(partner.getOrganizationOnboardDate(), partnerDto.getOrganizationOnboardDate());
		Assert.assertEquals(partner.getOrganizationOnboardedBy(), partnerDto.getOrganizationOnboardedBy());
		Assert.assertEquals(partner.getOrganizationLogo(), partnerDto.getOrganizationLogo());
		Assert.assertEquals(partner.getCountry().getCode(), partnerDto.getCountry().getCode());
		Assert.assertEquals(partner.getCurrency().getCode(), partnerDto.getCurrency().getCode());
		
		Assert.assertEquals(partner.getOrganizationAddress().getCity(), partnerDto.getAddressDto().getCity());
		Assert.assertEquals(partner.getOrganizationAddress().getCountry(), partnerDto.getAddressDto().getCountry());
		Assert.assertEquals(partner.getOrganizationAddress().getDistrict(), partnerDto.getAddressDto().getDistrict());
		Assert.assertEquals(partner.getOrganizationAddress().getLatitude(), partnerDto.getAddressDto().getLatitude());
		Assert.assertEquals(partner.getOrganizationAddress().getLineOne(), partnerDto.getAddressDto().getLineOne());
		Assert.assertEquals(partner.getOrganizationAddress().getLineTwo(), partnerDto.getAddressDto().getLineTwo());
		Assert.assertEquals(partner.getOrganizationAddress().getLongitude(), partnerDto.getAddressDto().getLongitude());
		Assert.assertEquals(partner.getOrganizationAddress().getMobileNumber(), partnerDto.getAddressDto().getMobileNumber());
		Assert.assertEquals(partner.getOrganizationAddress().getName(), partnerDto.getAddressDto().getName());
		Assert.assertEquals(partner.getOrganizationAddress().getPinCode(), partnerDto.getAddressDto().getPinCode());
		Assert.assertEquals(partner.getOrganizationAddress().getState(), partnerDto.getAddressDto().getState());
		Assert.assertEquals(partner.getOrganizationAddress().getAddressType(), partnerDto.getAddressDto().getAddressType());
	}

	/**
	 * Creates the partner.
	 *
	 * @return the partner
	 */
	private Partner createPartner() {
		Partner partner = new Partner();
		partner.setOrganizationName("Organization1");
		partner.setOrganizationType(OrganizationType.BRAND.getCode());
		partner.setOrganizationEmail("saroj3030@gmail.com");
		partner.setOrganizationPhone("9620521051");
		partner.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		partner.setOrganizationOnboardDate(new Date());
		partner.setOrganizationOnboardedBy("Saroj");
		partner.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		partner.setOrganizationOnboardedBy("saroj");
		partner.setPartnerType(PartnerType.ACCESSORIES.getCode());
		
		Country country = new Country();
		country.setCode("IND");
		partner.setCountry(country);
		
		Currency currency = new Currency();
		currency.setCode("INR");
		partner.setCurrency(currency);
		
		Set<TimeZone> timeZones = new HashSet<TimeZone>();
		TimeZone timeZone = new TimeZone();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZone();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		partner.setTimeZones(timeZones);
		
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
		partner.setOrganizationAddress(address);
		
		Set<Address> partnerAddress = new HashSet<Address>();
		Address branch1Address = new Address();
		branch1Address.setAddressType(AddressType.BRANCH_OFFICE.getCode());
		branch1Address.setName("Saroj");
		branch1Address.setMobileNumber("9620521051");
		branch1Address.setLineOne("lineOne");
		branch1Address.setLineTwo("lineTwo");
		branch1Address.setCountry("country");
		branch1Address.setState("state");
		branch1Address.setDistrict("district");
		branch1Address.setCity("city");
		branch1Address.setPinCode("pinCode");
		partnerAddress.add(branch1Address);
		partner.setPartnerAddress(partnerAddress);
		
		return partner;
		
	}

	/**
	 * Creates the partner dto.
	 *
	 * @return the partner dto
	 */
	private PartnerDto createPartnerDto() {
		PartnerDto partnerDto = new PartnerDto();
		partnerDto.setOrganizationName("Organization1");
		partnerDto.setOrganizationType(OrganizationType.BRAND.getCode());
		partnerDto.setOrganizationEmail("saroj3030@gmail.com");
		partnerDto.setOrganizationPhone("9620521051");
		partnerDto.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		partnerDto.setOrganizationOnboardDate(new Date());
		partnerDto.setOrganizationOnboardedBy("Saroj");
		partnerDto.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		partnerDto.setOrganizationOnboardedBy("saroj");
		partnerDto.setPartnerType(PartnerType.ACCESSORIES.getCode());
		
		CountryDto country = new CountryDto();
		country.setCode("IND");
		partnerDto.setCountry(country);
		
		CurrencyDto currency = new CurrencyDto();
		currency.setCode("INR");
		partnerDto.setCurrency(currency);
		
		List<TimeZoneDto> timeZones = new ArrayList<TimeZoneDto>();
		TimeZoneDto timeZone = new TimeZoneDto();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZoneDto();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		partnerDto.setTimeZones(timeZones);
		
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
		partnerDto.setAddressDto(addressDto);
		
		Set<AddressDto> partnerAddress = new HashSet<AddressDto>();
		AddressDto branch1Address = new AddressDto();
		branch1Address.setAddressType(AddressType.BRANCH_OFFICE.getCode());
		branch1Address.setName("Saroj");
		branch1Address.setMobileNumber("9620521051");
		branch1Address.setLineOne("lineOne");
		branch1Address.setLineTwo("lineTwo");
		branch1Address.setCountry("country");
		branch1Address.setState("state");
		branch1Address.setDistrict("district");
		branch1Address.setCity("city");
		branch1Address.setPinCode("pinCode");
		partnerAddress.add(branch1Address);
		partnerDto.setPartnerAddress(partnerAddress);
		
		return partnerDto;
		
	}

}
