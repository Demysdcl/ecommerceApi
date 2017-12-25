package br.com.ecommerce.productAPI.repository;

import br.com.ecommerce.productAPI.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
