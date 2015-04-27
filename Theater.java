package cbs;

public class Theater {
	
		private boolean [][] seats;
        private Show show;
       

        
        public Theater (boolean [][] theSeats, Show theMovie){
            
        	seats = theSeats;
            show = theMovie;
            
    
    
        }
	
	//default Constructor
	
	public Theater() {
		
		seats = new boolean[10][10];
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++){
				seats[i][j]=true;
			}
		}
		show = null;
		
	}

	//Copy Constructor
	
	public Theater (Theater theTheater){
		
		this.seats = theTheater.seats;
		this.show = theTheater.show;
	}

	public boolean[][] getSeats() {
		return seats;
	}

	public void setSeats(boolean[][] seats) {
		this.seats = seats;
	}

	public Show getMovie() {
		return show;
	}

	public void setMovie(Show movie) {
		this.show = movie;
	}
	
	public boolean reserveSeat (int theRows, int theCols){
		
		if (isAvailable(theRows, theCols)){
			seats[theRows][theCols] = false;
			return true;
		}
		else {
			return false;
		}
		}
		
	
	private boolean isAvailable (int theRows, int theCols){
	
			return seats[theRows][theCols];
	}

}
