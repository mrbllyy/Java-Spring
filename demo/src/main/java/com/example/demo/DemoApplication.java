
package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
//import org.springframework.jdbc.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/hello")
	public String post(@RequestBody User user) {
		/*
		if (2022 - user.getBirthyear() < 18) {
			return String.format("Goodbye kiddie, %s!", user.getName());
		} else {
			return String.format("Hello %s!\n", user.getName());
		}*/

		String sql = "INSERT INTO users (name, surname, age) VALUES ('" + user.getName() + "', '" + user.getSurname() + "', " + user.getBirthyear() + ");";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("INSERTION completed.");
		}

		return String.format("Hello %s!\n", user.getName());
	}

	@GetMapping("/hello")
	public String get() {
		//return String.format("Goodbye kiddie, try to make POST request!");

		String sql = "SELECT * FROM users;";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("All db printed.");
		}
		return jdbcTemplate.;
	}

}
            