package web.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> persons = Arrays.asList(
				new Person("mykong", 30),
				new Person("jack", 20),
				new Person("lawrence", 40)
				);
		
		Person result = getStudentByName(persons, "jack");
		System.out.println(result.getName());
		System.out.println(result.getAge());
		
		
		//with streams
		
		Person pers1 = persons
				.stream()
				.filter(x -> "jack".equals(x.getName()) && x.getAge() == 20)
				.findAny()
				.orElse(null);
		
		System.out.println(pers1);
		
		Person pers2 = persons
				.stream()
				.filter(x -> "jack".equals(x.getName()) && x.getAge() == 20)
				.findAny()
				.orElse(null);
		
		System.out.println(pers2);
		
		String name = persons
				.stream()
				.filter(x -> "jack".equals(x.getName()))
				.map(Person::getName)
				.findAny()
				.orElse("");
		
		System.out.println("name : " + name);
		
		List<String> colect = persons
				.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		
		colect.forEach(System.out::println);

	}
	
	public static Person getStudentByName(List<Person> persons, String name) {
		Person result = null;
		for(Person temp : persons)
			if(name.equals(temp.getName()))
				result = temp;
		
		return result;
	}

}


class Person {
	private String name;
	private int age;
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
