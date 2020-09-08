package advancedClassDesign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1) Object class defines methods equals() and hashCode()

// equals() method in Object class:

//		public boolean equals(Object obj) {
//    		return (this == obj);
//		}

// hashCode() method in Object class:

//		 public native int hashCode();


// Some Classes as String override equals() and hashCode() methods 

// equal() method comapre two objects semantically (by comparing the data members of the class)
// == compares two objects technically (their references, memory addresses)

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = new String("This is a String");
		String s2 = new String("This is a String");
		
		System.out.println(s1 == s2);      // print false
		System.out.println(s1.equals(s2)); // print true	
		
		String s3 = new String("This is a String");
		String s4 = new String("This is a String2");
		
		System.out.println(s3 == s4);      // print false
		System.out.println(s3.equals(s4)); // print false
		
		// Testing 3 Students
		
		Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		
		System.out.println("student1 == student2: " + (student1 == student2));
		System.out.println("student1.equals(student2): " + (student1.equals(student2)));
		System.out.println("student2.equals(student3): " + (student1.equals(student3)));
		
		
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		
		
		Student searchStudent1 = new Student("123");
		Student searchStudent4 = new Student("789");
		
		System.out.println(listStudents.contains(searchStudent1));
		System.out.println(listStudents.contains(searchStudent4));
		
		Set<Student> setStudents = new HashSet<Student>();
		
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		
		
		setStudents.forEach(student -> System.out.println(student));
		
		Student searchStudent = new Student("456");
		
		System.out.println("Found Student: " + setStudents.contains(searchStudent));
		System.out.println(searchStudent.hashCode());

	}
}


class Student {
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
	
	@Override
	public String toString() {
		String studentInfo = "Student: " + id;
		studentInfo += ": " + name;
		studentInfo += " - " + email;
		studentInfo += " - " + age;
		
		return studentInfo;
	}
	
	/*
	 * public boolean equals(Object obj) { if(obj instanceof Student) { Student
	 * another = (Student) obj; if(this.id.equals(another.id) &&
	 * this.name.equals(another.name) && this.email.equals(another.email) &&
	 * this.age == another.age) { return true; } }
	 * 
	 * return false; }
	 */
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student another = (Student) obj;
			if(this.id.equals(another.id))
				return true;
			}
		return false;
		}
	
	
		@Override
		 public int hashCode() { return 31 + id.hashCode(); }
		 
			
}
