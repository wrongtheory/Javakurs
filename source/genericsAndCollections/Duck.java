package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {
	
	private String name;
	private int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name;
	}
	
	public String getName() {return name;}
	
	public int getWeight() {return weight;}
	

	public int compareTo(Duck d) {
		return name.compareTo(d.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Comparator<Duck> byWeight = new Comparator<Duck>() { public int compare(Duck
		 * d1, Duck d2) { return d1.getWeight() - d2.getWeight(); } };
		 */
		
		Comparator<Duck> byWeight = (d1,d2) -> d1.getWeight() - d2.getWeight();
		

		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack",1));
		ducks.add(new Duck("Puddles",2));
		Collections.sort(ducks);
		System.out.println(ducks);
		Collections.sort(ducks,byWeight);
		System.out.println(ducks);
		

		
	}

}
