package com.robin.springcloud.mapper;

import com.robin.springcloud.entities.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//@Mapper
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
