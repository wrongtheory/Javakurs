package JavaIO;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirname = "C:/data/a/b/c/d";
		File d = new File(dirname);
		
		d.mkdirs();

	}

}
