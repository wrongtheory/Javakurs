package concurency;

public class Thread2 extends Thread{

	@Override
	public void run() {
			System.out.println("Printing zoo inventory");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin");
			new Thread2().start();
			new Thread(new Thread1()).start();
			new Thread2().start();
			System.out.println("end");
			
			new Thread1().run();
			(new Thread(new Thread1())).run();
			(new Thread2()).run();
	}

}
