package JavaIO;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:/data/destination.txt"));
		
		byte[] b = new byte[] {1,2,3,4,5};
		
		bufferedOutputStream.write(b);
		bufferedOutputStream.flush();
		
		InputStream input1 = new FileInputStream("C:/data/file1.txt");
		InputStream input2 = new FileInputStream("C:/data/file2.txt");
		
		SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
		
		int data = sequenceInputStream.read();
		
		while(data != -1) {
			System.out.print((char)data);
			data = sequenceInputStream.read();
		}
		
		DataOutputStream dto = new DataOutputStream(new FileOutputStream("C:/data/destination.txt"));
		
		dto.write(45);
		dto.writeInt(1234);
		dto.writeDouble(109.123);
		
		dto.close();
		
		DataInputStream dti = new DataInputStream(new FileInputStream("C:/data/destination.txt"));
		
		int x = dti.read();
		int y = dti.readInt();
		double z = dti.readDouble();
		
		dti.close();
		
		System.out.println(x + "  " + y + " " + z);

	}

}
