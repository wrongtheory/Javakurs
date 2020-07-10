package JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		
		File file = new File("C:\\data\\zoo.txt");
		System.out.println("File exists: " + file.exists());
		
		if(file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			
			if(file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for(File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}
		
		
		try(
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			System.out.println(bufferedReader.readLine());
		} 
		
		//try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
			//System.out.println(objectInputStream.readObject());}
		
		/*
		 * InputStream is = new BufferedInputStream(new FileInputStream(file));
		 * System.out.println((char)is.read());
		 * 
		 * if(is.markSupported()) { is.mark(1000); System.out.println((char)is.read());
		 * System.out.println((char)is.read()); is.reset(); }
		 * System.out.println((char)is.read()); System.out.println((char)is.read());
		 * System.out.println((char)is.read()); System.out.println((char)is.read());
		 */
		
		
		InputStream is2 = new BufferedInputStream(new FileInputStream(file));
		System.out.println((char)is2.read());
		is2.skip(2);
		//is2.read();
		System.out.println((char)is2.read());
		System.out.println((char)is2.read());
		System.out.println((char)is2.read());
		
		File source = new File("C:\\data\\source.txt");
		File destination = new File("C:\\data\\destination.txt");
		//CopyFileSample.copy(source, destination);
		
		//CopyBufferFileSample.copy(source, destination);
		
		List<String> data = CopyTextFileSample.readFile(source);
		
		for(String record : data)
			System.out.println(record);
		CopyTextFileSample.writeFile(data, destination);
	}
	
	

}

class CopyFileSample {
	public static void copy(File source, File destindation) throws IOException {
		try( InputStream in = new FileInputStream(source);
				OutputStream out = new FileOutputStream(destindation)){
					int b;
					while((b = in.read()) != -1)
						out.write(b);
				}
	}
}


class CopyBufferFileSample {
	public static void copy(File source, File destination) throws IOException {
		try(
				InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			int lengthRead;
			while((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
				
	}
}


class CopyTextFileSample {
	public static List<String> readFile(File source) throws IOException {
		List<String> data = new ArrayList<String>();
		
		try ( BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			
			while((s = reader.readLine()) != null)
				data.add(s);
		}
		return data;
	}
	
	public static void writeFile(List<String> data, File destination) throws IOException {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
			for(String s : data) {
				writer.write(s);
				writer.newLine();
			}
		}
	}
	
}

