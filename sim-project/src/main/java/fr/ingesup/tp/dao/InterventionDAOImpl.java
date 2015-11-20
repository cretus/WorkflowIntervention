package fr.ingesup.tp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import fr.ingesup.tp.model.Intervention;

@Repository
public class InterventionDAOImpl implements InterventionDAO{

	private static final Logger logger = LoggerFactory.getLogger(InterventionDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addIntervention(Intervention i) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(i);
		logger.info("Intervention saved successfully");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Intervention> listIntervention() {
		
		
		String sql = "FROM Intervention  where estateIntervention!='Completed' ";
		Session session = this.sessionFactory.getCurrentSession();
		 Query query = session.createQuery(sql);
		 List<Intervention> list = query.list();
		  return list;
	}

	@Override
	public Intervention getInterventionById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Intervention i = (Intervention) session.load(Intervention.class, new Integer(id));
		logger.info("Intervention loaded successfully, intervention details="+i);
		return i;
	}

	@Override
	public void updateIntervention(Intervention i) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(i);
		logger.info("Intervention updated successfully, Intervention Details="+i);
	}

	@Override
	public void removeIntervention(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Intervention i = (Intervention) session.load(Intervention.class, new Integer(id));
		if(null != i){
			session.delete(i);
		}
		logger.info("Intervention deleted successfully, Intervention details="+i);
	}

}
