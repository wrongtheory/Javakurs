package JavaIO.tests;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Sutdent2 implements Serializable {}

public class Frage21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("C:/data/source.txt")))){
			Sutdent2 record;
			while((record = (Sutdent2)ios.readObject()) != null) {
				System.out.println(record);
			}
		}catch (EOFException e) {
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
