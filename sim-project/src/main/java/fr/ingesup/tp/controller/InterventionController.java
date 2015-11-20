package fr.ingesup.tp.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



import fr.ingesup.tp.model.Car;
import fr.ingesup.tp.model.City;
import fr.ingesup.tp.model.Intervention;
import fr.ingesup.tp.service.CarService;
import fr.ingesup.tp.service.CityService;
import fr.ingesup.tp.service.InterventionService;

@Controller
@SessionAttributes("variable")
public class InterventionController {
	
	private InterventionService interventionService;
	private CityService cityService;
	private CarService carService;
	
	@Autowired(required=true)
	@Qualifier(value="interventionService")
	public void setInterventionService(InterventionService is){
		this.interventionService = is;
	}
	
	@Autowired(required=true)
	@Qualifier(value="cityService")
	public void setCityService(CityService cs){
		this.cityService = cs;
	}
	
	@Autowired(required=true)
	@Qualifier(value="carService")
	public void setCarService(CarService ca){
		this.carService = ca;
	}
	
	@RequestMapping(value = "/interventions", method = RequestMethod.GET)
	public String newIntervention(Model model) {
		model.addAttribute("intervention", new Intervention());
		model.addAttribute("listIntervention", this.interventionService.listIntervention());
		model.addAttribute("listCity", this.cityService.listCity());
		
		return "intervention";
	}
	
	
	@RequestMapping(value= "/intervention/add", method = RequestMethod.POST)
	public String addIntervention(@ModelAttribute("intervention") Intervention i, Model model){
		
		if(i.getIdIntervention()==0){
			System.out.println("Dans if");
			for(City c : this.cityService.listCity()){
				if(i.getCityDeparture().equals(c.getNameCity())){
					i.setIdSector(c.getIdSector());
				}
			}
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			Date date = new Date();
			
			i.setDate(dateFormat.format(date));
			i.setVehicleResponse("N");
			this.interventionService.addIntervention(i);
			int g = 0;
			for(Intervention in : this.interventionService.listIntervention()){
				if(in.getIdIntervention()>= g){
					g = in.getIdIntervention();
				}
			}
			model.addAttribute("listIntervention", this.interventionService.listIntervention());
			model.addAttribute("intervention", this.interventionService.getInterventionById(g));
			model.addAttribute("listCars", this.carService.listCars());
		}else if(i.getVehicleIntervention()!=null){
			List<Car> car = this.carService.listCars();
			for(Car c : car){
				if(i.getVehicleIntervention().equals(c.getMatriculation())){
					i.setVehicleResponse(c.getAvailable());
					if(c.getAvailable().equals("OK")){
						i.setEstateIntervention("In progress");
					}else{
						i.setVehicleIntervention("");
						i.setVehicleResponse("KO");
						model.addAttribute("listCars", this.carService.getListCars(c.getId()));
						
					}
				}
			}
			this.interventionService.updateIntervention(i);
			int g = 0;
			for(Intervention in : this.interventionService.listIntervention()){
				if(in.getIdIntervention()>= g){
					g = in.getIdIntervention();
				}
			}
			model.addAttribute("listIntervention", this.interventionService.listIntervention());
			model.addAttribute("intervention", this.interventionService.getInterventionById(g));
			
		}else{
			return "redirect:/interventions";
		}
	
		return "intervention";
	}
	
	
	
	
	
	@RequestMapping(value= "/liste/add", method = RequestMethod.POST)
	public String addInterventions(@ModelAttribute("intervention") Intervention i, Model model){
		
		if(i.getIdIntervention()==0){
			System.out.println("Dans if");
			for(City c : this.cityService.listCity()){
				if(i.getCityDeparture().equals(c.getNameCity())){
					i.setIdSector(c.getIdSector());
				}
			}
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			Date date = new Date();
			
			i.setDate(dateFormat.format(date));
			i.setVehicleResponse("N");
			this.interventionService.addIntervention(i);
			int g = 0;
			for(Intervention in : this.interventionService.listIntervention()){
				if(in.getIdIntervention()>= g){
					g = in.getIdIntervention();
				}
			}
			model.addAttribute("listIntervention", this.interventionService.listIntervention());
			model.addAttribute("intervention", this.interventionService.getInterventionById(g));
			model.addAttribute("listCars", this.carService.listCars());
		}else if(i.getVehicleIntervention()!=null){
			List<Car> car = this.carService.listCars();
			for(Car c : car){
				if(i.getVehicleIntervention().equals(c.getMatriculation())){
					i.setVehicleResponse(c.getAvailable());
					if(c.getAvailable().equals("OK")){
						i.setEstateIntervention("In progress");
					}else{
						i.setVehicleIntervention("");
						i.setVehicleResponse("KO");
						model.addAttribute("listCars", this.carService.getListCars(c.getId()));
						
					}
				}
			}
			this.interventionService.updateIntervention(i);
			int g = 0;
			for(Intervention in : this.interventionService.listIntervention()){
				if(in.getIdIntervention()>= g){
					g = in.getIdIntervention();
				}
			}
			model.addAttribute("listIntervention", this.interventionService.listIntervention());
			model.addAttribute("intervention", this.interventionService.getInterventionById(g));
			
		}else{
			return "redirect:/liste";
		}
	
		return "intervention";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/see/{idIntervention}")
	public String seeIntervention(@PathVariable("idIntervention") int idIntervention, Model model){
		model.addAttribute("intervention", this.interventionService.getInterventionById(idIntervention));
		model.addAttribute("listIntervention", this.interventionService.listIntervention());
		model.addAttribute("listCity", this.cityService.listCity());
		
		return "intervention";
	}
	
	@RequestMapping("/delete/{idIntervention}")
    public String removeIntervention(@PathVariable("idIntervention") int idIntervention){
		
        this.interventionService.removeIntervention(idIntervention);
        return "redirect:/interventions";
    }
}
