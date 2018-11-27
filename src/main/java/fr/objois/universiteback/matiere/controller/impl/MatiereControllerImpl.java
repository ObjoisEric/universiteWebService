package fr.objois.universiteback.matiere.controller.impl;

import fr.objois.universiteback.enseignant.domain.Enseignant;
import fr.objois.universiteback.matiere.business.IMatiereBusiness;
import fr.objois.universiteback.matiere.controller.IMatiereController;
import fr.objois.universiteback.matiere.domain.Matiere;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class MatiereControllerImpl implements IMatiereController {
	@Autowired
	IMatiereBusiness matiereBusiness;


	@Override
	@GetMapping("/matieres")
	public List<Matiere> getAllMatiere() {
		log.info("toute matiere: ");
		return matiereBusiness.getAllMatiere();
	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere getUnMatiere(@PathVariable Integer id) {
		log.info("detail matiere: " + id);
		return matiereBusiness.getDetailMatiere(id);
	}

	@Override
	@PostMapping("/matieres")
	public Matiere addMatiere(@RequestBody Matiere matiere) {
		log.info("ajout matiere: " + matiere.getNom());
		matiereBusiness.ajouterMatiere(matiere,matiere.getEnseignant().getId());

		return matiere;
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere updateMatiere(@PathVariable Integer id,@RequestBody Matiere matiere) {
		log.info("update matiere: " + matiere.getNom());

		Matiere vraiMatiere = matiere;
		vraiMatiere.setId(id);
		matiereBusiness.modifierMatiere(vraiMatiere,matiere.getEnseignant().getId());
		return vraiMatiere;
	}
}
