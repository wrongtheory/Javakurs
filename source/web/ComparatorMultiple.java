package web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Person{
	String name;
	String familie;
	int id;
	
	public Person(String n, String f, int id) {
		this.name = n;
		this.familie = f;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilie() {
		return familie;
	}

	public void setFamilie(String familie) {
		this.familie = familie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " " + familie + " " + id;
	}
	
	
	
	
}

public class ComparatorMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> person = getPersonDetails();
		
		for(Object p : person)
			System.out.println(p);
		
		Comparator<Person> comparebyAll = Comparator
				.comparing(Person::getName)
				.thenComparing(Person::getFamilie)
				.thenComparing(Person::getId);
		
		System.out.println();
		
		Collections.sort(person, comparebyAll);
		
		for(Object p : person)
			System.out.println(p);
		

	}

	
	
	private static ArrayList<Person> getPersonDetails(){
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Victor","Leunti",1));
		list.add(new Person("Ion", "Leunti", 2));
		list.add(new Person("Tilo", "Hz", 30));
		list.add(new Person("Tilo", "Hz", 3));
		list.add(new Person("Victor", "Burghila", 4));
		list.add(new Person("Frank", "Newumann", 5));
		return list;
	}
	
}
