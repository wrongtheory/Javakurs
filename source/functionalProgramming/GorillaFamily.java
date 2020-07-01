package functionalProgramming;


import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

interface Gorilla{
	String move();
}

public class GorillaFamily {

	
	String walk = "walk";
	
	
	void everyonePlay(boolean baby) {
		String approach = "amble";
		
		//approach = "run";
		
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<List<String>, String> ex1 = x -> x.get(0);
		
		UnaryOperator<Long> ex2 = l -> l.longValue();
		
		Predicate<String> ex4 = String::isEmpty;

	}

}
