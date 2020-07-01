package web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee2 {
	
	private String name;
	private int age;
	
	public Employee2(String name, int age) {
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
		return "Employee2 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		List<Employee2> employeelist = Arrays.asList(
				new Employee2("Victor Leunti", 31),
				new Employee2("John Dereck", 20),
				new Employee2("Vasea Mure", 22),
				new Employee2("Johby Deep", 12),
				new Employee2("Demi Moore", 44)
				); 
		
		Function<Employee2,String> funcEmpToString = (Employee2 e) -> {return e.getName();};
		List<String> empNameList = convertFromListToString(employeelist, funcEmpToString);
		empNameList.forEach(System.out::println);
		
		Function<String,String> initialFunction = (String s) -> s.substring(0,1);
		List<String> empNameList2 = convertFromListToNamesList(employeelist, funcEmpToString.andThen(initialFunction));
		empNameList2.forEach(str -> {System.out.print(" "+str);});
		
		Function<Employee2, Employee2> funcEmpFirstName = 
				(Employee2 e) -> {
					int index = e.getName().indexOf(" ");
					String firstName = e.getName().substring(0, index);
					e.setName(firstName);
					return e;
				};
		List<String> empFirstNameList = convertFromListToNamesList(employeelist, funcEmpToString.compose(funcEmpFirstName));
		empFirstNameList.forEach(str->{System.out.println(" "+str);});
		
		List<Employee2> empNameListInitials = applyIdentityToEmpList(employeelist, Function.identity());
		empNameListInitials.forEach(System.out::println);
		
		Predicate<Employee2> p = x -> x.getAge() > 30;
		int i = 0;
		for(Employee2 e : employeelist ) {
			//System.out.println(e.getName() + " has more than 30 years -> " + p.test(employeelist.get(i)));
			i++;
		}
	}
	
	
	public static List<String> convertFromListToString(List<Employee2> employee2, Function<Employee2, String> function){
		List<String> strings = new ArrayList<String>();
		
		for(Employee2 e : employee2)
			strings.add(function.apply(e));
		return strings;
	}
	
	public static List<String> convertFromListToNamesList(List<Employee2> employee2, Function<Employee2, String> function){
		List<String> strings = new ArrayList<String>();
		
		for(Employee2 e : employee2)
			strings.add(function.apply(e));
		return strings;
	}
	
	public static List<Employee2> applyIdentityToEmpList(List<Employee2> employee2, Function<Employee2, Employee2> function){
		List<Employee2> strings = new ArrayList<>();
		
		for(Employee2 e : employee2)
			strings.add(function.apply(e));
		return strings;
	}

}
