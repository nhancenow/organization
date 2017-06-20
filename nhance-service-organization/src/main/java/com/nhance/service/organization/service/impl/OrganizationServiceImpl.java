/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationServiceImpl.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhance.api.address.mapper.AddressMapper;
import com.nhance.api.masterdata.dto.ManufacturerDto;
import com.nhance.api.masterdata.dto.ProductCategoryDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.api.masterdata.repository.MasterdataRepository;
import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.api.organization.mapper.OrganizationMapper;
import com.nhance.api.organization.repository.OrganizationRepository;
import com.nhance.api.organization.repository.OrganizationSequenceRepository;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.domain.SequenceDefinition;
import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Customer;
import com.nhance.bom.organization.domain.Organization;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.service.organization.service.OrganizationService;

/**
 * The Class OrganizationServiceImpl.
 */
@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {
	
	/** The organization repository. */
	@Autowired
	private OrganizationRepository organizationRepository;
	
	/** The masterdata repository. */
	@Autowired
	private MasterdataRepository masterdataRepository;
	
	/** The Organization mapper. */
	@Autowired
	private OrganizationMapper OrganizationMapper;
	
	@Autowired
	private AddressMapper addressMapper;

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#addOrganization(com.nhance.api.organization.dto.OrganizationDto)
	 */
	@SuppressWarnings("static-access")
	@Override
	@Transactional
	public OrganizationDto addOrganization(OrganizationDto organizationDto) {
		
		List<String> list = null;
		
		Organization organization = OrganizationMapper.INSTANCE.mapModelToEntity(organizationDto);
		organizationRepository.save(organization);
		
		Country country = masterdataRepository.findByCountryCode(organizationDto.getCountry().getCode());
		if(null != country)
			organization.setCountry(country);
		
		Currency currency = masterdataRepository.findByCurrencyCode(organizationDto.getCurrency().getCode());
		if(null != currency)
			organization.setCurrency(currency);
		
		if(CollectionUtils.isNotEmpty(organizationDto.getTimeZones())) {
			list = new ArrayList<String>();
			for (TimeZoneDto dto : organizationDto.getTimeZones()) {
				list.add(dto.getCode());
			}
			Set<TimeZone> timeZones = masterdataRepository.findByTimezoneCode(list);
			if(CollectionUtils.isNotEmpty(timeZones))
				organization.setTimeZones(timeZones);
		}
		
		Address address = addressMapper.INSTANCE.mapModelToEntity(organizationDto.getAddressDto());
		address.setStatus(OrganizationStatus.ACTIVE.getCode());
		masterdataRepository.save(address);
		organization.setOrganizationAddress(address);
		
		Customer customer = new Customer();
		
		if(CollectionUtils.isNotEmpty(organizationDto.getProductCategory())) {
			list = new ArrayList<String>();
			for (ProductCategoryDto dto : organizationDto.getProductCategory()) {
				list.add(dto.getCode());
			}
			Set<ProductCategory> productCategories = masterdataRepository.findByProductCategory(list);
			if(CollectionUtils.isNotEmpty(productCategories))
				customer.setProductCategories(productCategories);
		}
		
		if(CollectionUtils.isNotEmpty(organizationDto.getManufacturer())) {
			list = new ArrayList<String>();
			for (ManufacturerDto dto : organizationDto.getManufacturer()) {
				list.add(dto.getCode());
			}
			Set<Manufacturer> manufacturers = masterdataRepository.findByManufacturer(list);
			if(CollectionUtils.isNotEmpty(manufacturers))
				customer.setManufacturers(manufacturers);
		}
		
		organizationRepository.save(customer);
		organizationRepository.save(organization);
		
		return organizationDto;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#updateOrganization(com.nhance.bom.organization.domain.Organization)
	 */
	@Override
	public Organization updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#loadOrganization(com.nhance.bom.organization.domain.Organization)
	 */
	@Override
	public Organization loadOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#listOrganization(com.nhance.bom.organization.domain.Organization)
	 */
	@Override
	public Map<String, String> listOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#viewOrganization(com.nhance.bom.organization.domain.Organization)
	 */
	@Override
	public List<Organization> viewOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.OrganizationService#deleteOrganization(com.nhance.bom.organization.domain.Organization)
	 */
	@Override
	public List<Organization> deleteOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Generate organization code.
	 *
	 * @return the string
	 */
	private String generateOrganizationCode() {
		SequenceStore organizationSequence = organizationSequenceRepository
				.findBySequenceCode(SequenceDefinition.ORGANIZATION_CODE.getCategoryCode());
		String organizationCode = StringUtils.leftPad(Long.toString(organizationSequence.getSequenceNumber()),
				SequenceDefinition.ORGANIZATION_CODE.getMinSeqLength(), '0');
		organizationSequence.setSequenceNumber(organizationSequence.getSequenceNumber() + 1);
		organizationSequence.setLastModifiedDate(new Date());
		organizationSequenceRepository.save(organizationSequence);
		return new StringBuilder().append(10).append(organizationCode).toString();
	}

}
