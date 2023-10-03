package com.assignment2.ResgistrationPackage;

public class Registration {
	public static void main (String args[]){ 
		DayScholar dayScholar=new DayScholar(); 
		dayScholar.setStudentId(101); 
		dayScholar.setStudentType('A'); 
		dayScholar.setStudentName("Disha"); 
		dayScholar.getDetails(); 
	}
}
