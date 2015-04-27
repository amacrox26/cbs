package cbs;

public class CinemaBookingSystem {

	public static void main(String[] args) {
		
		boolean [][] p1 = new boolean [10][10];
		boolean [][] p2 = new boolean [10][10];
		boolean [][] p3 = new boolean [10][10];
		Show s1 = new Show("forrest", "03.03.2015","20:15", 5);
		Show s2 = new Show("fast", "03.03.2015","20:15", 5);
		Show s3 = new Show("ffafa", "03.03.2015","20:15", 5);
		Customer c1 = new Customer(1, "Ulf", "Müller", 2121312312, s1);
		Customer c2 = new Customer(1, "Ulf", "Müller", 2121312312, s2);
		Customer c3 = new Customer(1, "Ulf", "Müller", 2121312312, s3);
		Theater t1 = new Theater(p2, s3);
		Theater t2 = new Theater(p1, s1);
		Theater t3 = new Theater(p3, s2);

		
	
		
		
		
	}
	
	
	
	
	
}
