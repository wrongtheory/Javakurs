package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface I{
	int sum(int a, int b);
}

public class DuckHelper implements I{

	public int sum(int a, int b) {
		return a+b;
	}
	
	public static int minValue(int[] values){

		Set<Integer> set = new TreeSet<Integer>();
		
		for(Integer number: values) {
			set.add(number);
		}
		System.out.print(set + " -> ");

		return Integer.valueOf(set.toString().replaceAll("[^0-9]", ""));
	}
	
	
	public static int[] flattenAndSort(int[][] array) {		
		
		
		List<Integer> s = new ArrayList<Integer>();
		
		for(int[] i : array) {
			for(int j : i) {
				s.add(j);
				//System.out.println(j);
			}
		}
		
		Collections.sort(s);
		System.out.println(s);
		int[] myArray = new int[s.size()];
		
		int k=0;
		
		for(int i: s)
			myArray[k++] = i;
		
		for(int i:myArray)
			System.out.println(i);
		return myArray;

	}
	
	
	 public static double find_average(int[] array){
	
		 double sum=0;
		 
		 for(int i : array)
			sum+=i;
		 
		 System.out.println((double)5/2);
		 
		 return sum/array.length;
	  }
	
	public static void main(String[] args) {
		
		
		System.out.println(find_average(new int[] {3,2}));
		
		//Function<Integer, Integer> s = I::sum;
		//int a = s.apply(1);
		//System.out.println(a);
		
		//int i[][] = {{3,2,1},{4,6,5},{9,7,8}};

		int j[][] = {{1,3,5},{100},{2,4,6}};
		
		System.out.println(flattenAndSort(j));
		
		for (int[] js : j) {
			//System.out.println(minValue(js));
			
		}
		
		//System.out.print(minValue(i2));
	}
	
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	
	Comparator<Duck> byWeight = (d1,d2) -> DuckHelper.compareByWeight(d1, d2);
	
	Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
	
	Comparator<Duck> byName = DuckHelper::compareByName;
	
	Consumer<List<Integer>> methodRef1 = Collections::sort;
	Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
	
	String str = "abc";
	Predicate<String> methodRef2 = str::startsWith;
	Predicate<String> lambda2 = s -> str.startsWith(s);
	
	Predicate<String> methodRef3 = String::isEmpty;
	Predicate<String> lambda3 = s -> s.isEmpty();
	
	Supplier<ArrayList> methodRef4 = ArrayList::new;
	Supplier<ArrayList> lambda4 = () -> new ArrayList();
	
}
