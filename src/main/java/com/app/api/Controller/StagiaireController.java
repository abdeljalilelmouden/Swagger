package com.app.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.entity.Stagiaire;
import com.app.api.repository.StagiaireRepository;
import com.app.api.service.StagiaireService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api( value="Cette API utilisé pour la gestion des stagiaires ")
@RestController
public class StagiaireController {
	
	@Autowired
	private StagiaireRepository stagiaireRepository;
	
	@Autowired
	private StagiaireService stagiaireService;
	
	@ApiOperation(value=" méthode utilisée pour afficher la liste de tous les stagiaires ")
	@GetMapping(value = "/stagiaires")
	public List<Stagiaire> getAllStagiaires() {
		return stagiaireService.getAllStagiaires();
	}
	
	
	@ApiOperation(value=" méthode utilisée pour afficher un  stagiaires ")
	@GetMapping(value = "/stagiaires/{id}")
	public Stagiaire getStagiaireById(@PathVariable long id) {
		return stagiaireService.getStagiaireById(id);
	}
	
	@ApiOperation(value=" méthode utilisée pour ajoute  stagiaires ")
	@PostMapping(value = "/stagiaires/{id}")
	public String saveStagiaire(@RequestBody Stagiaire stagiaire ) {
		stagiaireService.saveStagiaire(stagiaire);
		return "le stagiaire bien ajoute";
	}
	
	
	@ApiOperation(value = " méthode utilisée pour supprimé un stagiaires ")
	@DeleteMapping(value="/stagiaires/{id}")
	public void deleteStagiaire(@PathVariable long id) {
		stagiaireService.deleteStagiaire(id);
	}
	 
	

}
