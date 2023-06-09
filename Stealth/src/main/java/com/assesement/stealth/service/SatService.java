package com.assesement.stealth.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.assesement.stealth.entity.SatEntity;

@Component
public interface SatService {

	void insert(SatEntity data);

	List<SatEntity> viewAll();

	int getRank(String name);

	void updateScore(String name, SatEntity data);

	void delete(String name);

}
