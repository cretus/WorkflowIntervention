package fr.ingesup.tp.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import fr.ingesup.tp.model.Car;

@Repository
public class CarDAOImpl implements CarDAO {

	private static final Logger logger = LoggerFactory.getLogger(CarDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Car> listCars() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Car> carsList = session.createQuery("from Car").list();
		for(Car c : carsList){
			logger.info("Car List::"+c);
		}
		return carsList;
	}

	@Override
	public Car getCarById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Car c = (Car) session.load(Car.class, new Integer(id));
		logger.info("Car loaded successfully");
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> getListCars(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Car> carsList = session.createQuery("from Car").list();
		Iterator<Car> it = carsList.iterator();
		while(it.hasNext()){
			Car c = it.next();
			if(c.getId()==id){
				it.remove();
			}
		}
		for(Car c : carsList){
			logger.info("Car List::"+c);
		}
		return carsList;
	}

}
