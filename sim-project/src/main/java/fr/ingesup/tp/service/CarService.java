package fr.ingesup.tp.service;

import java.util.List;

import fr.ingesup.tp.model.Car;

public interface CarService {

	public List<Car> listCars();
	public Car getCarById(int id);
	public List<Car> getListCars(int id);
}
