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

//Exemple conversion objet Etudiant en objet EtudiantDTO
//public EtudiantDTO convert(Etudiant etudiant) {
//      EtudiantDTO etudiantDto = new EtudiantDTP();
//        etudiantDto.setID(etudiant.getId());
//
//      return EtudiantDto;
// }
