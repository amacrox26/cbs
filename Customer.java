package cbs;

public class Customer {
	
	private int kundenID;
	private String name;
	private String vorname;
	private int telefonnummer;
	private Show show;
	
	
	
	public Customer (int theKundenID, String theName, String theVorname, int theTelefonnummer, Show theShow) {
		
		kundenID = theKundenID;
		name = theName;
		vorname = theVorname;
		telefonnummer = theTelefonnummer;
		show = theShow;
		
	}
	
	
	//default constructor
	
	public Customer (){
		
		kundenID = 0;
		name = "";
		vorname = "";
		telefonnummer = 0;
		show = null;
		
	}
	
	
	//copy Constructor
	
	public Customer (Customer theCustomer){
		
		this.kundenID = theCustomer.kundenID;
		this.name = theCustomer.name;
		this.vorname = theCustomer.vorname;
		this.telefonnummer = theCustomer.telefonnummer;
		this.show = theCustomer.show;		
		
	}
	

}
