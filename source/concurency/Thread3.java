package concurency;

public class Thread3 {
	
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		new Thread(() ->  {
			for(int i = 0; i < 500; i++) {
				Thread3.counter++;
				//System.out.println(counter);
			}
		}).start();
		
		while(Thread3.counter < 100) {
			System.out.println("Not reached yet");
			System.out.println(counter);
			Thread.sleep(1000);
		}
		System.out.println("Reached");
	}
	
	

}
