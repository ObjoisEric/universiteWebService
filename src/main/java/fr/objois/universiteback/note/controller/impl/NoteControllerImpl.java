package fr.objois.universiteback.note.controller.impl;

import fr.objois.universiteback.etudiant.domain.Etudiant;
import fr.objois.universiteback.matiere.domain.Matiere;
import fr.objois.universiteback.note.business.INoteBusiness;
import fr.objois.universiteback.note.controller.INoteController;
import fr.objois.universiteback.note.domain.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class NoteControllerImpl implements INoteController {
	
	@Autowired
	INoteBusiness noteBusiness;


	@Override
	@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteBusiness.getAllNotes();
	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note getUneNote(@PathVariable Integer idEtudiant,@PathVariable Integer idMatiere) {

		return noteBusiness.getNote(idEtudiant,idMatiere);
	}

	@Override
	@PostMapping("/notes")
	public Note addNote(@RequestBody Note note) {

		log.info("ajout de note : " + note.getNote());
		noteBusiness.ajouterNote(note,note.getNotePrimaryKey().getIdMatiere(),note.getNotePrimaryKey().getIdEtudiant());

		return note;
	}

	@Override
	@PutMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note updateNote(@RequestBody Note note,@PathVariable Integer idEtudiant,@PathVariable Integer idMatiere) {

		log.info("update note " + note.getNote());
		note.getNotePrimaryKey().setIdEtudiant(idEtudiant);
		note.getNotePrimaryKey().setIdMatiere(idMatiere);


		return noteBusiness.updateNote(note);
	}
}
