package javaNIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		Path path = Paths.get("C:/data2");
		
		
		Files.move(Paths.get("monkey.txt"), path, StandardCopyOption.ATOMIC_MOVE, LinkOption.NOFOLLOW_LINKS);
		
		Files.createDirectory(path.resolve("joi"));
		
		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		
		
		System.out.println("Is path a directory ? " + data.isDirectory());
		System.out.println("Is path a regular file ? " + data.isRegularFile());
		System.out.println("Is path a symbol link ? " + data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolik link? " + data.isOther());
		
		System.out.println("Size (in bytes): " + data.size());
		
		System.out.println("Creation date/time: " + data.creationTime());
		
		System.out.println("Last modified date/time: " + data.lastModifiedTime());
		
		System.out.println("Last accesed date/time: " + data.lastAccessTime());
		
		System.out.println("Unique file identifier (if available): " + data.fileKey());
		
		
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		
		BasicFileAttributes data1 = view.readAttributes(); 
		
		FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
		
		view.setTimes(null, null, null);

	}

}
