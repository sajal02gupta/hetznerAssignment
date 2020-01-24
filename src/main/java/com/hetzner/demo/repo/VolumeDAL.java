package com.hetzner.demo.repo;

import com.hetzner.demo.model.Volume;
import com.hetzner.demo.model.VolumeResponse;

public interface VolumeDAL {
	public VolumeResponse createVolume(Volume v);

}
