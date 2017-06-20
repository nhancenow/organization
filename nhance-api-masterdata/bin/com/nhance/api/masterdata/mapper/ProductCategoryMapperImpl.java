package com.nhance.api.masterdata.mapper;

import com.nhance.api.masterdata.dto.ProductCategoryDto;
import com.nhance.bom.masterdata.domain.ProductCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-06-20T15:38:41+0530",
    comments = "version: 1.1.0.CR1, compiler: javac, environment: Java 1.8.0_65 (Oracle Corporation)"
)
public class ProductCategoryMapperImpl implements ProductCategoryMapper {

    @Override
    public ProductCategory mapModelToEntity(ProductCategoryDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProductCategory productCategory = new ProductCategory();

        productCategory.setName( dto.getName() );
        productCategory.setCode( dto.getCode() );

        return productCategory;
    }

    @Override
    public ProductCategoryDto mapEntityToModel(ProductCategory productCategory) {
        if ( productCategory == null ) {
            return null;
        }

        ProductCategoryDto productCategoryDto = new ProductCategoryDto();

        productCategoryDto.setName( productCategory.getName() );
        productCategoryDto.setCode( productCategory.getCode() );

        return productCategoryDto;
    }
}
