
package br.com.codemaster.myfirstspringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codemaster.myfirstspringapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
