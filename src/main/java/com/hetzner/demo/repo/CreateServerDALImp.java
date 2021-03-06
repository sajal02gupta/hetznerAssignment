package com.hetzner.demo.repo;

import java.util.Collections;
import java.util.List;
import java.lang.String;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.google.inject.Inject;
import com.hetzner.demo.model.ServerRequest;
import com.hetzner.demo.model.ServerResponse;

@Repository
@PropertySource("classpath:global.properties")
public class CreateServerDALImp implements CreateServerDAL{
	
	@Inject
	private RestTemplate resttemplate;
	
	private String token;
	private final HttpEntity<String> entity;
	private HttpHeaders httpHeaders;
	private static String url = "https://api.hetzner.cloud/v1";
	
	public CreateServerDALImp(@Value("${api.token}") String token) {
        this.token = token;

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        this.httpHeaders.add("Authorization", "Bearer " + token);
        this.entity = new HttpEntity<>("parameters", httpHeaders);
        resttemplate = new RestTemplate();
    }
	@Override
	public ServerResponse create(@RequestBody ServerRequest c) {
		// TODO Auto-generated method stub
		return resttemplate.postForEntity(url+"/servers",new HttpEntity<>(c, httpHeaders), ServerResponse.class).getBody();
	}
	@Override
	public List<ServerRequest> getAllServer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean Delete(ServerRequest c) {
		// TODO Auto-generated method stub
		return null;
	}


}
