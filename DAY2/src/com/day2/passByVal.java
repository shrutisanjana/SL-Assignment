package com.day2;

public class passByVal {
	public static void main(String[] args) {
		int sId=25;
		passByVal val = new passByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are "+sId);
		
		Student stud = new Student();
		System.out.println(stud.studentId);
		val.passTheValueMethodStudent(stud);		
		System.out.println("The sId are "+stud.studentId);
	}
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("The sId are "+sId);
	}
	
	public void passTheValueMethodStudent(Student sId) {
		sId.studentId=10;
		System.out.println("The sId are "+sId.studentId);
	}
}
