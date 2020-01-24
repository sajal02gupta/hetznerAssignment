package com.hetzner.demo.repo;

import java.util.List;

import com.hetzner.demo.model.CreateServer;

public interface CreateServerDAL {
	
	public CreateServer create(CreateServer c);
	public List<CreateServer> getAllServer();
	public Boolean Delete(CreateServer c);
}
