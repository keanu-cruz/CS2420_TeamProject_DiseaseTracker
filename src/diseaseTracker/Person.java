package diseaseTracker;

/**
 * Represents a person using an ID number and a list of potential infection
 * details.
 *
 * @author Keanu Cruz + Caliana Caldwell
 *
 */
public class Person {
	private int id;
	private InfectionStatus status = InfectionStatus.SUSCEPTIBLE;
	private int daysInfected = 0;
	private boolean vaccinated = false;
	private boolean isolated = false;

	/**
	 * Constructs a singular person.
	 * 
	 * @param id number that represents a person
	 * @param vaccinated person can be immune if set to true.
	 */
	public Person(int id, boolean vaccinated) {
		super();
		this.id = id;
		this.vaccinated = vaccinated;

		if (vaccinated) {
			this.status = InfectionStatus.VACCINATED;
		}
		//added by Caliana
		else {
			this.status = InfectionStatus.SUSCEPTIBLE;
		}
	}

	/**
	 * Changes persons infection status to INFECTED if not already VACCINATED.
	 */
	public void infect() {
		if (!vaccinated) {
			status = InfectionStatus.INFECTED;
			daysInfected = 0;
		}
	}

	/**
	 * Changes persons infection status to RECOVERED.
	 */
	public void recover() {
		if (!vaccinated) {
			status = InfectionStatus.RECOVERED;
		}
	}

	/**
	 * Changes persons infection status to VACCINATED.
	 */
	public void vaccinate() {
		// TODO - Potentially add threshold for infected before vaccination works.
		status = InfectionStatus.VACCINATED;
		vaccinated = true;
	}

	/**
	 * Returns whether an individual has been isolated or not.
	 * 
	 * @return Returns true if person has been isolated.
	 */
	public boolean isolate() {
		return isolated = true;
	}

	/**
	 * Returns the infection status of a Person.
	 * 
	 * @return status
	 */
	public InfectionStatus getStatus() {
		return status;
	}

	/**
	 * sets the infection status of a Person
	 * 
	 * @param new InfectionStatus
	 */
	public void setStatus(InfectionStatus s) {
		//added by Caliana
		this.status = s;
	}
	
	/**
	 * Returns unique number that represents a person.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Returns number of days infected;
	 * 
	 * @return daysInfected
	 */
	public int getDaysInfected() {
		return daysInfected;
	}

	/**
	 * Returns true if person is VACCINATED.
	 * 
	 * @return vaccinated
	 */
	public boolean isVaccinated() {
		return vaccinated;
	}

	/**
	 * Returns true if person has been isolated.
	 * 
	 * @return isolate
	 */
	public boolean isIsolated() {
		return isolated;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", status=" + status + ", daysInfected=" + daysInfected + ", vaccinated="
				+ vaccinated + ", isolated=" + isolated + "]";
	}

	/**
	 * Test Client for Person.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person(1, false);
		Person p2 = new Person(2, false);
		Person p3 = new Person(3, true);
		
		// === Test toString()
		System.out.println("=== Test toString ===");
		System.out.println(p1.toString());
		System.out.println(p3.toString());
		System.out.println();
		
		// === Test isVaccinated()
		System.out.println("=== Test isVaccinated ===");
		System.out.println("Expected: p1 - false | p3 - true");
		System.out.println("Actual:   p1 - " + p1.isVaccinated() + " | p3 - " + p3.isVaccinated());
		System.out.println();

		// === Test infect() ===
		System.out.println("=== Test Infect ===");
		p1.infect();
		p3.infect();

		System.out.println("Expected: p1 - INFECTED | p3 - VACCINATED");
		System.out.println("Actual:   p1 - " + p1.getStatus() + " | p3 - " + p3.getStatus());
		System.out.println();

		// === Test recover() ===
		System.out.println("=== Test Recover ===");
		p1.recover();
		p3.recover(); // if vaccinated there should be no need to recover

		System.out.println("Expected: p1 - RECOVERED | p3 - VACCINATED");
		System.out.println("Actual:   p1 - " + p1.getStatus() + " | p3 - " + p3.getStatus());
		System.out.println();
		
		// === Test vaccinate() ===
		System.out.println("=== Test Vaccinate ===");
		p1.vaccinate(); // basic testing to vaccinate. May add additional functionality with a threshold.
		p3.vaccinate(); 

		System.out.println("Expected: p1 - VACCINATED | p3 - VACCINATED");
		System.out.println("Actual:   p1 - " + p1.getStatus() + " | p3 - " + p3.getStatus());
		System.out.println();
		
		// === Test isolate() ===
		System.out.println("=== Test Isolate ===");
		p1.isolate();
		p2.isolate(); 

		System.out.println("Expected: p1 - true | p2 - true | p3 - false");
		System.out.println("Actual:   p1 - " + p1.isIsolated() + " | p2 - " + p2.isIsolated() + " | p3 - " + p3.isIsolated());
		System.out.println();
		
		

	}

}
