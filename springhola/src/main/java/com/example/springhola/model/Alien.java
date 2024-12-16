package com.example.springhola.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("25")
    private int age;
    Computer com;
    public void code()
    {
        com.compile();
        System.out.println("Hola alien");
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
    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }
}
