/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.productAPI.config;

import br.com.ecommerce.productAPI.buider.ProductBuider;
import br.com.ecommerce.productAPI.entity.Category;
import br.com.ecommerce.productAPI.entity.Product;
import br.com.ecommerce.productAPI.enumeration.OriginEnum;
import br.com.ecommerce.productAPI.repository.CategoryRepository;
import br.com.ecommerce.productAPI.repository.ProductRepository;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

/**
 *
 * @author demys
 */
@Component
public class DatabaseLoader implements CommandLineRunner{
    
    @Autowired
    private ProductRepository prodRepository;
    
    @Autowired
    private CategoryRepository catRepository;

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadProducts();
    }
    
    public void loadCategories(){
        Arrays.asList("Eletrônico","Livro","Música")
                .forEach(it -> catRepository.save(new Category(null, it)));
    }
    
    public void loadProducts() {     
        getProducts().forEach(prod -> prodRepository.save(prod));
    }
    
    private List<Product> getProducts(){
        Product product1 = new ProductBuider()
                .description("Guitarra Ibanez")
                .origin(OriginEnum.Nacional)
                .purchaseDate(Calendar.getInstance())
                .image("https://http2.mlstatic.com/guitarra-ibanez-grg121dx-4820-D_NQ_NP_14516-MLB3492508972_122012-F.jpg")
                .category(new Category(1, "Eletrônico"))
                .price(1000d)
                .build();
        
        Product product2= new ProductBuider()
                .description("Código Limpo")
                .origin(OriginEnum.Nacional)
                .purchaseDate(Calendar.getInstance())
                .image("http://cienciamodernaonline.vteximg.com.br/arquivos/ids/156917-500-500/Codigo-Limpo.jpg?v=635721385836000000")
                .category(new Category(2, "Livro"))
                .price(100d)
                .build();
        
        Product product3 = new ProductBuider()
                .description("One Last Breath")
                .origin(OriginEnum.Importado)
                .purchaseDate(Calendar.getInstance())
                .image("https://i.ytimg.com/vi/Govl8bwhZk4/maxresdefault.jpg")
                .category(new Category(3, "Música"))
                .price(10d)
                .build();
        
        return Arrays.asList(product1, product2, product3);
    }
    
}
