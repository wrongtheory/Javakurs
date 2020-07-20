package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test5 {
	
	public static class Person implements Serializable {
		public transient String name = "";
		public transient int age = 0;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/data/person.txt"));
		
		Person person = new Person();
		person.name = "Victor";
		person.age = 31;
		
		oos.writeObject(person);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/data/person.txt"));
		
		Person persread = (Person) ois.readObject();
		
		ois.close();
		
		System.out.println(person.name);
		System.out.println(persread.age);

	}

}
