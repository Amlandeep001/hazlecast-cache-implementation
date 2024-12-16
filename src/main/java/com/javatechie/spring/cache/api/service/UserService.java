package com.javatechie.spring.cache.api.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.javatechie.spring.cache.api.dao.UserRepository;
import com.javatechie.spring.cache.api.exception.UserNotFoundException;
import com.javatechie.spring.cache.api.model.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserService
{
	private final UserRepository repository;

	@Cacheable(cacheNames = {"userCache"})
	public int getUsersCount()
	{
		log.info("Hit DB 1st time in getUsers()");
		return repository.findAll().size();
	}

	@Cacheable(value = "userCache", key = "#id", unless = "#result==null")
	public User getUser(int id)
	{
		log.info("Hit DB 1st time in getUser()");
		return repository.findById(id)
				.orElseThrow(() -> new UserNotFoundException("Wrong id passed in the request"));
	}

	@CacheEvict(value = "userCache")
	public String delete(int id)
	{
		repository.deleteById(id);
		return "User deleted with id " + id;
	}

}
