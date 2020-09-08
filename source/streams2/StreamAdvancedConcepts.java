package streams2;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StreamAdvancedConcepts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			threeDigit(Optional.of(1234));
			threeDigit2(Optional.of(678));

			ExceptionCaseStudy.create().stream().count();
			
			Supplier<List<String>> s = () -> {
				try {
					return ExceptionCaseStudy.create();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			};
			
			Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
			
	}
	
	
	private static void threeDigit(Optional<Integer> optional) {
		if(optional.isPresent()) {
			Integer num = optional.get();
			String string = "" + num;
			if(string.length() == 3)
				System.out.println(string);
		}
	}
	
	
	private static void threeDigit2(Optional<Integer> optional) {
		optional.map(n -> "" + n)
		.filter(s -> s.length() == 3)
		.ifPresent(System.out::println);
	} 

}



class ExceptionCaseStudy {
	public static List<String> create() throws IOException {
		throw new IOException();
	}
	
	public static List<String> createSafe() {
		try {
			return ExceptionCaseStudy.create();
		}catch(IOException e) {
			throw new RuntimeException();
		}
	}
}