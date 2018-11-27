package fr.objois.universiteback.matiere.controller;

import fr.objois.universiteback.matiere.domain.Matiere;
import org.springframework.ui.Model;

import java.util.List;

public interface IMatiereController {
	
	public List<Matiere> getAllMatiere();
	
	public Matiere getUnMatiere(Integer id);

	public Matiere addMatiere(Matiere matiere);
	
	public Matiere updateMatiere(Integer id, Matiere matiere);

}
