package tag1;

public class UncheckedDemo3 {

	public static void main(String[] args) {
	
		int sum=0;
		
		for(int i=0;i<args.length;i++) {
			try {
				int j = Integer.parseInt(args[i]);
				sum += j;
			} catch(NumberFormatException e) {
				System.out.println(args[i] + " couldn't be converted to int");			
			}
		}		
		System.out.println("The sum is " + sum);
		
	}
}
