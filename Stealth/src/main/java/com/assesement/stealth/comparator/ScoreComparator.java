package com.assesement.stealth.comparator;

import java.util.Comparator;

import com.assesement.stealth.entity.SatEntity;

public class ScoreComparator implements Comparator<SatEntity> {

	@Override
	public int compare(SatEntity o1, SatEntity o2) {
		// TODO Auto-generated method stub
		if (o1.getScore() < o2.getScore())
			return 1;
		else if (o1.getScore() == o2.getScore())
			return 0;

		return -1;
	}

}
