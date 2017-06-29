package com.nhance.api.address.mapper;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.bom.address.domain.Address;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-29T17:28:44+0530",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address mapModelToEntity(AddressDto dto) {
        if ( dto == null ) {
            return null;
        }

        Address address = new Address();

        address.setName( dto.getName() );
        address.setMobileNumber( dto.getMobileNumber() );
        address.setLineOne( dto.getLineOne() );
        address.setLineTwo( dto.getLineTwo() );
        address.setAddressType( dto.getAddressType() );
        address.setCountry( dto.getCountry() );
        address.setState( dto.getState() );
        address.setDistrict( dto.getDistrict() );
        address.setCity( dto.getCity() );
        address.setPinCode( dto.getPinCode() );
        address.setLatitude( dto.getLatitude() );
        address.setLongitude( dto.getLongitude() );

        return address;
    }

    @Override
    public AddressDto mapEntityToModel(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setName( address.getName() );
        addressDto.setMobileNumber( address.getMobileNumber() );
        addressDto.setLineOne( address.getLineOne() );
        addressDto.setLineTwo( address.getLineTwo() );
        addressDto.setAddressType( address.getAddressType() );
        addressDto.setCountry( address.getCountry() );
        addressDto.setState( address.getState() );
        addressDto.setDistrict( address.getDistrict() );
        addressDto.setCity( address.getCity() );
        addressDto.setPinCode( address.getPinCode() );
        addressDto.setLatitude( address.getLatitude() );
        addressDto.setLongitude( address.getLongitude() );

        return addressDto;
    }
}
