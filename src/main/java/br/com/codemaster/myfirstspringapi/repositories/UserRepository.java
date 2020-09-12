package br.com.codemaster.myfirstspringapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codemaster.myfirstspringapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
