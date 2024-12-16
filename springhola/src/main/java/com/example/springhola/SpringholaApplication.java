package com.example.springhola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springhola.model.Laptop;
import com.example.springhola.service.LaptopService;

@SpringBootApplication
public class SpringholaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringholaApplication.class, args);
		LaptopService service=context.getBean(LaptopService.class);
		Laptop laptop=context.getBean(Laptop.class);
		service.add(laptop);
			// Alien obj = context.getBean(Alien.class);
		// System.out.println(obj.getAge());
		// obj.code();
	}
}
