package com.hetzner.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hetzner.demo.model.Volume;
import com.hetzner.demo.model.VolumeResponse;
import com.hetzner.demo.repo.VolumeDAL;

@RestController
public class VolumeController {
	@Autowired
	private VolumeDAL volumedal;
	
	@PostMapping("/volumes")
	public VolumeResponse create(@RequestBody Volume v){
		return volumedal.createVolume(v);
	}
}
