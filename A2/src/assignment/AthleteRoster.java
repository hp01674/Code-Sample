package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class AthleteRoster {
	// variables
	private String semster;
	private int year;
	private ArrayList<Athlete> athletes;

	public AthleteRoster(String semster, int year) {
		this.semster = semster;
		this.year = year;
		athletes = new ArrayList<Athlete>();
	}
	// method to return semester
	public String getSemster() {
		return semster;
	}
	// method to return year
	public int getYear() {
		return year;
	}

	public boolean addAthlete(Athlete added) {
		if (!athletes.contains(added)) {
			athletes.add(added);
			return true;
		}
		return false;
	}
	// sorts runners by events
	public String allRunnersOrderedByNumberOfEvents() {
		ArrayList<Runner> runners = new ArrayList<Runner>();
		for (Athlete added : athletes) {
			if (added instanceof Runner)
				runners.add((Runner) added);
		}

		for (int i = 0; i < runners.size(); i++) {
			int mininum = i;
			for (int j = i + 1; j < runners.size(); j++) {
				if (runners.get(j).getEvents().size() < runners.get(i).getEvents().size()) {
					mininum = j;
				}
			}

			if (i != mininum) {
				// swap
				Runner temp = runners.get(i);
				runners.set(i, runners.get(mininum));
				runners.set(mininum, temp);
			}
		}
		System.out.println("List of Runners Ordered by Number of Events They Participate In");
		System.out.println("===============================================================");
		String need = "";
		for (Runner added : runners)
			need += added.getFname() + " " + added.getLname() + " " + added.getEvents().size() + "\n";
		return need;
	}
	// sorts runners by age
	public String allAthletesOrderedByAge() {
		for (int i = 0; i < athletes.size(); i++) {
			long age = athletes.get(i).daysSinceBirth();

			for (int j = i + 1; j < athletes.size(); j++) {
				if (athletes.get(j).daysSinceBirth() > athletes.get(i).daysSinceBirth()) {
					Athlete temp = athletes.get(i);
					athletes.set(i, athletes.get(j));
					athletes.set(j, temp);
				}
			}
		}
		System.out.println("List of Athletes Ordered by their Age");
		System.out.println("=====================================");
		String need = "";
		for (Athlete added : athletes)

			need += added.getLname() + ", " + added.getFname() + " " + added.computeAge() + "\n";
		return need;
	}
	// sorts runners by last name
	public String allAthletesOrderedByLastName() {
		for (int i = 0; i < athletes.size(); i++) {
			int min = i;
			String s1 = athletes.get(i).getLname() + " " + athletes.get(i).getFname();

			for (int j = i + 1; j < athletes.size(); j++) {
				String s2 = athletes.get(i).getLname() + " " + athletes.get(i).getFname();
				if (s2.compareTo(s1) < 0) {
					min = j;
				}
			}

			if (i != min) {
				// swap
				Athlete temp = athletes.get(i);
				athletes.set(i, athletes.get(min));
				athletes.set(min, temp);
			}
		}
		System.out.println("List of Athletes Ordered by their Last Name");
		System.out.println("===========================================");
		String need = " ";
		for (Athlete added : athletes)
			need += added.getLname() + ", " + added.getFname() + "\n";
		return need;
	}

}
