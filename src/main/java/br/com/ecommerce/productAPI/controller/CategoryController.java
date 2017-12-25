/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.controller;

import br.com.ecommerce.productAPI.entity.Category;
import br.com.ecommerce.productAPI.service.CategoryService;
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
@RequestMapping(value = "/categories")
public class CategoryController extends GenericController<Category, Integer>{
    
    @Autowired
    @Getter(AccessLevel.PROTECTED)
    private CategoryService service;
}
