package br.com.ecommerce.productAPI.repository;

import br.com.ecommerce.productAPI.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
