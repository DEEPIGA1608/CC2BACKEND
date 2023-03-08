package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.entity;

import com.example.demo.service.service;


@RestController
@CrossOrigin
public class controller {
	@Autowired
	service Service;
	@PostMapping("/post")
	public entity addInfo(@RequestBody entity st) {
		return Service.saveDetails(st);
	}
	@GetMapping("/get")
	public List<entity> fetchDetails(){
		return Service.getDetails();
	}
	@PutMapping("/update")
	public entity updateInfo(@RequestBody entity st1) {
		return Service.updateDetails(st1);
	}
	@DeleteMapping("/delete/{Patientid}")
	public String deleteInfo(@PathVariable("Patientid")int Patientid) {
		Service.deleteDetails(Patientid);
		return "Deleted details";
	}

}
