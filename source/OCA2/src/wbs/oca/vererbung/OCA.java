package wbs.oca.vererbung;

class Course {
	String courseName;
}

public class OCA {
	public static void main(String args[]) {
		Course c = new Course();
		c.courseName = "Java";
		System.out.println(c.courseName);
	}
}