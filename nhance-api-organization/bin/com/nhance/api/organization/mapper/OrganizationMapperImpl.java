package com.nhance.api.organization.mapper;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Organization;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-20T15:38:51+0530",
    comments = "version: 1.2.0.Beta3, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class OrganizationMapperImpl implements OrganizationMapper {

    @Override
    public Organization mapModelToEntity(OrganizationDto dto) {
        if ( dto == null ) {
            return null;
        }

        Organization organization = new Organization();

        organization.setOrganizationAddress( addressDtoToAddress( dto.getAddressDto() ) );
        organization.setOrganizationCode( dto.getOrganizationCode() );
        organization.setOrganizationName( dto.getOrganizationName() );
        organization.setOrganizationType( dto.getOrganizationType() );
        organization.setOrganizationEmail( dto.getOrganizationEmail() );
        organization.setOrganizationPhone( dto.getOrganizationPhone() );
        organization.setOrganizationStatus( dto.getOrganizationStatus() );
        organization.setOrganizationOnboardDate( dto.getOrganizationOnboardDate() );
        organization.setOrganizationOnboardedBy( dto.getOrganizationOnboardedBy() );
        organization.setOrganizationLogo( dto.getOrganizationLogo() );
        organization.setCountry( countryDtoToCountry( dto.getCountry() ) );
        organization.setCurrency( currencyDtoToCurrency( dto.getCurrency() ) );
        organization.setTimeZones( timeZoneDtoListToTimeZoneSet( dto.getTimeZones() ) );

        return organization;
    }

    @Override
    public OrganizationDto mapEntityToModel(Organization organization) {
        if ( organization == null ) {
            return null;
        }

        OrganizationDto organizationDto = new OrganizationDto();

        organizationDto.setAddressDto( addressToAddressDto( organization.getOrganizationAddress() ) );
        organizationDto.setOrganizationCode( organization.getOrganizationCode() );
        organizationDto.setOrganizationName( organization.getOrganizationName() );
        organizationDto.setOrganizationType( organization.getOrganizationType() );
        organizationDto.setOrganizationEmail( organization.getOrganizationEmail() );
        organizationDto.setOrganizationPhone( organization.getOrganizationPhone() );
        organizationDto.setOrganizationStatus( organization.getOrganizationStatus() );
        organizationDto.setOrganizationOnboardDate( organization.getOrganizationOnboardDate() );
        organizationDto.setOrganizationOnboardedBy( organization.getOrganizationOnboardedBy() );
        organizationDto.setOrganizationLogo( organization.getOrganizationLogo() );
        organizationDto.setCountry( countryToCountryDto( organization.getCountry() ) );
        organizationDto.setCurrency( currencyToCurrencyDto( organization.getCurrency() ) );
        organizationDto.setTimeZones( timeZoneSetToTimeZoneDtoList( organization.getTimeZones() ) );

        return organizationDto;
    }

    protected Address addressDtoToAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setName( addressDto.getName() );
        address.setMobileNumber( addressDto.getMobileNumber() );
        address.setLineOne( addressDto.getLineOne() );
        address.setLineTwo( addressDto.getLineTwo() );
        address.setAddressType( addressDto.getAddressType() );
        address.setCountry( addressDto.getCountry() );
        address.setState( addressDto.getState() );
        address.setDistrict( addressDto.getDistrict() );
        address.setCity( addressDto.getCity() );
        address.setPinCode( addressDto.getPinCode() );
        address.setLatitude( addressDto.getLatitude() );
        address.setLongitude( addressDto.getLongitude() );

        return address;
    }

    protected Country countryDtoToCountry(CountryDto countryDto) {
        if ( countryDto == null ) {
            return null;
        }

        Country country = new Country();

        country.setName( countryDto.getName() );
        country.setCode( countryDto.getCode() );

        return country;
    }

    protected Currency currencyDtoToCurrency(CurrencyDto currencyDto) {
        if ( currencyDto == null ) {
            return null;
        }

        Currency currency = new Currency();

        currency.setName( currencyDto.getName() );
        currency.setCode( currencyDto.getCode() );
        currency.setUnicode( currencyDto.getUnicode() );

        return currency;
    }

    protected TimeZone timeZoneDtoToTimeZone(TimeZoneDto timeZoneDto) {
        if ( timeZoneDto == null ) {
            return null;
        }

        TimeZone timeZone = new TimeZone();

        timeZone.setName( timeZoneDto.getName() );
        timeZone.setCode( timeZoneDto.getCode() );

        return timeZone;
    }

    protected Set<TimeZone> timeZoneDtoListToTimeZoneSet(List<TimeZoneDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<TimeZone> set = new HashSet<TimeZone>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( TimeZoneDto timeZoneDto : list ) {
            set.add( timeZoneDtoToTimeZone( timeZoneDto ) );
        }

        return set;
    }

    protected AddressDto addressToAddressDto(Address address) {
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

    protected CountryDto countryToCountryDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setName( country.getName() );
        countryDto.setCode( country.getCode() );

        return countryDto;
    }

    protected CurrencyDto currencyToCurrencyDto(Currency currency) {
        if ( currency == null ) {
            return null;
        }

        CurrencyDto currencyDto = new CurrencyDto();

        currencyDto.setName( currency.getName() );
        currencyDto.setCode( currency.getCode() );
        currencyDto.setUnicode( currency.getUnicode() );

        return currencyDto;
    }

    protected TimeZoneDto timeZoneToTimeZoneDto(TimeZone timeZone) {
        if ( timeZone == null ) {
            return null;
        }

        TimeZoneDto timeZoneDto = new TimeZoneDto();

        timeZoneDto.setName( timeZone.getName() );
        timeZoneDto.setCode( timeZone.getCode() );

        return timeZoneDto;
    }

    protected List<TimeZoneDto> timeZoneSetToTimeZoneDtoList(Set<TimeZone> set) {
        if ( set == null ) {
            return null;
        }

        List<TimeZoneDto> list = new ArrayList<TimeZoneDto>( set.size() );
        for ( TimeZone timeZone : set ) {
            list.add( timeZoneToTimeZoneDto( timeZone ) );
        }

        return list;
    }
}
