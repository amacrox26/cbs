package cbs;

public class Show {
	
	private String movie;
	private String date;
	private String time;
	private int price;
	
	
	 
	
	public Show (String theMovie, String theDate, String theTime, int thePrice){
		
		movie = theMovie;
		date = theDate;
		time = theTime;
		price = thePrice;
		
	}
	
	//default constructor
	
	public Show() {
		
		movie = "";
		date = "";
		time = "";
		price = 0;
		
	}
	
	//copy constructor
	

	public Show (Show theShow) {
		
		this.movie = theShow.movie;
		this.date = theShow.date;
		this.price = theShow.price;
		
		
	}
	
	public String getMovie (){
		
		return movie;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
