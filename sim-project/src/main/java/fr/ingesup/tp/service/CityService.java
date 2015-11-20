package fr.ingesup.tp.service;

import java.util.List;

import fr.ingesup.tp.model.City;

public interface CityService {

	public List<City> listCity();
	public City getCityById(int id);
}
