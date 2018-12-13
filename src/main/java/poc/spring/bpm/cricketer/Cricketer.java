package poc.spring.bpm.cricketer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * Cricketer model class
 */
@Entity
public class Cricketer {
	
	@Id
	@GeneratedValue
	int id;
	
	String cName;
	String country;
	int matches;
	int runsScored;
	int notOuts;
	int wickets;
	int runsConceded;
	double batAvg;
	double bowAvg;
	
	public Cricketer() {
		super();
	}
	
	public Cricketer(String cName, String country, int matches, int runsScored, int notOuts, int wickets,
			int runsConceded) {
		super();
		this.cName = cName;
		this.country = country;
		this.matches = matches;
		this.runsScored = runsScored;
		this.notOuts = notOuts;
		this.wickets = wickets;
		this.runsConceded = runsConceded;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getNotOuts() {
		return notOuts;
	}
	public void setNotOuts(int notOuts) {
		this.notOuts = notOuts;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getRunsConceded() {
		return runsConceded;
	}
	public void setRunsConceded(int runsConceded) {
		this.runsConceded = runsConceded;
	}
	public double getBatAvg() {
		return batAvg;
	}
	public void setBatAvg(double batAvg) {
		this.batAvg = batAvg;
	}
	public double getBowAvg() {
		return bowAvg;
	}
	public void setBowAvg(double bowAvg) {
		this.bowAvg = bowAvg;
	}
	
}
