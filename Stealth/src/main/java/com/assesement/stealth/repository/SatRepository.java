package com.assesement.stealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesement.stealth.entity.SatEntity;

@Repository
public interface SatRepository extends JpaRepository<SatEntity, String> {

}
