package tag2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Checked2Demo {

	private static int sum = 0, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		String file = "src/tag2/lines.txt";
		Path path = Paths.get(file);
		System.out.println(path.toAbsolutePath());
		List<String> lines;

		lines = Files.readAllLines(path);

		for (String line : lines) {
			try {
				sum += Integer.parseInt(line);
				count++;
			} catch (Exception e) {
				System.out.println("error parsing at line " + ++count);
			}
			// System.out.println(line);
		}
		
		System.out.println("Sum numbers is " + sum);
		System.out.println("Count numbers: " + count);
		// System.out.println(lines.getClass());

	}

}


