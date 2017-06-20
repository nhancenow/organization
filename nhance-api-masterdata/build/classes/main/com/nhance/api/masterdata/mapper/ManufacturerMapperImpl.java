package com.nhance.api.masterdata.mapper;

import com.nhance.api.masterdata.dto.ManufacturerDto;
import com.nhance.bom.masterdata.domain.Manufacturer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-19T19:41:23+0530",
    comments = "version: 1.1.0.CR1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class ManufacturerMapperImpl implements ManufacturerMapper {

    @Override
    public Manufacturer mapModelToEntity(ManufacturerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Manufacturer manufacturer = new Manufacturer();

        manufacturer.setName( dto.getName() );
        manufacturer.setCode( dto.getCode() );

        return manufacturer;
    }

    @Override
    public ManufacturerDto mapEntityToModel(Manufacturer country) {
        if ( country == null ) {
            return null;
        }

        ManufacturerDto manufacturerDto = new ManufacturerDto();

        manufacturerDto.setName( country.getName() );
        manufacturerDto.setCode( country.getCode() );

        return manufacturerDto;
    }
}
