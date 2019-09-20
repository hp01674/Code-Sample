package assignment;

import java.util.ArrayList;

public class Swimmer extends Athlete {

	// variables
	private String team;
	private ArrayList<String> events;
	// constructor 
	public Swimmer(String lName, String fName, int birthYear, int birthMonth, int birthDay, char gender, String team) {
		super(lName, fName, birthYear, birthMonth, birthDay, gender);
		this.team = team;
		events = new ArrayList<String>();

	}
	// method to return team
	public String getTeam() {
		return team;
	}
	// method to set team
	public void setTeam(String team) {
		this.team = team;
	}

	// Add an event
	public boolean addEvent(String singleEvent) {

		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).equalsIgnoreCase(singleEvent)) {
				return false;
			}
		}
		events.add(singleEvent);
		return true;

	}

	// Add multiple events
	public boolean addEvent(ArrayList<String> multiEvents) {
		boolean value = true;
		for (int i = 0; i < multiEvents.size(); i++) {
			if (!events.contains(multiEvents.get(i))) {
				events.add(multiEvents.get(i));
			} else {
				value = false;

			}
		}

		return value;
	}
	// checks for duplicates
	public boolean duplicates(ArrayList<String> events) {
		for (int i = 0; i < events.size(); i++) {
			for (int j = i + 1; j < events.size(); j++) {
				if (events.get(i) == events.get(j)) {
					return true;
				}
			}
		}
		return false;
	}

	public ArrayList<String> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<String> events) {
		this.events = events;
	}
	// to string()
	public String toString() {

		String stringTry = super.toString() + " and is a swimmer for team: " + team + "."
				+ " She participates in the following events: ";
		int i = 0;
		for (i = 0; i < events.size() - 1; i++) {
			stringTry += events.get(i) + ",";

		}
		return stringTry + events.get(i) + "]";

	}
}
