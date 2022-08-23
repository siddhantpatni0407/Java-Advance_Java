package com.sid.springbootreactivemongocrud.util;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sid.springbootreactivemongocrud.dto.ProductDto;
import com.sid.springbootreactivemongocrud.entity.Product;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ProductDto entityToDto(Product product){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto){
        Product product = new Product();
        BeanUtils.copyProperties(productDto,product);
        return product;
    }
}
