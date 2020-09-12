package br.com.codemaster.myfirstspringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codemaster.myfirstspringapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
