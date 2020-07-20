package JavaIO;

import java.io.File;

public class ReadDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = null;
		String[] paths;
		
		try {
			file = new File("C:/data");
			
			paths = file.list();
			
			for(String path : paths)
				System.out.println(path + path.length());
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
