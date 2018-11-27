package fr.objois.universiteback.enseignant.controller;

import org.springframework.ui.Model;

import fr.objois.universiteback.enseignant.domain.Enseignant;

import java.util.List;

public interface IEnseignantController {

	public List<Enseignant> allEnseignant();

	public Enseignant unEnseignant(Integer id);

	public Enseignant ajouteEnseignant(Enseignant enseignant);

	public Enseignant updateEnseignant(Enseignant enseignant, Integer id);
	
	
}
