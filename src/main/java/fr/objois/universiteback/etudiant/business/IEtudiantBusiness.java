package fr.objois.universiteback.etudiant.business;

import fr.objois.universiteback.etudiant.domain.Etudiant;
//import fr.objois.universiteback.note.domain.Note;

import java.util.List;

public interface IEtudiantBusiness {

	public List<Etudiant> getAllEtudiant();

	public Etudiant getDetailEtudiant(Integer id);

	public void ajouterEtudiant(Etudiant etudiant);

	public void modifierEtudiant(Etudiant etudiant);

//	public List<Note> getNoteInfdixEtudiant(Integer id);

	


}
