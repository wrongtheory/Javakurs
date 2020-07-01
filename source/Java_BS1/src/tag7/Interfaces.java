package tag7;

public class Interfaces implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Interfaces i = new Interfaces();
			i.AA();
			System.out.println(i instanceof Interfaces);
		}

	@Override
	public void AA() {
		// TODO Auto-generated method stub
		
	}
	}




interface A{
	void AA();
}

interface B{
	void AA();
}