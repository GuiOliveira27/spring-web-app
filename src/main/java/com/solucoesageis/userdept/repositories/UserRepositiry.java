package com.solucoesageis.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solucoesageis.userdept.entities.User;

public interface UserRepositiry extends JpaRepository<User, Long> {

}
