package com.hetzner.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hetzner.demo.model.ServerRequest;
import com.hetzner.demo.model.ServerResponse;
import com.hetzner.demo.repo.CreateServerDAL;

@RestController
public class ServerController {
	@Autowired
	private CreateServerDAL createserverDal;
	
	@PostMapping("/servers")
	public ServerResponse create(@RequestBody ServerRequest c){
		return createserverDal.create(c);
	}
}
