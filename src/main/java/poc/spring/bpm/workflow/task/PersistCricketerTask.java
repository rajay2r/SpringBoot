package poc.spring.bpm.workflow.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import poc.spring.bpm.cricketer.Cricketer;
import poc.spring.bpm.cricketer.CricketerService;

public class PersistCricketerTask implements WorkFlowTask {
	
	@Autowired
	CricketerService cricketerService;

	@Override
	public Object performOperations(List<Object> args) {
		System.out.println("In PersistCricketerTask");
		return cricketerService.saveCricketer((Cricketer) args.get(0));
	}

}
