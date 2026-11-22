package diseaseTracker;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.ST;

/**
 * represents a population of a given amount of people
 * 
 * @author Caliana Caldwell + Keanu Cruz
 */
public class Population {
	private Graph contactGraph;
	private ST<Integer, Person> people;
	private int popSize;
	
	/**
	 * randomly generates a Population of a given size.
	 * 
	 * @param size
	 */
	public ST<Integer, Person> generatePopulation(int size) {
		people = new ST<Integer, Person>();
		popSize = size;
		for (int i = 0; i < size; i++) {
			//TODO - add a way for vaccination status to be selected randomly, given
			//the user-input chance of vaccination.
			Person p = new Person(i, false);
			people.put(i, p);
		}
		return people;
	}
	
	/**
	 * represents two people coming into contact with each other
	 * 
	 * @param person1
	 * @param person2
	 */
	public void addContact(Person person1, Person person2) {
		//TODO - do we need to keep track of who had contact with who?
	}
	
	/**
	 * retrieves a person's information based on their ID
	 * 
	 * @param personID
	 */
	public Person getPerson(int id) {
		if (people.contains(id)) {
			return people.get(id);
		}
		
		return null;
	}
	
	/**
	 * returns all people that a given Person has had contact with
	 * 
	 * @param personID
	 */
	public Person[] getContacts(int id) {
		//TODO - do we need to keep track of who had contact with who?
		return null;
	}
	
	/**
	 * returns a Graph of the population
	 * 
	 */
	public Graph getGraph() {
		return contactGraph;
	}
	
	/**
	 * returns the size of the population
	 * 
	 */
	public int getPopSize() {
		return popSize;
	}
	
	
}
