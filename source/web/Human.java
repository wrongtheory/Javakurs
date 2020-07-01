package web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

import advancedClassDesign.Gift;

public class Human {
	
	private String name;
	private int age;
	
	
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return name + " " + age ;
	}



	public static void main(String[] args) {
		
		new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));
		
		humans.stream().forEach(System.out::println);
		
		Collections.sort(humans, ((h1,h2) -> h2.getName().compareTo(h1.getName())));
		humans.forEach((human) -> System.out.println(human));
		
		Collections.sort(humans, Comparator.comparing(Human::getName).thenComparing(Human::getAge));
		
		humans.sort(Comparator.comparing(Human::getName));
		
		//List<Human> srt = humans.stream().sorted().collect(Collectors.toList());
		
		//System.out.println(srt);
	}
	
	public void givenPreLambda() {
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));
		
		Collections.sort(humans, new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		humans.sort( (Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
		humans.sort((h1,h2) -> h1.getName().compareTo(h2.getName()));
	}
	
	
	public static int compareByNameThenAge(Human lhs, Human rhs) {
		if(lhs.name.equals(rhs.name)) {
			return lhs.age - rhs.age;
		} else {
			return lhs.name.compareTo(rhs.name);
		}
	}
	
	public void givenMethodDefinition() {
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));
		
		humans.sort(Human::compareByNameThenAge);
	}
	
	public void givenInstanceMethod() {
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));
		
		Collections.sort(humans, Comparator.comparing(Human::getName));
	}

}
