package fr.objois.universiteback.note.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import fr.objois.universiteback.etudiant.domain.Etudiant;
import fr.objois.universiteback.matiere.domain.Matiere;
import lombok.Data;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
@Table(name="T_NOTE")
public class Note {
	
	
	@EmbeddedId
	private NotePrimaryKey notePrimaryKey;
	
	@Column(name="note")
	private Double note;
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false, name="id_etudiant")
	private Etudiant etudiant; 
	
	@ManyToOne
	@JoinColumn(insertable=false, updatable=false, name="id_matiere")
	private Matiere matiere;

	public NotePrimaryKey getNotePrimaryKey() {
		return notePrimaryKey;
	}


	public void setNotePrimaryKey(NotePrimaryKey notePrimaryKey) {
		this.notePrimaryKey = notePrimaryKey;
	}



	
}
