package fr.ingesup.tp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Workflow_Step")

public class Workflow_Step {
	@Id
	@Column(name ="idworkflow_step")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idworkflow_step;
	private String FirstStep;
	private String SecondStep;
	private String ThirdStep;
	private String  FourStep;
	
	private String FiveStep;
    private String SixStep;
    private int idAll_Interventions;
	public int getIdworkflow_step() {
		return idworkflow_step;
	}
	public void setIdworkflow_step(int idworkflow_step) {
		this.idworkflow_step = idworkflow_step;
	}
	public String getFirstStep() {
		return FirstStep;
	}
	public void setFirstStep(String firstStep) {
		FirstStep = firstStep;
	}
	public String getSecondStep() {
		return SecondStep;
	}
	public void setSecondStep(String secondStep) {
		SecondStep = secondStep;
	}
	public String getThirdStep() {
		return ThirdStep;
	}
	public void setThirdStep(String thirdStep) {
		ThirdStep = thirdStep;
	}
	public String getFourStep() {
		return FourStep;
	}
	public void setFourStep(String fourStep) {
		FourStep = fourStep;
	}
	public String getFiveStep() {
		return FiveStep;
	}
	public void setFiveStep(String fiveStep) {
		FiveStep = fiveStep;
	}
	public String getSixStep() {
		return SixStep;
	}
	public void setSixStep(String sixStep) {
		SixStep = sixStep;
	}
	public int getIdAll_Interventions() {
		return idAll_Interventions;
	}
	public void setIdAll_Interventions(int idAll_Interventions) {
		this.idAll_Interventions = idAll_Interventions;
	}
	@Override
	public String toString() {
		return "Workflow_Step [idworkflow_step=" + idworkflow_step
				+ ", FirstStep=" + FirstStep + ", SecondStep=" + SecondStep
				+ ", ThirdStep=" + ThirdStep + ", FourStep=" + FourStep
				+ ", FiveStep=" + FiveStep + ", SixStep=" + SixStep
				+ ", idAll_Interventions=" + idAll_Interventions + "]";
	}

	
    
	
}
