package level8;

public class AreaOfASquare {

	public static void main(String[] args) {
		
		squareArea(2);
		
	}

	

		  public static void squareArea(double A){
		   
						  
			 double r = 8/(2*Math.PI);
			  
			  System.out.println(r);
			  
			  double square =  (r*r);
			  
			  square = Math.round(square*100);
			  square = square / 100;
			  System.out.println(square); 
			  
			  System.out.printf("Value: %.2f", square);
			  
		    
		    
		  
		  }
		
}
