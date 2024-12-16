/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springhola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springhola.model.Laptop;
import com.example.springhola.repo.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository repo;
	public void add(Laptop laptop) {
		repo.save();		
	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
	
}