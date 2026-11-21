package diseaseTracker;

/**
 * Handles status counts for each Infection Status within a Population.
 *
 * @author Keanu Cruz + Caliana Caldwell
 *
 */
public class StatisticsSimulator {
	private int susceptibleCount;
	private int infectedCount;
	private int vaccinatedCount;
	private int recoveredCount;
	
	/**
	 * Resets all current InfectionStatus counts then rebuilds the count for inputted population.
	 * @param population
	 */
	public void updateStats(Population population) {
		susceptibleCount = 0;
		infectedCount = 0;
		vaccinatedCount = 0;
		recoveredCount = 0;
		
		for (Person p : population.getPeople()) {
			if (p.getStatus() == InfectionStatus.INFECTED) {
				infectedCount++;
			}
			else if (p.getStatus() == InfectionStatus.VACCINATED) {
				vaccinatedCount++;
			}
			else if (p.getStatus() == InfectionStatus.RECOVERED) {
				recoveredCount++;
			}
			else if (p.getStatus() == InfectionStatus.SUSCEPTIBLE){
				susceptibleCount++;
			}
		}
	}

	/**
	 * Returns how many people are susceptible to infection in a population.
	 * @return number of susceptible people in a population.
	 */
	public int getSusceptibleCount() {
		return susceptibleCount;
	}

	/**
	 * Returns how many people are infected in a population.
	 * @return number of infected individuals.
	 */
	public int getInfectedCount() {
		return infectedCount;
	}

	/**
	 * Returns how many people are vaccinated in a population.
	 * @return number of vaccinated individuals.
	 */
	public int getVaccinatedCount() {
		return vaccinatedCount;
	}

	/**
	 * Returns how many people have recovered from infection in a population.
	 * @return number of recovered individuals.
	 */
	public int getRecoveredCount() {
		return recoveredCount;
	}
	
	
}
