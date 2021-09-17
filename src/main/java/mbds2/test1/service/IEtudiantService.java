package mbds2.test1.service;

import java.util.List;

import mbds2.test1.entity.Etudiant;

public interface IEtudiantService {
	List<Etudiant> getAllEtudiants();
	Etudiant getEtudiantById(Long etudiantID);
	Boolean addEtudiant(Etudiant etudiant);
	void updateEtudiant (Etudiant etudiant);
	void deleteEtudiant(Long EtudiantId);
	
}
