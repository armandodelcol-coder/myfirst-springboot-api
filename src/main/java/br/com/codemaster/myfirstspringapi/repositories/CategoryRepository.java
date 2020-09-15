package br.com.codemaster.myfirstspringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codemaster.myfirstspringapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
