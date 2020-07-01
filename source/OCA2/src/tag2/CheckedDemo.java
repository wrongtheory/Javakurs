package tag2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "src/tag2/CheckedDemo.java";
		Path path = Paths.get(file);
		System.out.println(path.toAbsolutePath());
		List<String> lines;
		
		try {
			lines = Files.readAllLines(path);
			
			for(String line: lines)
				System.out.println(line);
			
			System.out.println(lines.getClass());
			System.out.println(lines instanceof ArrayList);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// wir geben den objekt type
		
		

	}

}
