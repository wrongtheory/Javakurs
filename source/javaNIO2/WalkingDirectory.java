package javaNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkingDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Path path = Paths.get("C:/data/aa");
		
		try {
			Files.walk(path,4)
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
		} catch(IOException e) {
			
		}
		
		
		long dateFilter = 1420070400000l;
		
		try {
			Stream<Path> stream = Files.find(path, 10, (p,a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
			stream.forEach(System.out::println);
		} catch (Exception e) {
			
		}
		
		
		Path path2 = Paths.get("C:/data/hz.txt");
		
		try {
			Files.list(path2)
			.filter(p -> !Files.isDirectory(p))
			.map(p -> p.toAbsolutePath())
			.forEach(System.out::println);
		} catch(IOException e) {}

		
		Files.lines(path2).forEach(System.out::println);
		
	}

}
