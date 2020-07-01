package web;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUserExample {
	
	String name, role;
	
	public PredicateUserExample(String a, String b) {
		// TODO Auto-generated method stub
			name = a;
			role = b;
	}
	
	String getRole() {return role;}
	String getName() {return name;}
	
	public String toString() {
		return "User Name : " + name + ", Role : " + role;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<PredicateUserExample> users = new ArrayList<>();
		users.add(new PredicateUserExample("John", "admin"));
		users.add(new PredicateUserExample("Peter", "member"));
		
		//List admins = process(users, (PredicateUserExample u) -> u.getRole().equals("admin"));
		//System.out.println(admins);
		
		List admins = users.stream()
				.filter((user) -> user.getRole().equals("admin"))
				.collect(Collectors.toList());
		
		System.out.println(admins);
						

	}
	
	/*
	 * public static List<PredicateUserExample> process(List<PredicateUserExample>
	 * users, Predicate<PredicateUserExample> predicate){ List<PredicateUserExample>
	 * result = new ArrayList<PredicateUserExample>();
	 * 
	 * for(PredicateUserExample user : users) if(predicate.test(user))
	 * result.add(user); return result; }
	 */

}
