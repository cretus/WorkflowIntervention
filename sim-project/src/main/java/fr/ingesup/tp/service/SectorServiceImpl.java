package fr.ingesup.tp.service;

import java.util.List;




import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.ingesup.tp.dao.SectorDAO;
import fr.ingesup.tp.model.Sector;

@Service
public class SectorServiceImpl implements SectorService {

	private SectorDAO sectorDAO;

	public void setSectorDAO(SectorDAO sectorDAO) {
		this.sectorDAO = sectorDAO;
	}

	@Override
	@Transactional
	public List<Sector> listSector() {
		return this.sectorDAO.listSector();
	}

	@Override
	@Transactional
	public Sector getSectorById(int id) {
		return this.sectorDAO.getSectorById(id);
	}

}
