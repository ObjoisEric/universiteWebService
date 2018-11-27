package fr.objois.universiteback.enseignant.controller.impl;

import fr.objois.universiteback.enseignant.business.IEnseignantBusiness;
import fr.objois.universiteback.enseignant.controller.IEnseignantController;
import fr.objois.universiteback.enseignant.domain.Enseignant;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
public class EnseignantControllerImpl implements IEnseignantController{
	
	@Autowired
	IEnseignantBusiness enseignantBusiness;

	@Override
	@GetMapping("/enseignants")
	public List<Enseignant> allEnseignant() {
		log.info("tout les enseignants");
		return enseignantBusiness.getAllEnseignant();
	}

	@Override
	@GetMapping("/enseignants/{id}")
	public Enseignant unEnseignant(@PathVariable Integer id) {
		log.info("un enseignant");
		return enseignantBusiness.getEnseignantDetail(id);
	}

	@Override
	@PostMapping("/enseignants")
	public Enseignant ajouteEnseignant(@RequestBody Enseignant enseignant) {
		log.info("ajoute enseignant : " + enseignant.getNom());
		log.info("ajoute enseignant : " + enseignant.getDateEmbauche());

		enseignantBusiness.ajouteEnseignant(enseignant);
		return enseignant;
	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant updateEnseignant(@RequestBody Enseignant enseignant, @PathVariable Integer id) {
		log.info("update enseignant : " + enseignant.getNom());

		Enseignant enseignantAModifier = enseignant;
		enseignantAModifier.setId(id);


		enseignantBusiness.modifierEnseignant(enseignantAModifier);
		return enseignantAModifier;
	}



}
