package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
        sc.close();

        if (input % 2 == 0)
            System.out.println(input + " is an even number");
        else
            System.out.println(input + " is an odd number ");
	}
	
}