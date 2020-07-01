package web;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student<T> {

	String firstname;
	String lastname;
	int age;
	int note;

	public Student(String fname, String lname, int sage, int snote) {

		this.firstname = fname;
		this.lastname = lname;
		this.age = sage;
		this.note = snote;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + " " + age + " " + note;
	}

	
	  @Override public int hashCode() { final int prime = 31; int result = 1;
	  result = prime * result + age; result = prime * result + ((firstname == null)
	  ? 0 : firstname.hashCode()); result = prime * result + ((lastname == null) ?
	  0 : lastname.hashCode()); result = prime * result + note; return result; }
	 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (note != other.note)
			return false;
		return true;
	}

	public static Comparator<Student> sortByFName=new Comparator<Student>(){

	@Override public int compare(Student o1,Student o2){

			return o1.getFirstname().compareTo(o2.getFirstname());
	
		}

	};

	public static Comparator<Student> sortByLName=new Comparator<Student>(){

	@Override public int compare(Student o1,Student o2){

			return o1.getLastname().compareTo(o2.getLastname());
	
		}

	};

	public static Comparator<Student> sortByAge=new Comparator<Student>(){

	@Override public int compare(Student o1,Student o2){

			return o1.getAge() - o2.getAge();
		}

	};

	public static Comparator<Student> sortByNote = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o2.getNote() - o1.getNote();
		}
		
	};


	
	static Comparator<Student> cmp = Comparator.comparing(Student::getFirstname);
	static Comparator<Student> cmp2 = Comparator.comparing(Student::getLastname);

}


class CompareTest implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getNote() - o2.getNote();
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Victor", "Leunti", new Integer(21), new Integer(21));
		
		CompareTest t = new CompareTest();
		
		Set<Student> student = new TreeSet<Student>(t);
		student.add(new Student("Victor", "Leunti", new Integer(21), new Integer(21)));
		student.add(new Student("Andrei", "Mure", new Integer(11), new Integer(2)));
		

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student("Victor", "Leunti", new Integer(21), new Integer(21)));
		listStudent.add(new Student("Andrei", "Bure", new Integer(11), new Integer(2)));
		listStudent.add(new Student("Frank", "Neumann", new Integer(11), new Integer(2)));

		// for(Object s : listStudent)
		// System.out.println(s + " ");

		 //Collections.sort(listStudent, Student.sortByFName);
		//Collections.sort(listStudent, Student.sortByLName);
		// Collections.sort(listStudent, Student.sortByAge);
		//Collections.sort(listStudent, Student.sortByNote);

		for (Object s : student)
			System.out.println(s + " ");
		
		
		
		Comparator<Student> compareByName = Comparator
												.comparing(Student::getLastname);
		
		
		Collections.sort(listStudent, compareByName);
		
		for (Object s : listStudent)
			System.out.println(s + " ");
		
		
		Collections.sort(listStudent, Student.cmp);
		
		for (Object s : listStudent)
			System.out.println(s + " ");
		

	}

}
