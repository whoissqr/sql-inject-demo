package com.cc11001100.sqlinject.demo;

import org.apache.ibatis.javassist.bytecode.stackmap.TypeData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.util.logging.Logger;

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

	void log_inject(HttpServletRequest req) {
		String attachment = req.getParameter("attachment");
		final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName() );
		LOGGER.info (attachment);
	}
}
