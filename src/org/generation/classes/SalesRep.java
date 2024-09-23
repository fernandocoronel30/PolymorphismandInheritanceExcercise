package org.generation.classes;

public class SalesRep extends Employee{
	double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade
	
    public double calculateComission() {
    	// comission = 0.1 * salesMade
        return 0.1 * salesMade;
    }//calculateCommision
}//class SalesRep
