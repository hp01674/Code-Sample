package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class AthleteDriver {
	public static void main(String args[]) {

		//Check Athlete Class
		Athlete a1 = new Athlete("Daffy","Duck", 2000, 9, 7,'j'); System.out.println("Gender is "+a1.getGender());//undeclared
		a1.setGender('F'); 
		System.out.println("Gender is "+a1.getGender());//female
		a1.setGender('m'); 
		System.out.println("Gender is "+a1.getGender());//male
		System.out.println("ComputeAge method says "+a1.computeAge());
		System.out.println("First name is : "+a1.getFname()); //Daffy
		System.out.println("DaysSinceBirth method says "+a1.daysSinceBirth()+" days"); System.out.println("Last name is : "+a1.getLname()); //Duck
		System.out.println("Output of our toString correct?: \n"+a1);
		System.out.println("=======================================\n");

		//Check Runner Class
		 Runner r5 = new Runner("Bugs","Bunny", 2000, 9, 8, 'm',"USA");
		 System.out.println("Did we add M10000 successfully?: "+r5.addEvent("M10000")); //true
		 System.out.println("Did we unsucessfully try to add M10000 again?: "+r5.addEvent("m10000")); //false 
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList("M100", "M3000"));
	    System.out.println("Did we successfully add mutiple events?: "+r5.addEvent(temp));//true
		System.out.println("Did we unsucessfully try to add mutiple events?: "+r5.addEvent(temp));//false
		System.out.println("How many events does Bugs participate in?: "+r5.getEvents().size());//3 
		System.out.println("Gender is "+r5.getGender());//male
		System.out.println("Output of our toString correct?: \n"+r5);
		System.out.println("=======================================\n");

 		//Check Swimmer Class
		Swimmer s1 = new Swimmer("Franklin", "Missy", 1995, 5, 10, 'F', "Colorado Stars");
		System.out.println("Did we add 100m backstoke successfully?: "+s1.addEvent("100m backstoke")); //true
		System.out.println("Did we unsucessfully try to add 100m backstoke again?: " +s1.addEvent("100M Backstoke")); //false 
		temp = new ArrayList<String>(Arrays.asList( "200m backstoke","200m freestyle"));
		System.out.println("Did we successfully add mutiple events?: "+s1.addEvent(temp));//true
		System.out.println("Did we unsucessfully try to add mutiple events?: "+s1.addEvent(temp));//false
		System.out.println("How many events does s1 participate in?: "+s1.getEvents().size());//4 
		System.out.println("Gender is "+s1.getGender());//female
		System.out.println("Output of our toString correct?: \n"+s1);
		System.out.println("=======================================\n");

		//Check AthleteRoster
		Swimmer s2 = new Swimmer("Ruele", "Naomi", 1997, 1, 13, 'F',"Florida International University"); 
		s2.addEvent(new ArrayList<String>(Arrays.asList("100m backstoke","50m backstoke","100m freestyle")));

		Runner r1 = new Runner("Bolt", "Usain", 1986, 8, 21, 'M',"Jamaica");
		r1.addEvent("M100"); r1.addEvent("M200");

		Runner r2 = new Runner("Griffith", "Florence", 1959, 12, 21, 'F',"United States of America"); r2.addEvent("M100"); r2.addEvent("M200");
		r2.addEvent("M400"); r2.addEvent("M10000"); r2.addEvent("M3000");
		r2.addEvent("M5000");

		AthleteRoster ar = new AthleteRoster("Fall",2019); 
		ar.addAthlete(a1);
		ar.addAthlete(s1); 
		ar.addAthlete(r1); 
		ar.addAthlete(r2); 
		ar.addAthlete(s2);
		ar.addAthlete(r5);
		System.out.println(ar.allRunnersOrderedByNumberOfEvents());
		System.out.println("=======================================\n");

		System.out.println(ar.allAthletesOrderedByAge());
		System.out.println("=======================================\n");

		System.out.println(ar.allAthletesOrderedByLastName());
		System.out.println("=======================================\n");


	}

}
