package fr.ingesup.tp.service;

import java.util.List;

import fr.ingesup.tp.model.Sector;

public interface SectorService {

	public List<Sector> listSector();
	public Sector getSectorById(int id);
}
