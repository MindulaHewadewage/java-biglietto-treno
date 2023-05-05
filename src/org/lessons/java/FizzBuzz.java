package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
public static void main(String[] args) {
	int n=100;
	for(int i=0;i<=n;i++) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quanti Numeri vuoi?");
		String GuestName=in.nextLine(); 
		
		if (i%3==0 && i%5==0){
			System.out.println("FizzBuzz");
		}else if (i%3==0){
			System.out.println("Fizz");

		}else if (i%5==0){
			System.out.println("Buzz");
		}else {
			System.out.println(i);
		}
		

	}


}
}
