package com.example.WebService.Spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebService.Spring.Entites.User;

/* 
  
   não precisa por a anotação @Repository 
   pois já herda da interface JpaRepository
 
 */
public interface UserRepository extends JpaRepository<User, Long> {}
