package com.assignment5;

public class Main {
	public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(1, 'A',"Shruti", 101,"Java",10000, "Sathya Pg Spice Garden");

        System.out.println(dayScholar.calculateFees());
        System.out.println(dayScholar.getFees());
    }
}
