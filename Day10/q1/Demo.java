package assignD10.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws InvalidDateFormat {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Date of Birth");
		String dob=sc.nextLine();
		
		LocalDate date;
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			date=LocalDate.parse(dob, dtf);
			int years=(LocalDate.now().getYear()- date.getYear());
			if(years>=0)
				System.out.println("Your age is "+years);
			else
				System.out.println("Date should not be in Future");
		} catch (Exception e) {
			throw new InvalidDateFormat();
		}
		
		sc.close();
	}
}