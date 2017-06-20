package com.nhance.api.masterdata.mapper;

import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.bom.masterdata.domain.Currency;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-19T19:41:23+0530",
    comments = "version: 1.1.0.CR1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class CurrencyMapperImpl implements CurrencyMapper {

    @Override
    public Currency mapModelToEntity(CurrencyDto dto) {
        if ( dto == null ) {
            return null;
        }

        Currency currency = new Currency();

        currency.setName( dto.getName() );
        currency.setCode( dto.getCode() );
        currency.setUnicode( dto.getUnicode() );

        return currency;
    }

    @Override
    public CurrencyDto mapEntityToModel(Currency currency) {
        if ( currency == null ) {
            return null;
        }

        CurrencyDto currencyDto = new CurrencyDto();

        currencyDto.setName( currency.getName() );
        currencyDto.setCode( currency.getCode() );
        currencyDto.setUnicode( currency.getUnicode() );

        return currencyDto;
    }
}
