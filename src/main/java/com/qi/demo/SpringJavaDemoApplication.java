package com.qi.demo;


import com.qi.demo.util.ContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJavaDemoApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(SpringJavaDemoApplication.class, args);
		ContextUtil.init(applicationContext);
	}

}
