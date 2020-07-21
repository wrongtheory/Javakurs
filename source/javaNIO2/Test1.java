package javaNIO2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub
		
		
		Path path1 = Paths.get("C:/data/hz.txt");
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
		
		System.out.println(Files.exists(path1));
		
		//Files.copy(Paths.get("C:/data"),Paths.get("C:/data1"));
		//Files.copy(Paths.get("C:/data/source.txt"),Paths.get("C:/data1/source2.txt"));
		
		//InputStream is = new FileInputStream("C:/data/source.txt");
		//OutputStream out = new FileOutputStream("C:/data/output.txt");
		
		//Files.copy(is,Paths.get("C:/data/hz.txt"));
		//Files.copy(Paths.get("C:/data/hz.txt"), out);
		
		//Files.move(Paths.get("C:/data/a"), Paths.get("C:/data/aa"));
		//Files.move(Paths.get("C:/data/source.txt"), Paths.get("C:/data1/move.txt"));
		
		//Files.deleteIfExists(Paths.get("C:/data/aa"));
		
		
		BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("US-ASCII"));
		
		String curlinr = null;
		while((curlinr = reader.readLine()) != null )
			System.out.println(curlinr);

	
		final List<String> lines = Files.readAllLines(path1);
		System.out.println("line1 " + lines.get(0));
		for(String line : lines)
			System.out.println(line);
		
		
		System.out.println(Files.isDirectory(path1));
		System.out.println(Files.isRegularFile(path1));
		System.out.println(Files.isSymbolicLink(path1));
		
		
		System.out.println(Files.isHidden(path1));
		
		System.out.println(Files.isReadable(path1));
		
		System.out.println(Files.isExecutable(path1));
		
		System.out.println(Files.size(path1));
		
		
		System.out.println(Files.getLastModifiedTime(path1).toMillis());
		
		
		Files.setLastModifiedTime(path1, FileTime.fromMillis(System.currentTimeMillis()));

		
		System.out.println(Files.getLastModifiedTime(path1).toMillis());
		
		UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("User");
		System.out.println(owner.getName());
		
		UserPrincipal owner2 = path1.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("User");
		System.out.println(owner2);
		
		
		System.out.println(Files.getOwner(path1).getName());
		
		
		
	}

}
