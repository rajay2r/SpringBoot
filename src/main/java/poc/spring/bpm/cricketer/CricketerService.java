package poc.spring.bpm.cricketer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * CricketerService defines operations (methods) to perform on the Cricketer model. 
 */

@Service
public class CricketerService {
	
	@Autowired
	CricketerRepository repo;
	
	public Cricketer saveCricketer(Cricketer cricketer) {
		return repo.save(cricketer);
	}
	
	/*
	 * Fetch all Cricketers
	 */
	public List<Cricketer> fetchCricketers() {
		List<Cricketer> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}
	
	/*
	 * Fetch Cricketer by Name
	 */
	public Cricketer fetchCricketerByName(String cName) {
		return repo.getCricketerBycName(cName);
	}

}
