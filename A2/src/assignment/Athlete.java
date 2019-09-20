package assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Athlete {

	// class variables
	private String lName;
	private String fName;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private char gender;

	// constructor one
	public Athlete(String lName, String fName, int birthYear, int birthMonth, int birthDay, char gender) {
		this.lName = lName;
		this.fName = fName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.gender = gender;
	}

	// method to return the first name
	public String getFname() {
		return fName;
	}

	// method to return the last name
	public String getLname() {
		return lName;
	}

	// method to return the gender
	public String getGender() {
		if (gender == 'm' || gender == 'M')
			return "male";
		else if (gender == 'f' || gender == 'F')
			return "female";
		else
			return "undeclared";
	}

	// method to set the first name
	public void setFname(String fName) {
		this.fName = fName;
	}

	// method to set the last name
	public void setLname(String lName) {
		this.lName = lName;
	}

	// method to set the gender
	public void setGender(char gender) {
		this.gender = gender;
	}

	// find current age
	public String computeAge() {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		Period period = Period.between(birthDate, currentDate);

		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		if (years > 0) {
			if (months > 0) {
				if (days > 0)
					return years + " years, " + months + " months and " + days + " days";
				else
					return years + " years and " + months + " months ";
			} else {
				if (days > 0)
					return years + " years and " + days + " days";
				else
					return years + " years";
			}
		} else {
			if (months > 0) {
				if (days > 0)
					return months + " months and " + days + " days";
				else
					return months + " months ";
			} else {
				if (days > 0)
					return days + " days";
				else
					return "0 days";
			}
		}
	}

	// method to return the number of days since birth
	public long daysSinceBirth() {
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

		long noOfDays = (ChronoUnit.DAYS.between(birthDate, currentDate));

		return noOfDays;
	}

	// toString() method
	public String toString() {
		return getFname() + " " + getLname() + " is " + computeAge();
	}

	// checks if two athletes are equal or not
	public boolean equals(Athlete notEqual) {
		return ((lName.equals(notEqual.lName)) && (fName.equals(notEqual.fName)) && (birthDay == notEqual.birthDay)
				&& (birthYear == notEqual.birthYear) && (birthMonth == notEqual.birthMonth));
	}
}
