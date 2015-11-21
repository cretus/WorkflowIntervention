package fr.ingesup.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.spel.ast.Operator;

import fr.ingesup.tp.model.Operateur;

public class OperateurDaoImpl  implements OperateurDao{

	private static final Logger logger = LoggerFactory.getLogger(OperateurDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Operateur> getOperateur() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Operateur> operatorList = session.createQuery("from Operateur").list();
		
		for(Operateur o : operatorList){
			logger.info("Operator List::"+o);
		}
		return operatorList;
	}

}
