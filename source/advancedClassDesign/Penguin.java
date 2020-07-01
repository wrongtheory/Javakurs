package advancedClassDesign;

public class Penguin {

	private int volume = 1;
	
	private class Chick {
		private int volume = 3;
		
		void chick() {
			System.out.println("Honk(" + Penguin.this.volume);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin penguin = new Penguin();
		final Penguin.Chick littleOne = penguin.new Chick();
		littleOne.chick();
	}

}
