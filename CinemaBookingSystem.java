package cbs;

import java.util.Scanner;

public class CinemaBookingSystem {

	public static void main(String[] args) {
		
		boolean menuActive = true;
		boolean [][] p1 = new boolean [10][10];
		boolean [][] p2 = new boolean [10][10];
		boolean [][] p3 = new boolean [10][10];
		Show s1 = new Show("Forrest Gump", "03.06.2015","20:15", 5);
		Show s2 = new Show("Herr de Ringe", "03.05.2015","20:15", 5);
		Show s3 = new Show("Findet Nemo", "03.04.2015","20:15", 5);
		//Customer c1 = new Customer(1, "Ulf", "Müller", 2121312312, s1);
		//Customer c2 = new Customer(2, "Ulf", "Müller", 2121312312, s2);
		//Customer c3 = new Customer(3, "Ulf", "Müller", 2121312312, s3);
		Theater t1 = new Theater(p2, s3);
		Theater t2 = new Theater(p1, s1);
		Theater t3 = new Theater(p3, s2);

		
		Scanner myScanner = new Scanner(System.in);
		int x = myScanner.nextInt();
		do {
			switch(x) {
			case 1:
				
				break;
			
			}
			
		}while(menuActive)
		
		
		
		
		
	}
	
	
	
	
	
}
