package poc.spring.bpm.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:workflow-config.xml"})
public class WorkFlowConfiguration {

	@Autowired
	@Qualifier("workflow1")
	private WorkFlow workFlowSequence1;

	public WorkFlow getWorkFlowSequence1() {
		return workFlowSequence1;
	}

	public void setWorkFlowSequence1(WorkFlow workFlowSequence1) {
		this.workFlowSequence1 = workFlowSequence1;
	}
	
}
