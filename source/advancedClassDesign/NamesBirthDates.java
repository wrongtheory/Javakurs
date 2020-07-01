package advancedClassDesign;

import java.time.LocalDate;

public enum NamesBirthDates {
	VICTOR("10.01.1989") , ION("04.04.1990"), ANDREI("24.02.1963") , ELENA("20.08.1970");

	private String text = " is born on ";
	private String birthDate;
	
	private NamesBirthDates(String birthDate) {
		//this.text = text;
		this.birthDate = birthDate;
	}
	public void getBirthDate() {
		System.out.println(text + birthDate);
	}
	
	public static void hz() {
		System.out.println("hz ce tre sa fie aici");
	}
	
	public void winn() {
		System.out.println("You won ");
		
	} 

}

