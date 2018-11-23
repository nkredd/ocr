package com.nkredd.ocr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nkredd.ocr.domain.Campus;

@Repository
public interface CampusRepository extends JpaRepository<Campus, Integer> {

}
