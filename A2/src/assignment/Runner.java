package assignment;

import java.util.ArrayList;

public class Runner extends Athlete {
	private String country;
	private ArrayList<String> events;
	// constructor
	public Runner(String lName, String fName, int birthYear, int birthMonth, int birthDay, char gender,
			String country) {
		super(lName, fName, birthYear, birthMonth, birthDay, gender);
		this.country = country;
		events = new ArrayList<String>();
	}

	public boolean addEvent(String singleEvent) {
		ArrayList<String> correct = new ArrayList<String>();
		correct.add("M100");
		correct.add("M200");
		correct.add("M400");
		correct.add("M3000");
		correct.add("M5000");
		correct.add("M10000");
		if (correct.contains(singleEvent) && !events.contains(singleEvent)) {
			events.add(singleEvent);
			return true;
		}
		return false;
	}

	public boolean addEvent(ArrayList<String> multipleEvents) {
		boolean yes = true;
		for (String addedEvents : multipleEvents)
			yes = yes & addEvent(addedEvents);
		return yes;
	}
	// array of events
	public ArrayList<String> getEvents() {
		return events;
	}

	public String toString() {
		String printAll = super.toString() + ".";

		if (getGender() == "male" || getGender() == "Male")
			printAll += "He is a citizen of " + country + " and is a ";
		else
			printAll += "She is a citizen of " + country + " and is a ";

		if (!(events.contains("M3000") || events.contains("M5000") || events.contains("M10000")))
			printAll += "sprinter";
		else if (!(events.contains("M100") || events.contains("M200") || events.contains("M400")))
			printAll += "long-distance runner";
		else
			printAll += "super athlete";

		printAll += " who participates in these events: " + events;

		return printAll;
	}

}




