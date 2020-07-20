package JavaIO;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\data");
		if(file.createNewFile())
			System.out.println(file.getAbsolutePath() + " created");
		else
			System.out.println(file.getAbsolutePath() + " already exists");
		//File file2 = new File("C:/data");
		
		//file.delete();
		//file.mkdirs();
		
		System.out.println(file.exists());
		//System.out.println(file2.exists());
		
		boolean s = file.renameTo(new File("C:/data/java.txt"));
		System.out.println(s);
		
		String filesep = System.getProperty("file.separator");
		System.out.println(filesep);
		
		System.out.println(file.lastModified());
		
		for(File t : file.listFiles()) {
			if(t.isFile())
				System.out.println(t.getName() + " " + t.getFreeSpace());
		}
			

	}

}
