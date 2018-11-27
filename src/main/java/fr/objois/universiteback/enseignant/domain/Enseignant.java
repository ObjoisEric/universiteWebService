package fr.objois.universiteback.enseignant.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import fr.objois.universiteback.matiere.domain.Matiere;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","listMatieres"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "t_enseignant")
public class Enseignant {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Numero_Enseignant")
    private Integer numeroEnseignant;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Date_Naissance")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    @Column(name = "Sexe")
    private String sexe;
    @Column(name = "Grade")
    private String grade;
    @Column(name = "Date_Embauche")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEmbauche;
    @OneToMany(mappedBy = "enseignant")
    private List<Matiere> listMatieres;





}
