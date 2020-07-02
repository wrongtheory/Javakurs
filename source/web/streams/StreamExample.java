package web.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamExample {
	
	private static List<String> lists = new ArrayList<>();

	public static void main(String[] args) {
		
		lists.add("ddd2");
		lists.add("aaa2");
		lists.add("bbb1");
		lists.add("aaa1");
		lists.add("bbb3");
		lists.add("ccc");
		lists.add("bbb2");
		lists.add("ddd1");
		
		
		lists.stream()
			.filter((s) -> s.startsWith("a"))
			.forEach(System.out::println);
		
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);
		
		
		List<Customer> customers = Arrays.asList(john,sarah,charles,mary);
		customers.forEach(c -> System.out.println(c));
		
		List<Customer> customersWithMoreThan100Points = customers
				.stream()
				.filter(c -> c.getPoints() > 100)
				.collect(Collectors.toList());
		
		customersWithMoreThan100Points.forEach(System.out::println);
		
		List<Customer> customersWithLessThan100Points = customers
				.stream()
				.filter(Customer::hasOverHundredPoints)
				.collect(Collectors.toList());
		
		customersWithLessThan100Points.forEach(System.out::println);

		
		List<Customer> charlesWithMoreThan100Points = customers
				.stream()
				.filter(c -> c.getPoints() > 100 && c.getName().startsWith("Charles"))
				.collect(Collectors.toList());
		
		charlesWithMoreThan100Points.forEach(System.out::println);
		
		
	}

}


class Customer {
	
	private String name;
	private int points;
	private String profilePhotoUrl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Customer(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	
	
	@Override
	public String toString() {
		return name + " " + points;
	}
	public boolean hasOverHundredPoints() {
		return this.points < 100;
	}
}