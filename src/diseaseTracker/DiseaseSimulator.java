package diseaseTracker;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Handles the spreading of the disease, simulates transmission
 * 
 * @author Caliana Caldwell + Keanu Cruz
 */
public class DiseaseSimulator {
	private Population population;
	//transmission rate is a number for a N in 100 chance of infection
	private double transmissionRate;
	private int recoverPeriod;
	
	/**
	 * infects a person
	 * 
	 * @param ID of the person to be infected
	 */
	public void injectInfection(int personID) {
		Person p = population.getPerson(personID);
		p.infect();
	}
	
	/**
	 * Causes one day to pass, simulates transmissions that could happen in a day,
	 * as well as how many people may recover from the illness in a given day
	 * depending on how long they've been sick.
	 * 
	 */
	public void simulateDay() {
		for (int i = 0; i < population.getPopSize(); i++) {
			Person p = population.getPerson(i);
			if (p.getStatus() == InfectionStatus.INFECTED && p.getDaysInfected() == recoverPeriod) {
				p.setStatus(InfectionStatus.RECOVERED);
			}
			if (p.getStatus() == InfectionStatus.SUSCEPTIBLE) {
				double d = StdRandom.uniformDouble(0, 100);
				if (d <= transmissionRate) {
					p.setStatus(InfectionStatus.INFECTED);
				}
			}
		}
	}
	

}
