package com.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.api.entity.Stagiaire; 
@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long>{

	 
}
