package br.com.codemaster.myfirstspringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codemaster.myfirstspringapi.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
