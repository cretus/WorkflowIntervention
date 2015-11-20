package fr.ingesup.tp.service;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.ingesup.tp.dao.InterventionDAO;
import fr.ingesup.tp.model.Intervention;

@Service
public class InterventionServiceImpl implements InterventionService {

	private InterventionDAO interventionDAO;
	
	public void setInterventionDAO(InterventionDAO interventionDAO){
		this.interventionDAO = interventionDAO;
	}
	
	@Override
	@Transactional
	public void addIntervention(Intervention i) {
		this.interventionDAO.addIntervention(i);
	}

	@Override
	@Transactional
	public List<Intervention> listIntervention() {
		return this.interventionDAO.listIntervention();
	}

	@Override
	@Transactional
	public Intervention getInterventionById(int id) {
		return this.interventionDAO.getInterventionById(id);
	}

	@Override
	@Transactional
	public void updateIntervention(Intervention i) {
		this.interventionDAO.updateIntervention(i);
	}

	@Override
	@Transactional
	public void removeIntervention(int id) {
		this.interventionDAO.removeIntervention(id);
	}

}
