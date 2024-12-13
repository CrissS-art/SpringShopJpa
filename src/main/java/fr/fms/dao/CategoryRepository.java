package fr.fms.dao;

import fr.fms.entities.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findAllByOrderByNameAsc();
    List<Category> findAllByOrderByNameDesc();
    
    Optional<Category> findByName(String categoryName);
}