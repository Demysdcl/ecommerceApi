/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.controller;

import br.com.ecommerce.productAPI.service.GenericService;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author demys
 * @param <T>
 * @param <ID>
 */
@CrossOrigin(origins = "*")
public abstract class GenericController<T, ID extends Serializable> {

    protected abstract GenericService<T, ID> getService();

    @GetMapping(value = "/{id}")
    public ResponseEntity findOne(@PathVariable ID id) {
        T entity = getService().findOne(id);
        if (entity != null) {
            return new ResponseEntity<>(entity, HttpStatus.CREATED);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> list = getService().findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity save(@Valid @RequestBody T entity) {
        T created = getService().save(entity);
        if (created != null) {
            return new ResponseEntity<>(created, HttpStatus.CREATED);
        }
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body("Ocorreu um erro na requisição");
    }

    @PutMapping
    public ResponseEntity<T> update(@Valid @RequestBody T entity) {
        return save(entity);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable ID id) {
        T found = getService().findOne(id);
        if(found != null){
            getService().delete(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Não foi deletar");
    }

}
