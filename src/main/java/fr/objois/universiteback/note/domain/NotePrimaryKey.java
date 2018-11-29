package fr.objois.universiteback.note.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Embeddable
public class NotePrimaryKey implements Serializable {

	private static final long serialVersionUID = -3960755370829956602L;
    @Column(name="id_etudiant")
	private Integer idEtudiant;
    @Column(name="id_matiere")
	private Integer idMatiere;


	
}
