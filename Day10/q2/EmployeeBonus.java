package assignD10.q2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import assignD10.q1.InvalidDateFormat;

public class EmployeeBonus {
	public double method(String dateString) throws InvalidAgeException,InvalidDateFormat{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int years=0;
		try {
			LocalDate date=LocalDate.parse(dateString,dtf);
			years=LocalDate.now().getYear()-date.getYear();
		} catch (Exception e) {
			System.out.println("Please Enter age in correct formate");
			throw e;
		}
		
	
		
		
		if(years<0) {
			throw new InvalidAgeException();
		}
		
		
		if(years<1) {
			return 5000;
		}else if(years<2) {
			return 8000;
		}else {
			return 10000;
		}
		
	}
			
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your date of birth");
		String dob;
		EmployeeBonus epb=new EmployeeBonus();
		dob=sc.nextLine();
		try {
			System.out.println("Your bonus is "+ epb.method(dob));
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Enter valid date");
		}
		
		System.out.println("Exited  normaly");
		sc.close();
	}
			
			
}