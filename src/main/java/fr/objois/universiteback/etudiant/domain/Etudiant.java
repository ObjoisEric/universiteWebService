package fr.objois.universiteback.etudiant.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
	private Integer id;
	@JsonProperty("numero")
	@Column(name="numero_etudiant")
	private Integer numeroEtudiant;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="date_naissance")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	@Column(name="sexe")
	private String sexe;

	@JsonIgnore
	@OneToMany(mappedBy="etudiant")
	private List<Note> notes;


	
	
	
	

}
