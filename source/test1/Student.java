package test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

	private String id;
	private String name;
	private String email;
	private int age;

	public Student(String id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public Student(String id) {
		this.id = id;
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * @Override public int hashCode() { int hash = 10; hash = 31 * hash + (id ==
	 * null ? 0 : id.hashCode()); return hash; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);

		System.out.println("student1 == student2: " + (student1 == student2));
		System.out.println("student1.equals(student2): " + (student1.equals(student2)));
		System.out.println("student2.equals(student3): " + (student2.equals(student3)));

		List<Student> listStudents = new ArrayList<>();

		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);

		Student searchStudent1 = new Student("123");
		Student searchStudent2 = new Student("789");

		boolean found1 = listStudents.contains(searchStudent1);
		boolean found2 = listStudents.contains(searchStudent2);

		System.out.println("Found student1: " + found1);
		System.out.println("Found student2: " + found2);

		Student searchStudent11 = new Student("123", "Tom");
		Student searchStudent22 = new Student("789", "Tom");

		boolean found11 = listStudents.contains(searchStudent11);
		boolean found22 = listStudents.contains(searchStudent22);

		System.out.println("Found student1: " + found11);
		System.out.println("Found student2: " + found22);

		System.out.println("======================hashcode================================");

		Set<Student> setStudents = new HashSet<>();

		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);

		setStudents.forEach(student -> System.out.println(student));

		Student searchStudent = new Student("456", "Peter", "peter@gmail.com", 23);
		boolean found = setStudents.contains(searchStudent);
		System.out.println("Found student: " + found);
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student2.hashCode());
		
		for(Student s: setStudents)
			System.out.println(s.hashCode());
		

	}

}
