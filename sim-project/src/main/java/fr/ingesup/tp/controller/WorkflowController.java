package fr.ingesup.tp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ingesup.tp.model.Workflow_Step;
import fr.ingesup.tp.service.WorkflowService;

@Controller
public class WorkflowController {
	@Autowired(required=true)
	@Qualifier(value="worflowservice")
	
	private WorkflowService worflowservice;

	public void setWorflowservice(WorkflowService worflowservice) {
		this.worflowservice = worflowservice;
	}
	
	private static int voir;
	
	 @RequestMapping(value="/parcours/test" ,method =RequestMethod.GET)
	    public String doPost(HttpServletRequest req,ModelMap model) {
			try{
			String reqeute = req.getParameter("id");
		   
			 voir = Integer.parseInt(reqeute);
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
			
		
		  Workflow_Step contact = this.worflowservice.getWorkflow(voir);
		  model.addAttribute("contact",contact);
		
		    return  "parcours";
			
			
			
		}



}
