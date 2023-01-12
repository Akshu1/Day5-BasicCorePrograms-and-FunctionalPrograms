package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int a;
        int count;
        int headCount=0;
        int tailCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin");
        a = sc.nextInt();
        sc.close();

        for(count=0;count<a;++count) {
            double n =Math.floor(Math.random()*10)%2;

            if(n<0.5){
                System.out.println("It's a Head.");
                headCount++;
            }
            else{
                System.out.println("It's a Tail");
                tailCount++;
            }
        }
        System.out.println("Head Count :" +headCount );
        System.out.println("Tail Count :" +tailCount );
        System.out.println("headCount Percentage : " +(headCount*100)/a );
        System.out.println("tailCountPercentage : " +(tailCount*100)/a );
    }

}
