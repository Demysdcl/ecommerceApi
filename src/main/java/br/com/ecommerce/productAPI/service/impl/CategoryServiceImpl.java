/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.service.impl;

import br.com.ecommerce.productAPI.entity.Category;
import br.com.ecommerce.productAPI.repository.CategoryRepository;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author demys
 */
public class CategoryServiceImpl extends GenericServiceImpl<Category, Integer>{
    
    @Autowired
    @Getter(AccessLevel.PROTECTED)
    private CategoryRepository repository;

}
