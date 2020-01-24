package com.hetzner.demo.repo;

import java.util.Collections;
import java.util.List;
import java.lang.String;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.hetzner.demo.model.CreateServer;

public class CreateServerDALImp implements CreateServerDAL{
	
	private RestTemplate resttemplate;
	private String token;
	private HttpHeaders httpHeaders;
	private static String url = "https://api.hetzner.cloud/v1";
			
	public CreateServerDALImp(final String token) {
        this.token = token;

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        this.httpHeaders.add("Authorization", "Bearer " + token);
        new HttpEntity<>("parameters", httpHeaders);

        resttemplate = new RestTemplate();
    }
	@Override
	public CreateServer create(@RequestBody CreateServer c) {
		// TODO Auto-generated method stub
		return resttemplate.postForEntity(url+"/servers",new HttpEntity<>(c, httpHeaders), CreateServer.class).getBody();
	}
	@Override
	public List<CreateServer> getAllServer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean Delete(CreateServer c) {
		// TODO Auto-generated method stub
		return null;
	}


}
