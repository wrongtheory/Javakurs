package concurency;

public class Thread1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Thread1()).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
			System.out.println("Printing record: " + i);
	}

}
