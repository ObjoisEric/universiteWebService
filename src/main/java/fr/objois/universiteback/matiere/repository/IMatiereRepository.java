package fr.objois.universiteback.matiere.repository;

import fr.objois.universiteback.matiere.domain.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

}
