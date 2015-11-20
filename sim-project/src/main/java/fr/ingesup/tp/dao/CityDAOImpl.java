package fr.ingesup.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import fr.ingesup.tp.model.City;

@Repository
public class CityDAOImpl implements CityDAO {

	private static final Logger logger = LoggerFactory.getLogger(CityDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<City> listCity() {
		Session session = this.sessionFactory.getCurrentSession();
		List<City> cityList = session.createQuery("from City").list();
		for(City c : cityList){
			logger.info("Person City::"+c);
		}
		return cityList;
	}

	@Override
	public City getCityById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		City c = (City) session.load(City.class, new Integer(id));
		logger.info("City loaded successfully");
		return c;
	}

}
