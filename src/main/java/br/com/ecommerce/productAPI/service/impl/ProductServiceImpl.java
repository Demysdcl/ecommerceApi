/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.service.impl;

import br.com.ecommerce.productAPI.entity.Product;
import br.com.ecommerce.productAPI.repository.ProductRepository;
import br.com.ecommerce.productAPI.service.ProductService;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author demys
 */
@Service("productService")
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer>
        implements ProductService{
    
    @Autowired
    @Getter(AccessLevel.PROTECTED)
    private ProductRepository repository; 
    
}
