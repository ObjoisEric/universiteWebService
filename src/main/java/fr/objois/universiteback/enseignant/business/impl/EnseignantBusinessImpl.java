package fr.objois.universiteback.enseignant.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.objois.universiteback.enseignant.business.IEnseignantBusiness;
import fr.objois.universiteback.enseignant.domain.Enseignant;
import fr.objois.universiteback.enseignant.repository.IEnseignantRepository;
@Service
public class EnseignantBusinessImpl implements IEnseignantBusiness {
	
	@Autowired
	IEnseignantRepository enseignantRepository;

	@Override
	public List<Enseignant> getAllEnseignant() {

		return enseignantRepository.findAll();
	}

	@Override
	public Enseignant getEnseignantDetail(Integer id) {

		return enseignantRepository.getOne(id);
	}

	@Override
	public void ajouteEnseignant(Enseignant enseignant) {
		enseignantRepository.save(enseignant);
		
	}

	@Override
	public void modifierEnseignant(Enseignant enseignant) {
		Enseignant vraiEns = enseignantRepository.getOne(enseignant.getId());
		vraiEns.setNom(enseignant.getNom());
		vraiEns.setPrenom(enseignant.getPrenom());
		vraiEns.setGrade(enseignant.getGrade());
		
		enseignantRepository.save(vraiEns);
		
	}

}
