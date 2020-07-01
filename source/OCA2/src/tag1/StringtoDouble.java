package tag1;

public class StringtoDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] brueche = {"1/2", "blabla", "4/5", "6/0", "7", "abc/3", "7/11","0"};
		
		for(String s:brueche)
		
		try {
			double d = parseBruch(s);
			//System.out.println(d);
			System.out.println(s + " -> " + d);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException for string " + s);
		}catch(NumberFormatException n) {
			System.out.println("NumberFormatException for " + s);
		}catch(RuntimeException r) {
			r.getMessage();
		}
		
	}
	
	public static double parseBruch(String value) throws ArithmeticException, NumberFormatException {
		
		int index = value.indexOf('/');
		//System.out.println(index);
		double b = Double.parseDouble(value.substring(index+1, value.length()));
		//System.out.println(b);
		if(b==0)
			throw new ArithmeticException();
		return index < 0 ? 
				Double.parseDouble(value) : 
				 Double.parseDouble(value.substring(0, index)) / Double.parseDouble(value.substring(index+1, value.length())) ;
	}

}
