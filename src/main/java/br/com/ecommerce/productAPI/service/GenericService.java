/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author demys
 */
public interface GenericService<T, ID extends Serializable> {

    T save(T entity);

    void delete(T entity);

    void delete(ID id);

    List<T> findAll();

    T findOne(ID id);
}
