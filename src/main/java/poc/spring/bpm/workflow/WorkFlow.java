package poc.spring.bpm.workflow;

import java.util.List;

import poc.spring.bpm.workflow.task.WorkFlowTask;

public class WorkFlow {
	
	List<WorkFlowTask> workFlowSequence;

	public List<WorkFlowTask> getWorkFlowSequence() {
		return workFlowSequence;
	}

	public void setWorkFlowSequence(List<WorkFlowTask> workFlowSequence) {
		this.workFlowSequence = workFlowSequence;
	}
	
}
