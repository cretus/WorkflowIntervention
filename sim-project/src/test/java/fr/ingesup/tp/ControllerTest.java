package fr.ingesup.tp;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import fr.ingesup.tp.controller.WorkflowController;
import fr.ingesup.tp.service.WorkflowService;


// tell to junit to use another runner 

@RunWith(SpringJUnit4ClassRunner.class)   
// allows to load configuration file 
@ContextConfiguration("*classpath:*servlet-context.xml")
// here we declare our annotation ContextConfiguration
@WebAppConfiguration



public class ControllerTest {
	// here we mock our service 
	@Mock
	private WorkflowService wsservice;
	// our container where we inject the mock 
	@InjectMocks
	private WorkflowController ctrl;
	private MockMvc mock;
	//method which 
	@Before
	public void SetUp(){
		//we call mockito on our mock
		MockitoAnnotations.initMocks(this);
		// we put our spring test in standalone mode that allows to test our controll to isolation mode
		this.mock =MockMvcBuilders.standaloneSetup(ctrl).build();
		
	}
	
		 
		
	
	
	 
	
@Test
// method for testing that means method of unit test
public void tests() throws Exception{
	
	
	
	//Set the 'Accept' header to the given media type(s) 
	MockHttpServletRequestBuilder requet = MockMvcRequestBuilders.get("/parcours/test").accept(MediaType.ALL);
	//Allows applying actions, such as expectations, on the result of an executed request
	
	ResultActions result = mock.perform(requet);
	// we have to  Ensure that the HTTP status code 200 is returned.
	//Provide an expectation.
	result.andExpect(MockMvcResultMatchers.status().isOk());
	
	
	
	
	 
	 
	
}
}
