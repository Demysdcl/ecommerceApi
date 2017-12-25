package br.com.ecommerce.productAPI.entity;

import br.com.ecommerce.productAPI.enumeration.OriginEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Product {
    
    @Id
    @GeneratedValue
    @Column(name = "id_product")
    private Integer id;
    
    @NotNull
    @Column(length = 80)
    private String description;

    @NotNull
    private Double price;
    
    @NotNull
    @ManyToOne
    private Category category;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private OriginEnum origin;
    
    public Double getPriceUS(){
        return price * 3.599;
    }
}
