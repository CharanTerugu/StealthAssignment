package com.assesement.stealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesement.stealth.entity.SatEntity;
import com.assesement.stealth.service.SatService;

@RestController
public class SatController {

	@Autowired
	SatService ss;

	@PostMapping("insert")
	void add(@RequestBody SatEntity data) {
		ss.insert(data);
	}

	@GetMapping("viewAll")
	List<SatEntity> getAll() {
		return ss.viewAll();
	}

	@GetMapping("rank/{name}")
	int getRank(@PathVariable String name) {
		return ss.getRank(name);
	}

	@PutMapping("update/score/{name}")
	void update(@PathVariable String name, @RequestBody SatEntity data) {
		ss.updateScore(name, data);
	}

	@DeleteMapping("delete/{name}")
	void delete(@PathVariable String name) {
		ss.delete(name);
	}
}
