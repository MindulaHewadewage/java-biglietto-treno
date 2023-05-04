package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Quanti Km vuoi fare?");
	int kms=in.nextInt();
	
	System.out.print("Quanti anni hai?");
	int age=in.nextInt();

	if (age < 18) {
		int scontoMinori = age*20/100;
	}
	if(age>65) {
		int scontoOver =age*40/100;
	}
	
	Double ticketPrice= (age*0.21);
	System.out.println("Il tuo biglietto costa €" + ticketPrice);

	
	
}
}
