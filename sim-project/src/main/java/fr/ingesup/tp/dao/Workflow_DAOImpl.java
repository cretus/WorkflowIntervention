package fr.ingesup.tp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import fr.ingesup.tp.model.Workflow_Step;

public class Workflow_DAOImpl  implements Workflow_DAO{

private DataSource dataSource;
	

	




	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}






	private JdbcTemplate jdbcTemplate;
	 private Workflow_Step contact;
    
 
	
	

	@Override
	public Workflow_Step getWorkflow(int idContact)  {
		// TODO Auto-generated method stub
	
		jdbcTemplate = new JdbcTemplate(dataSource);
		String  query =  "select  idWorkflow_Step,FirstStep,SecondStep,ThirdStep,FourStep,FiveStep from workflow_step where idAll_Interventions = "+idContact;
		return jdbcTemplate.query(query, new ResultSetExtractor< Workflow_Step>() {
			 
	        @Override
	        public Workflow_Step extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	            	 contact = new Workflow_Step();
	                contact.setIdworkflow_step(rs.getInt("idworkflow_step"));
	                contact.setFirstStep(rs.getString("FirstStep"));
	                contact.setSecondStep(rs.getString("SecondStep"));
	                contact.setThirdStep(rs.getString("ThirdStep"));
	                contact.setFourStep(rs.getString("FourStep"));
	                contact.setFiveStep(rs.getString("FiveStep"));
	               
	                            }
	            return contact;
	         
	                        }
	        
	 
	    });
		
            
}           
            
}
