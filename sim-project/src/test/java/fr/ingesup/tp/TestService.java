package fr.ingesup.tp;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;








import fr.ingesup.tp.dao.Workflow_DAO;
import fr.ingesup.tp.model.Workflow_Step;
import fr.ingesup.tp.service.WorkflowService;
import fr.ingesup.tp.service.WorkflowServiceImpl;

// that class allows invokes junit  and tell him to use another runner
@RunWith(SpringJUnit4ClassRunner.class)
// load configuration file here servlet Context
@ContextConfiguration ("*classpath:*servlet-context.xml")

public class TestService {
	
	
	private Workflow_DAO workflowDAO;
	 private WorkflowService worflowservice;
	  

 // method that execute before first unit method
 
  @Before
  public void setUp(){
	   // we call mock on WorkflowDAO.class
	   workflowDAO = Mockito.mock(Workflow_DAO.class);
	  // here we defined our bean 
	   worflowservice = new WorkflowServiceImpl();
	   
  }
	// @Test inform the runner that this method is a unit Test	 	   

  @Test
  public void testIntegration(){
	   Workflow_Step ws  = new Workflow_Step();
	       ws.setSecondStep("moyen");
	     // this method verify that the response expected is conform to result what we get  
	   assertEquals("check name:","moyen", ws.getSecondStep());
	  
		
  }

}
