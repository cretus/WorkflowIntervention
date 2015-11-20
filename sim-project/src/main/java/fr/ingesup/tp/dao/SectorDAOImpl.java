package fr.ingesup.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import fr.ingesup.tp.model.Sector;

@Repository
public class SectorDAOImpl implements SectorDAO {

	private static final Logger logger = LoggerFactory.getLogger(SectorDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Sector> listSector() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Sector> sectorList = session.createQuery("from Sector").list();
		for(Sector s : sectorList){
			logger.info("Sector List::"+s);
		}
		return sectorList;
	}

	@Override
	public Sector getSectorById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Sector s = (Sector) session.load(Sector.class, new Integer(id));
		logger.info("Sector loaded successfully");
		return s;
	}

}
