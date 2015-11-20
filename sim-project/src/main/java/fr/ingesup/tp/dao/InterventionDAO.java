package fr.ingesup.tp.dao;

import java.util.List;

import fr.ingesup.tp.model.Intervention;

public interface InterventionDAO {

	public void addIntervention(Intervention i);
	public void updateIntervention(Intervention i);
	public List<Intervention> listIntervention();
	public Intervention getInterventionById(int id);
	public void removeIntervention(int id);
	
}
