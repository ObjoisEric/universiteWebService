package fr.objois.universiteback.note.controller;

import fr.objois.universiteback.note.domain.Note;
import org.springframework.ui.Model;

import java.util.List;

public interface INoteController {
	
	public List<Note> getAllNotes();

	public Note getUneNote(Integer idEtudiant, Integer idMatiere);

//	public String afficherNoteMatiere(Model model, Integer id);

	public Note addNote(Note note);

	public Note updateNote(Note note,Integer idEtudiant, Integer idMatiere);
	
//	public String noteDiff(Model model);

}
