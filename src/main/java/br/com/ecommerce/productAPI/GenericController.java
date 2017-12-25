/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI;

import br.com.ecommerce.productAPI.service.GenericService;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import javax.xml.ws.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author demys
 */
public abstract class GenericController<T, ID extends Serializable> {
    
    protected abstract GenericService<T, ID> getService();
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<T> findOne(@PathVariable ID id) {
        T entity = getService().findOne(id);
        return ResponseEntity.ok(entity);
    }
    
    @GetMapping
    public ResponseEntity<List<T>> findAll(){
        List<T> list = getService().findAll();
        return ResponseEntity.ok(list);
    }
    
    @PostMapping
    public ResponseEntity<T> save(@Valid @RequestBody T entity){
        T created = getService().save(entity);
        return ResponseEntity.ok(created);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable ID id){
        getService().delete(id);
        return ResponseEntity.ok("It was Deleted");
    }
    
}
