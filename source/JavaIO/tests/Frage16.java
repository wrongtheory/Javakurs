package JavaIO.tests;

import java.io.File;

public class Frage16 {
	
	public void resetWorkingDirectory() throws Exception {
		File f1 = new File("C:\\data\\templates\\proofs");
		f1.mkdirs();
		File f2 = new File("C:\\data\\templates");
		f2.mkdir();
		new File(f2, "draft.doc");
		f1.delete();
		f2.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Frage16().resetWorkingDirectory();
		} catch (Exception e) {
			new RuntimeException(e);
		}
	}

}
