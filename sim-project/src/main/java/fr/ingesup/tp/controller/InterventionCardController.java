package fr.ingesup.tp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ingesup.tp.service.InterventionService;

@Controller
public class InterventionCardController {

	private InterventionService interventionService;
	
	@Autowired(required=true)
	@Qualifier(value="interventionService")
	public void setInterventionService(InterventionService is){
		this.interventionService = is;
	}
	
	@RequestMapping(value = "/interventionCard/{idIntervention}")
	public String readInterventionCard(@PathVariable("idIntervention") int idIntervention, Model model){
		
		model.addAttribute("intervention", this.interventionService.getInterventionById(idIntervention));
		
		return "interventionCard";
	}
}
