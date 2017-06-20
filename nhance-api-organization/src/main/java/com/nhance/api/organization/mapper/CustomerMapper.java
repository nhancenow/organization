package com.nhance.api.organization.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.bom.organization.domain.Customer;

@Mapper
public interface CustomerMapper {
	
	CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
	@Mapping(source = "addressDto", target = "organizationAddress")
	public Customer mapModelToEntity(CustomerDto dto);
	
	@InheritInverseConfiguration
	public CustomerDto mapEntityToModel(Customer customer);

}
