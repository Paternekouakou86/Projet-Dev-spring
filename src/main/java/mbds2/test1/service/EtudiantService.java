package mbds2.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbds2.test1.entity.Etudiant;
import mbds2.test1.repository.EtudiantRepository;
@Service

public class EtudiantService implements IEtudiantService {
	@Autowired
	private EtudiantRepository etudiantrepository ;
	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getEtudiantById(Long etudiantID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEtudiant(Long EtudiantId) {
		// TODO Auto-generated method stub
		
	}
	

}
