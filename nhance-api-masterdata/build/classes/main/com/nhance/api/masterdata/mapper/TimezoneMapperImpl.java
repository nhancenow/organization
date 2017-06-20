package com.nhance.api.masterdata.mapper;

import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.bom.masterdata.domain.TimeZone;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-19T19:41:23+0530",
    comments = "version: 1.1.0.CR1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class TimezoneMapperImpl implements TimezoneMapper {

    @Override
    public TimeZone mapModelToEntity(TimeZoneDto dto) {
        if ( dto == null ) {
            return null;
        }

        TimeZone timeZone = new TimeZone();

        timeZone.setName( dto.getName() );
        timeZone.setCode( dto.getCode() );

        return timeZone;
    }

    @Override
    public TimeZoneDto mapEntityToModel(TimeZone country) {
        if ( country == null ) {
            return null;
        }

        TimeZoneDto timeZoneDto = new TimeZoneDto();

        timeZoneDto.setName( country.getName() );
        timeZoneDto.setCode( country.getCode() );

        return timeZoneDto;
    }
}
