package fr.objois.universiteback.etudiant.controller.impl;

import fr.objois.universiteback.etudiant.business.IEtudiantBusiness;
import fr.objois.universiteback.etudiant.controller.IEtudiantController;
import fr.objois.universiteback.etudiant.domain.Etudiant;
//import fr.objois.universiteback.note.domain.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class EtudiantControllerImpl implements IEtudiantController {
	
	@Autowired
	IEtudiantBusiness etudiantBusiness;


	@Override
	@GetMapping("/etudiants")
	public List<Etudiant> getAllEtudiant() {
		log.info("tout les etudiants");
		return etudiantBusiness.getAllEtudiant();
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant getUnEtudiant(@PathVariable Integer id) {
		log.info("etudiantid : " + id);
		return etudiantBusiness.getDetailEtudiant(id);
	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiant updateEtudiant(@RequestBody Etudiant etudiant,@PathVariable Integer id) {
		log.info("modifier etudiant : " + etudiant.getNom());

		Etudiant vraiEtudiant = etudiant;
		vraiEtudiant.setId(id);
		etudiantBusiness.modifierEtudiant(vraiEtudiant);
		return vraiEtudiant;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
		log.info("ajoute etudiant " + etudiant.getNom());
		etudiantBusiness.ajouterEtudiant(etudiant);
		return etudiant;
	}
}
