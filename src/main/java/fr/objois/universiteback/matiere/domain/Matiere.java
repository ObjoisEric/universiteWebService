package fr.objois.universiteback.matiere.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.objois.universiteback.enseignant.domain.Enseignant;
import fr.objois.universiteback.note.domain.Note;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","notes"})
@Entity(name = "t_matiere")
public class Matiere {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonProperty("numero")
    @Column(name = "numero_matiere")
    private Integer numeroMatiere;
    @Column(name = "nom")
    private String nom;
    @Column(name = "coef")
    private Integer coef;
    @Column(name = "date_debut")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDebut;
    @Column(name = "date_fin")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateFin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enseignant")
    private Enseignant enseignant;

    @JsonIgnore
    @OneToMany(mappedBy = "matiere")
    private List<Note> notes;





}
