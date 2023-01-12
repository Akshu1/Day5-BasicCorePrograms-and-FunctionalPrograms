package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Please enter year(YYYY): ");
        int a= sc.nextInt();

        if(a<1000) {
            System.out.println("Please enter a valid year(YYYY): ");
            a= sc.nextInt();
            sc.close();
        }
        if(a % 400 == 0) {
            System.out.println("Year " + a + " is a leap year");
        }
        else if(a % 4 == 0) {
            System.out.println("Year " + a + " is a leap year");
        }
        else if(a % 100 == 0) {
            System.out.println("Year " + a + " is not a leap year");
        }
        else {
            System.out.println("Year " + a + " is not a leap year");
    }

	}

}
