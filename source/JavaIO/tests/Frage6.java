package JavaIO.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Frage6 {
	
	public void sendAlert(File fn) {
		try(BufferedWriter w = new BufferedWriter(new FileWriter(fn))){
			w.write("ALERT");
			w.flush();
			w.write('!');
			System.out.println("1");
		} catch (IOException e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frage6().sendAlert(new File("alarm.txt"));
	}

}
