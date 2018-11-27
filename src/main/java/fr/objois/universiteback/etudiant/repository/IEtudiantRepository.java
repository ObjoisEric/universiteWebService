package fr.objois.universiteback.etudiant.repository;

import fr.objois.universiteback.etudiant.domain.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
