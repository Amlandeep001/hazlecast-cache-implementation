package com.javatechie.spring.cache.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringHazlecastCacheApplication
{
	/*private final UserRepository repository;
	
	public SpringHazlecastCacheApplication(UserRepository repository)
	{
		this.repository = repository;
	}
	
	@PostConstruct
	public void initDB()
	{
		List<User> users = IntStream.rangeClosed(100001, 1000000)
				.mapToObj(i -> new User("sample" + i, pickAnyAddress()))
				.collect(Collectors.toList());
	
		repository.saveAll(users);
	}
	
	private String pickAnyAddress()
	{
		List<String> countries = List.of("India", "USA", "China");
	
		// Create a Random object
		Random random = new Random();
	
		// Generate a random index within the list's bounds
		int randomIndex = random.nextInt(countries.size());
	
		// Retrieve the element at the random index
		String randomCountry = countries.get(randomIndex);
		return randomCountry;
	}*/

	public static void main(String[] args)
	{
		SpringApplication.run(SpringHazlecastCacheApplication.class, args);
	}

}
