package com.example.lab12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab12.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}