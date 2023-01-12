package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is a  vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
                    System.out.println("it is a consonant");
                } else {
                    System.out.println("please enter alphabet");
                }
                sc.close();
        }
	}

}