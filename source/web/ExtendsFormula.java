package web;

public class ExtendsFormula implements Formula{

	public double calculate(int a) {
		return sqrt(a * 100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Formula formula = new ExtendsFormula();
			System.out.println(formula.calculate(100));
			System.out.println(formula.sqrt(16));
			
			
			Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
			Integer converted = converter.convert("123");
			System.out.println(converted);
			
			Converter<String, Integer> converter2 = Integer::valueOf;
			Integer converted2 = converter2.convert("456");
			System.out.println(converted2);
			
			
			
			Something something = new Something();
			Converter<String, String> converter3 = something::starttsWith;
			String converted3 = converter3.convert("Java");
			System.out.println(converted3);
			
			
			PersonFactory<Person2> personFactory = Person2::new;
			Person2 person2 = personFactory.create("Peter", "Parker");
			
			
			int num = 1;
			Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
			String x = stringConverter.convert(2);
			System.out.println(x);
			
			
	}

}


class Person2 {
	String firstname;
	String lastname;
	
	public Person2() {
		
	}
	
	Person2(String first, String last){
		this.firstname = first;
		this.lastname = last;
	}
}


interface PersonFactory<P extends Person2>{
	P create(String f, String l);
}

class Something {
	String starttsWith(String s) {
		return String.valueOf(s.charAt(0));
	}
}
