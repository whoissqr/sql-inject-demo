package com.cc11001100.sqlinject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@SpringBootApplication


public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	void addSessionToken(HttpServletResponse response, String id)
	{
		Cookie c = new Cookie("SESSION_ID", id);
		response.addCookie(c);
	}
}
