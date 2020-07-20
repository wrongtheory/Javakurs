package JavaIO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		final PipedOutputStream outputStream = new PipedOutputStream();
		final PipedInputStream pipedInputStream = new PipedInputStream(outputStream);
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					outputStream.write("Hello world, pipe!".getBytes());
				} catch(IOException e) {
					
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					int data = pipedInputStream.read();
					while(data != -1){
						System.out.print((char) data);
						data = pipedInputStream.read();
					}
				}catch(IOException e) {}
			}
		});
		
		thread1.start();
		thread2.start();

	}

}
