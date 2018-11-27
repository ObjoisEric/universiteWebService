package fr.objois.universiteback.etudiant.dto;

import lombok.Data;

import java.util.Date;
@Data
public class EtudiantDTO {

    Integer id;
    Integer numeroEtudiant;
    String nom;
    String prenom;
    Date dateNaissance;
    String sexe;
}
