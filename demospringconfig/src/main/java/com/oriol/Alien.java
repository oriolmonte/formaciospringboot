
package com.oriol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;
	//Field injection
	@Autowired
	@Qualifier("desktop") // class name lowercase default you can specify with primary and scope
	private Computer com;
	
	public Alien() {
		System.out.println("Object Created");
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) { 		
		this.age = age;
	}
	
	public Computer getCom() {
		return com;
	}
	
	public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		System.out.println("Coding");
		com.compile();
	}
	
}
