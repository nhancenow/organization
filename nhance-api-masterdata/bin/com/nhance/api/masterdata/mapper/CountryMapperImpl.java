package com.nhance.api.masterdata.mapper;

import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.bom.masterdata.domain.Country;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-20T15:38:41+0530",
    comments = "version: 1.1.0.CR1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Country mapModelToEntity(CountryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Country country = new Country();

        country.setName( dto.getName() );
        country.setCode( dto.getCode() );

        return country;
    }

    @Override
    public CountryDto mapEntityToModel(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setName( country.getName() );
        countryDto.setCode( country.getCode() );

        return countryDto;
    }
}
