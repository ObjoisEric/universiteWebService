package fr.objois.universiteback.matiere.business;

import fr.objois.universiteback.enseignant.domain.Enseignant;
import fr.objois.universiteback.matiere.domain.Matiere;

import java.util.List;

public interface IMatiereBusiness {

	public List<Matiere> getAllMatiere();

	public Matiere getDetailMatiere(Integer id);

	public void ajouterMatiere(Matiere matiere, Integer idEnseignant);

	public List<Enseignant> qetAllEnseignant();

	public void modifierMatiere(Matiere matiere, Integer idEnseignant);

}
