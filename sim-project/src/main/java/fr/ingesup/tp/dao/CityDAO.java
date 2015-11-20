package fr.ingesup.tp.dao;

import java.util.List;

import fr.ingesup.tp.model.City;

public interface CityDAO {

	public List<City> listCity();
	public City getCityById(int id);
}
