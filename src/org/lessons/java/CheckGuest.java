package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
public static void main(String[] args) {
	String[] guests= {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasy","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("Come ti chiami?");
	String GuestName=in.nextLine(); 
	
	in.close();
	
	for(int i=0;i<guests.length;i++) {
		String guest=guests[i];
		if(GuestName.equals(guest)) {
			System.out.print("Benvenuto!");
			return;
		}
	}

	System.out.print("Non sei invitato!");
}
}
