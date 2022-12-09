package com.devsuperior.dscatalog.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
