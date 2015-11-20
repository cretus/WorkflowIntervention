package fr.ingesup.tp.dao;

import java.util.List;

import fr.ingesup.tp.model.Car;

public interface CarDAO {

	public List<Car> listCars();
	public Car getCarById(int id);
	public List<Car> getListCars(int id);
}
