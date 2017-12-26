/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.buider;

import br.com.ecommerce.productAPI.entity.Category;
import br.com.ecommerce.productAPI.entity.Product;
import br.com.ecommerce.productAPI.enumeration.OriginEnum;
import java.util.Calendar;

/**
 *
 * @author demys
 */
public class ProductBuider {

    private Product product;

    public ProductBuider() {
        product = new Product();
    }

    public ProductBuider id(Integer id) {
        product.setId(id);
        return this;
    }

    public ProductBuider price(Double price) {
        product.setPrice(price);
        return this;
    }

    public ProductBuider description(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuider category(Category category) {
        product.setCategory(category);
        return this;
    }

    public ProductBuider origin(OriginEnum origin) {
        product.setOrigin(origin);
        return this;
    }

    public ProductBuider purchaseDate(Calendar purchaseDate) {
        product.setPurchaseDate(purchaseDate);
        return this;
    }
    
    public ProductBuider image(String image){
        product.setImage(image);
        return this;
    }

    public Product build() {
        return product;
    }

}
