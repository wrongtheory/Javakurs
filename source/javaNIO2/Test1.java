package javaNIO2;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {

	public static void main(String[] args) throws URISyntaxException {
		// TODO Auto-generated method stub
		
		
		Path path1 = Paths.get("C:\\temp");
		Path path2 = Paths.get("C:\\data\\a");
		System.out.println(path1.getNameCount());
		System.out.println(path1.getParent().normalize().toAbsolutePath());
		System.out.println(path1.getRoot());
		//System.out.println(path1.getName(1));
		System.out.println(path1.getFileSystem());
		System.out.println(path1.getFileName());
		
		//Path path2 = Paths.get(new URI("http://www.google.com"));
		//System.out.println(path2.getFileSystem());
		
		Path path3 = FileSystems.getDefault().getPath("C:/data/source.txt");
		System.out.println(path3);
		
		Path path4 = FileSystems.getDefault().getPath("C:", "data","source.txt");
		path4.forEach(i -> System.out.println(i));
		
		
		System.out.println("subpath: " + path1.subpath(0, 1));
		
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		
		System.out.println(path1.resolve(path2));
		System.out.println(path2.resolve(path1));
		
		Path relative = path1.relativize(path2);
		System.out.println(path1.resolve(relative).normalize());
		

	}

}
