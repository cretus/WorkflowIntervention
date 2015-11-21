package fr.ingesup.tp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.ingesup.tp.dao.Workflow_DAO;
import fr.ingesup.tp.model.Workflow_Step;
@Service
public class WorkflowServiceImpl implements WorkflowService{

private Workflow_DAO workflowDAO;
	
	




	public void setWorkflowDAO(Workflow_DAO workflowDAO) {
		this.workflowDAO = workflowDAO;
	}






	@Override
	@Transactional
	public Workflow_Step getWorkflow(int idContact) {
		// TODO Auto-generated method stub
		return this.workflowDAO.getWorkflow(idContact) ;
	}
}
