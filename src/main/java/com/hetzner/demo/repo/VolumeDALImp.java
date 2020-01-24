package com.hetzner.demo.repo;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.google.inject.Inject;
import com.hetzner.demo.model.Volume;
import com.hetzner.demo.model.VolumeResponse;

@Repository("VolumeDAL")
public class VolumeDALImp implements VolumeDAL{
	@Inject
	private RestTemplate resttemplate;
	
	private String token;
	private final HttpEntity<String> entity;
	private HttpHeaders httpHeaders;
	private static String url = "https://api.hetzner.cloud/v1";
	

	public VolumeDALImp(@Value("${api.token}") String token) {
		super();
		this.token = token;

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        this.httpHeaders.add("Authorization", "Bearer " + token);
        this.entity = new HttpEntity<>("parameters", httpHeaders);
        resttemplate = new RestTemplate();
		// TODO Auto-generated constructor stub
	}

	@Override
	public VolumeResponse createVolume(@RequestBody Volume v) {
		// TODO Auto-generated method stub
		return resttemplate.postForEntity(url+"/volumes",new HttpEntity<>(v, httpHeaders), VolumeResponse.class).getBody();
	}
	

}
