package tag1;

import java.math.BigInteger;

public class fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fakultet(6));

	}

	
	public static BigInteger fakultet(int n) throws IllegalArgumentException
	{
		 if (n < 0)
			throw new IllegalArgumentException("number must be greater or equal zero");
		else {
			
			return n * fakultet(n-1).intValueExact();
			
		}
		 

    }

}
