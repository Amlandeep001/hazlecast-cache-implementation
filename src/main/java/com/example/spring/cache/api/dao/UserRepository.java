package com.example.spring.cache.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.cache.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
