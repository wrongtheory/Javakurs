package JavaIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("C:/data/source.txt", "r");
		RandomAccessFile ref2 = new RandomAccessFile("C:/data/destination.txt", "rw");
		//int a = raf.read();
		raf.seek(0);
		byte[] dest = new byte[1024];
		int offset = 0;
		int length = 1024;
		int x;
		while((x = raf.read()) != -1) {
			System.out.print((char)x);
			ref2.write(x);
		}

	}

}
