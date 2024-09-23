package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
			Employee empleado = new Employee("Fernando", "Coronel", 0001, 30, 2, 720, 20, 10000);
			
			System.out.println("************Employee*******************");
			System.out.println(empleado);
			
			System.out.println("************Represent*******************");
			
			SalesRep represent = new SalesRep("Juan", "Perez", 0002, 28, 5, 1800, 30, 20000, 30);
			System.out.println(represent);
			System.out.println("************Represent comission*******************");			
			System.out.println(represent.calculateComission());
			System.out.println("************Represent Bonus*******************");			
			System.out.println(represent.calculateBonus());
			
	}//main
}//class Main
