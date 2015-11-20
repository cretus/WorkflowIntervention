package fr.ingesup.tp.service;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.ingesup.tp.dao.CityDAO;
import fr.ingesup.tp.model.City;

@Service
public class CityServiceImpl implements CityService {

	private CityDAO cityDAO;

	public void setCityDAO(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}
	
	@Override
	@Transactional
	public List<City> listCity() {
		return this.cityDAO.listCity();
	}

	@Override
	@Transactional
	public City getCityById(int id) {
		return this.cityDAO.getCityById(id);
	}

}
