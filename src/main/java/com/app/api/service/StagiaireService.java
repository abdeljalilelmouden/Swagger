package com.app.api.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.api.entity.Stagiaire;
import com.app.api.repository.StagiaireRepository;

@Service
public class StagiaireService {

	@Autowired
	private StagiaireRepository stagiaireRepository;
	
	public List<Stagiaire> getAllStagiaires() {
		
		return stagiaireRepository.findAll();
	}
	
	public Stagiaire getStagiaireById(long id) { 
		
		return stagiaireRepository.findById(id).orElseThrow(null);
	}
	
	public void deleteStagiaire(long id) {
		
		stagiaireRepository.deleteById(id);
	}
	
	public void saveStagiaire(Stagiaire stagiaire) {
		stagiaireRepository.save(stagiaire);
	}
}
