package level8;

public class Dalmatian {

	 public static String howManyDalmations(int numer) {
		  
		    String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"};
		    
		    String respond = numer <= 10 ? dogs[0] : numer <= 50 ? dogs[1] : numer == 101 ?  dogs[3] : dogs[2];
		    
		    return respond;
		    
		    }
		  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String respond = howManyDalmations(101);
		System.out.println(respond);
		
	}

}
