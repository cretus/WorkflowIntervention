package fr.ingesup.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SECTOR")
public class Sector {

	@Id
	@Column(name="idSector")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSector;
	
	private String nameSector;
	
	private String wording;
	
	public int getSectorId() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getNameSector() {
		return nameSector;
	}

	public void setNameSector(String nameSector) {
		this.nameSector = nameSector;
	}

	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}
}
