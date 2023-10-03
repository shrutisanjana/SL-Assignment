package com.assignment8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Student s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Residential Status(HostelLite or DayScholar): ");
		String residentialStatus = sc.nextLine();
		
		
		if(residentialStatus.equalsIgnoreCase("hostellite")) {
			s = new HostelLite(1, 'm', "Atul", 3000);
			s.displayStudentDetails();
		} else if(residentialStatus.equalsIgnoreCase("dayscholar")) {
			s = new DayScholar(1, 'm', "Ayush", 2000);
			s.displayStudentDetails();
		} else {
			System.out.println("Invalid Input");
		}
		System.out.println(s.calculateFess(100.0));
		
	}
}