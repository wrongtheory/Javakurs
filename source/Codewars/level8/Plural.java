package Codewars.level8;

public class Plural {

	  public static boolean isPlural(float f){
		    if(f>=0 && f<1)
		    	return true;
		    else
		    	if(f==1)
		    		return false;
		    
		    return true;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPlural(0f));
		
	}

}
