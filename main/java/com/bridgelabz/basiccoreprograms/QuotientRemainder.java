package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		int numerator, denominator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator:");
        numerator=sc.nextInt();
        System.out.println("Enter denominator:");
        denominator=sc.nextInt();
        System.out.println("Quotient: "+numerator/denominator);
        System.out.println("Remainder: "+numerator%denominator);
        sc.close();
	}

}