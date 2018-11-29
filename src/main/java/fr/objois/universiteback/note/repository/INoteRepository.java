package fr.objois.universiteback.note.repository;

import fr.objois.universiteback.note.domain.Note;
import fr.objois.universiteback.note.domain.NotePrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface INoteRepository extends JpaRepository<Note, NotePrimaryKey>{
	
	List<Note> findByEtudiantIdAndNoteLessThan(Integer id, Double note);

	List<Note> findByNoteLessThan(double d);


}
