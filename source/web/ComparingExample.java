package web;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ComparingExample {


	public final void
	  givenStreamNaturalOrdering_whenSortingEntitiesByNameReversed_thenCorrectlySorted() {
	    List<String> letters = Arrays.asList("B", "A", "C");
	 
	    List<String> reverseSortedLetters = letters.stream()
	      .sorted(Comparator.reverseOrder())
	      .collect(Collectors.toList());
	       
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
