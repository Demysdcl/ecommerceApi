package br.com.ecommerce.productAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id_category")
    private Integer id;

    @Column(length = 50)
    private String description;

}
