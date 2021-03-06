/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.service.impl;

import br.com.ecommerce.productAPI.entity.Category;
import br.com.ecommerce.productAPI.repository.CategoryRepository;
import br.com.ecommerce.productAPI.service.CategoryService;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author demys
 */
@Service("categoryService")
public class CategoryServiceImpl extends GenericServiceImpl<Category, Integer>
        implements CategoryService {

    @Autowired
    @Getter(AccessLevel.PROTECTED)
    private CategoryRepository repository;

}
