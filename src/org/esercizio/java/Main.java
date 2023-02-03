package org.esercizio.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String utente = "";

		System.out.println("Vuoi inserire un nuovo evento? 1 per Si 2 per no");
		utente = s.nextLine();
		
		
		if(utente.equals("no")) {
			System.out.println("Ciao bello!");
		}

	}

}
