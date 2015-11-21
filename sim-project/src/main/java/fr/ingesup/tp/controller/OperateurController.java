package fr.ingesup.tp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ingesup.tp.model.Operateur;
import fr.ingesup.tp.service.OperateurService;

@Controller
public class OperateurController {
private OperateurService operatorService;
	
	@Autowired(required=true)
	@Qualifier(value="operatorService")
	public void setOperatorService(OperateurService os){
		this.operatorService = os;
	}
	@RequestMapping(value = "/")
	public String get(){
		return "home";
	}
	
	@RequestMapping(value = "/operators")
	public String listOperator(Model model) {
		model.addAttribute("operator", new Operateur());
		model.addAttribute("listOperator", this.operatorService.getOperateur());
		
		return "operator";
	}
	
	@RequestMapping(value = "/operator/test", method = RequestMethod.POST)
	public String testOperator(@ModelAttribute("operator") Operateur o, HttpServletRequest request) {
		
		for(Operateur i : this.operatorService.getOperateur()){
			if((i.getNom().equals(o.getNom()) ) && (i.getPrenom().equals(o.getPrenom()))){
				
				return "redirect:/interventions";
			}
		}
		return "redirect:/operators";
	}
	

}
