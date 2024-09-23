package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	HashMap<Integer, SalesRep> salesTeam = new HashMap<>(); 

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	}//constructor
	
	 public double calculateComission() {
		// 0.03 * all sales made by team
		 
		 return 0;	        
	    }//calculateComission
	
	
}//SalesManager
