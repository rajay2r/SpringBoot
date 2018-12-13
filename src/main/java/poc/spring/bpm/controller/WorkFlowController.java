package poc.spring.bpm.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import poc.spring.bpm.cricketer.Cricketer;
import poc.spring.bpm.cricketer.CricketerService;
import poc.spring.bpm.workflow.WorkFlowConfiguration;
import poc.spring.bpm.workflow.task.WorkFlowTask;

/*
 * REST Controller for the Work Flow of Cricketer
 */
@RestController
public class WorkFlowController {
	
	@Autowired
	WorkFlowConfiguration workFlowConfiguration;
	
	@Autowired
	CricketerService cricketerService;
	
	/*
	 * REST end-point POST to
	 * initateWorkFlow - Initiates Work Flow for Cricketer that performs various operation and persist the data at last stage.
	 */
	@RequestMapping(value="/cricketers/initateWorkFlow", method=RequestMethod.POST)
	public void initateWorkFlow(@RequestBody Cricketer cricketer) {
		List<WorkFlowTask> workFlowSequence = workFlowConfiguration.getWorkFlowSequence1().getWorkFlowSequence();
		for(WorkFlowTask task : workFlowSequence) {
			List list = new ArrayList<Cricketer>();
			list.add(cricketer);
			cricketer = (Cricketer) task.performOperations(list);
		}
	}
	
	/*
	 * REST end-point to list all the available Cricketers
	 */
	@RequestMapping(value="/cricketers", method=RequestMethod.GET)
	public List<Cricketer> listCricketers() {
		return cricketerService.fetchCricketers();
	}
	
	/*
	 * REST end-point to get Cricketer by name
	 */
	@RequestMapping(value="/cricketers/{cname}", method=RequestMethod.GET)
	public Cricketer getCricketerByName(@PathVariable("cname") String cName) {
		return cricketerService.fetchCricketerByName(cName);
	}
	
}
