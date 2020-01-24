package com.hetzner.demo.repo;

import java.util.List;

import com.hetzner.demo.model.ServerRequest;
import com.hetzner.demo.model.ServerResponse;

public interface CreateServerDAL {
	
	public ServerResponse create(ServerRequest c);
	public List<ServerRequest> getAllServer();
	public Boolean Delete(ServerRequest c);
}
