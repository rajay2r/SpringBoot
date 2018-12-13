package poc.spring.bpm.workflow.task;

import java.util.List;

import org.springframework.stereotype.Service;

import poc.spring.bpm.cricketer.Cricketer;

public class BattingAvgTask implements WorkFlowTask {

	@Override
	public Object performOperations(List<Object> args) {
		System.out.println("In BattingAvgTask");
		Cricketer cricketer = (Cricketer) args.get(0);
		double batAvg = cricketer.getRunsScored() / (double) (cricketer.getMatches() - cricketer.getNotOuts());
		cricketer.setBatAvg(batAvg);
		return cricketer;
	}

}
