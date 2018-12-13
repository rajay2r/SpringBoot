package poc.spring.bpm.workflow.task;

import java.util.List;

import org.springframework.stereotype.Service;

public interface WorkFlowTask {
	
	Object performOperations(List<Object> args);

}
