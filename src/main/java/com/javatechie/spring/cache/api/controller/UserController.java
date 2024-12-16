package com.javatechie.spring.cache.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.cache.api.model.User;
import com.javatechie.spring.cache.api.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cache-api")
@RequiredArgsConstructor
public class UserController
{
	private final UserService service;

	@GetMapping("/getTotalUsers")
	public String getAllUsersCount()
	{
		return "Total Users: " + service.getUsersCount();
	}

	@GetMapping("/getUserById/{id}")
	public User getUser(@PathVariable int id)
	{
		return service.getUser(id);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return service.delete(id);
	}

}
