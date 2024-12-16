package com.example.springhola.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    
    public void compile()
    {
        System.out.println("Compiling on laptop");
    }

}
