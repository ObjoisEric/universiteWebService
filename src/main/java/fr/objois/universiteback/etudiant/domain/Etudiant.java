package fr.objois.universiteback.etudiant.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.objois.universiteback.note.domain.Note;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name="t_etudiant")
public class Etudiant {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="numero_etudiant")
	Integer numeroEtudiant;
	@Column(name="nom")
	String nom;
	@Column(name="prenom")
	String prenom;
	@Column(name="date_naissance")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date dateNaissance;
	@Column(name="sexe")
	String sexe;
	@JsonIgnore
	@OneToMany(mappedBy="etudiant")
	private List<Note> notes;


	
	
	
	

}
