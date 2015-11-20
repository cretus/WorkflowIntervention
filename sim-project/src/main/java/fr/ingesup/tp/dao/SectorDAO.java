package fr.ingesup.tp.dao;

import java.util.List;

import fr.ingesup.tp.model.Sector;

public interface SectorDAO {

	public List<Sector> listSector();
	public Sector getSectorById(int id);
}
