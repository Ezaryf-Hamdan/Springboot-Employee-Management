package com.azid.SpringBoot.Assessment.Employee_Management.repository;

import com.azid.SpringBoot.Assessment.Employee_Management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
