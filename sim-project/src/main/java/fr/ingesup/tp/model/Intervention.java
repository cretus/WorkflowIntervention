package fr.ingesup.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="INTERVENTION")
public class Intervention {
	
	@Id
	@Column(name="idIntervention")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idIntervention;
	
	private String wording;
	
	private String date;
	
	private String estateIntervention;
	
	private String addressIntervention;
	
	private String cityDeparture;
	
	private String vehicleIntervention;
	
	private String hospitalIntervention;
	
	private String statePatient;
	
	private int idSector;
	
	private String cityArrival;
	
	private String vehicleResponse;
	private String idAll_Interventions;

	public int getIdIntervention(){
		return idIntervention;
	}
	
	public void setIdIntervention(int idIntervention){
		this.idIntervention = idIntervention;
	}
	
	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEstateIntervention() {
		return estateIntervention;
	}

	public void setEstateIntervention(String estateIntervention) {
		this.estateIntervention = estateIntervention;
	}

	public String getAddressIntervention() {
		return addressIntervention;
	}

	public void setAddressIntervention(String addressIntervention) {
		this.addressIntervention = addressIntervention;
	}

	public String getCityDeparture() {
		return cityDeparture;
	}

	public void setCityDeparture(String cityDeparture) {
		this.cityDeparture = cityDeparture;
	}

	public String getVehicleIntervention() {
		return vehicleIntervention;
	}

	public void setVehicleIntervention(String vehicleIntervention) {
		this.vehicleIntervention = vehicleIntervention;
	}

	public String getHospitalIntervention() {
		return hospitalIntervention;
	}

	public void setHospitalIntervention(String hospitalIntervention) {
		this.hospitalIntervention = hospitalIntervention;
	}

	public String getStatePatient() {
		return statePatient;
	}

	public void setStatePatient(String statePatient) {
		this.statePatient = statePatient;
	}

	public int getIdSector() {
		return idSector;
	}

	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	public String getCityArrival() {
		return cityArrival;
	}

	public void setCityArrival(String cityArrival) {
		this.cityArrival = cityArrival;
	}

	public String getVehicleResponse() {
		return vehicleResponse;
	}

	public void setVehicleResponse(String vehicleResponse) {
		this.vehicleResponse = vehicleResponse;
	}

	public String getIdAll_Interventions() {
		return idAll_Interventions;
	}

	public void setIdAll_Interventions(String idAll_Interventions) {
		this.idAll_Interventions = idAll_Interventions;
	}
	
}
