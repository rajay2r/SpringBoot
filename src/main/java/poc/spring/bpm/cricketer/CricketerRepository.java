package poc.spring.bpm.cricketer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketerRepository extends CrudRepository<Cricketer, Integer> {
	
	public Cricketer getCricketerBycName(String cName);

}
