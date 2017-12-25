/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.controller;

import br.com.ecommerce.productAPI.entity.Product;
import br.com.ecommerce.productAPI.service.ProductService;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author demys
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController extends GenericController<Product, Integer>{
    
    
    @Autowired
    @Getter(AccessLevel.PROTECTED)
    private ProductService service;
    
}
