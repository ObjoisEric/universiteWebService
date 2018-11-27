package fr.objois.universiteback.etudiant.controller;

import fr.objois.universiteback.etudiant.domain.Etudiant;
import org.springframework.ui.Model;

import java.util.List;

public interface IEtudiantController {
	
	public List<Etudiant> getAllEtudiant();
	
	public Etudiant getUnEtudiant(Integer id);
	
	public Etudiant updateEtudiant(Etudiant etudiant, Integer id);
	
	public Etudiant addEtudiant(Etudiant etudiant);
	
//	public String modificationEtudiant(Model model, Integer id);
//
//	public String modifierEtudiant(Model model, Etudiant etudiant);

}
