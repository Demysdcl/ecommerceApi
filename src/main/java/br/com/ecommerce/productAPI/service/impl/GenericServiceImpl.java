/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.service.impl;

import br.com.ecommerce.productAPI.service.GenericService;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author demys
 */
public abstract class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID>{

    protected abstract JpaRepository<T, ID> getRepository();
    
    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public void delete(T entity) {
        getRepository().delete(entity);
    }

    @Override
    public void delete(ID id) {
        getRepository().delete(id);
    }

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T findOne(ID id) {
        return getRepository().findOne(id);
    }
    
}
