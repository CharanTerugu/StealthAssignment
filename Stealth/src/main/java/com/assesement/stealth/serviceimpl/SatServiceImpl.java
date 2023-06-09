package com.assesement.stealth.serviceimpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesement.stealth.comparator.ScoreComparator;
import com.assesement.stealth.entity.SatEntity;
import com.assesement.stealth.repository.SatRepository;
import com.assesement.stealth.service.SatService;

@Service
public class SatServiceImpl implements SatService {

	@Autowired
	SatRepository repo;

	@Override
	public void insert(SatEntity data) {
		// TODO Auto-generated method stub
		if (data.getScore() >= 30)
			data.setPassed("Pass");
		else
			data.setPassed("Fail");
		repo.save(data);
	}

	@Override
	public List<SatEntity> viewAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public int getRank(String name) {
		// TODO Auto-generated method stub
		List<SatEntity> s = repo.findAll();
		Collections.sort(s, new ScoreComparator());
		int rank = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getName().equalsIgnoreCase(name)) {
				rank = i + 1;
			}
		}
		return rank;
	}

	@Override
	public void updateScore(String name, SatEntity data) {
		// TODO Auto-generated method stub
		SatEntity sa = repo.getById(name);
		sa.setScore(data.getScore());
		if (sa.getScore() >= 30)
			sa.setPassed("Pass");
		else
			sa.setPassed("Fail");

		repo.save(sa);

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		repo.deleteById(name);
	}

}
