package fr.ingesup.tp.service;

import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.ingesup.tp.dao.CarDAO;
import fr.ingesup.tp.model.Car;

@Service
public class CarServiceImpl implements CarService {

	private CarDAO carDAO;

	public void setCarDAO(CarDAO carDAO) {
		this.carDAO = carDAO;
	}
	
	@Override
	@Transactional
	public List<Car> listCars() {
		return this.carDAO.listCars();
	}

	@Override
	@Transactional
	public Car getCarById(int id) {
		return this.carDAO.getCarById(id);
	}

	@Override
	@Transactional
	public List<Car> getListCars(int id) {
		return this.carDAO.getListCars(id);
	}
}
