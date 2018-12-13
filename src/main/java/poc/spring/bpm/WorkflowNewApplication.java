package poc.spring.bpm;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

import poc.spring.bpm.controller.WorkFlowController;
import poc.spring.bpm.cricketer.Cricketer;

@SpringBootApplication
public class WorkflowNewApplication {
	
	@Autowired
	WorkFlowController workFlowController;

	public static void main(String[] args) {
		SpringApplication.run(WorkflowNewApplication.class, args);
	}

	/*
	 * Initiate the WorkFlow - SequenceOne with a sample Cricketer
	 */
	@PostConstruct
	@DependsOn(value = {"workFlowController"})
	public void postConstruct() {
		// Initiate the Work Flow with a sample Cricketer
		Cricketer cricketer = new Cricketer("Sachin", "India", 451, 16890, 45, 245, 4321);
		workFlowController.initateWorkFlow(cricketer);
	}
}

