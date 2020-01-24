package com.hetzner.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hetzner.demo.model.CreateServer;
import com.hetzner.demo.repo.CreateServerDAL;

public class ServerController {
	@Autowired
	private CreateServerDAL createserverDal;
	
	@PostMapping("/servers")
	public CreateServer create(@RequestBody CreateServer c){
		return createserverDal.create(c);
	}
}
