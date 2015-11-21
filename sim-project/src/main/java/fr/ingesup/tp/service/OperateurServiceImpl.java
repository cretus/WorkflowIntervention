package fr.ingesup.tp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.ingesup.tp.dao.OperateurDao;
import fr.ingesup.tp.model.Operateur;

@Service
public class OperateurServiceImpl implements OperateurService {
private OperateurDao operatorDAO;

	
	
	
	public void setOperatorDAO(OperateurDao operatorDAO) {
	this.operatorDAO = operatorDAO;
}
	
	@Override
	public List<Operateur> getOperateur() {
		// TODO Auto-generated method stub
		return this.operatorDAO.getOperateur();
	}

}
