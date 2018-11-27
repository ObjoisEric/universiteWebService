package fr.objois.universiteback.note.business;

import fr.objois.universiteback.etudiant.domain.Etudiant;
import fr.objois.universiteback.matiere.domain.Matiere;
import fr.objois.universiteback.note.domain.Note;

import java.util.List;

public interface INoteBusiness {

	public List<Note> getAllNotes();


	public Matiere getMatiere(Integer id);


	public List<Matiere> getAllMatiere();


	public List<Etudiant> getAllEtudiant();


	public void ajouterNote(Note note, Integer idMatiere, Integer idEtudiant);

//	public List<Etudiant> getEtudiantDiff();

	public List<Note> getNotePage(Integer page);

	public Integer getNbrPage();

	public Note getNote(Integer idEtudiant, Integer idMatiere);

	public Note updateNote(Note note);

}
