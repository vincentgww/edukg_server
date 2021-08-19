package com.example.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.login.dao")
public class Login2Application {

	public static void main(String[] args) {
		SpringApplication.run(Login2Application.class, args);
	}

}
