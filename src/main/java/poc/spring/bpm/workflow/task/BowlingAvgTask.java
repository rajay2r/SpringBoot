package poc.spring.bpm.workflow.task;

import java.util.List;

import org.springframework.stereotype.Service;

import poc.spring.bpm.cricketer.Cricketer;

public class BowlingAvgTask implements WorkFlowTask {

	@Override
	public Object performOperations(List<Object> args) {
		System.out.println("In BowlingAvgTask");
		Cricketer cricketer = (Cricketer) args.get(0);
		double bowAvg = cricketer.getRunsConceded() / (double) cricketer.getWickets();
		cricketer.setBowAvg(bowAvg);
		return cricketer;
	}

}
