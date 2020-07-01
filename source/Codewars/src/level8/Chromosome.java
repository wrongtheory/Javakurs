package level8;

public class Chromosome {
	
	  public static String chromosomeCheck(String sperm) {
		  
		  if(sperm.charAt(0) == 'Y' || sperm.charAt(1) == 'Y')
				  return "Congratulations! You're going to have a son.";
			  else
				  return "Congratulations! You're going to have a daughter.";

			  
		  
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = chromosomeCheck("YX");
		System.out.println(result);
		
	}

}
