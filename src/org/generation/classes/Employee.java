package org.generation.classes;

public class Employee {
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//constructor

	public String getFirstName() {
		return firstName;
	}//getFirstName


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName


	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getRegistration() {
		return registration;
	}



	public void setRegistration(int registration) {
		this.registration = registration;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getDaysWorked() {
		return daysWorked;
	}



	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}



	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}



	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getYearsWorked() {
		return yearsWorked;
	}



	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}



	public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (daysWorked / 360) * (30 - vacationDaysTaken);
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()="
				+ getAge() + ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()="
				+ getVacationDaysTaken() + ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked()
				+ ", timeToRetirement()=" + timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft()
				+ ", calculateBonus()=" + calculateBonus() + "]";
	}
	
	
}//class Employee