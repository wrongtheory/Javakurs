

interface in1{
	public default void a(){
		System.out.println("default method in interface");
	}
}

public class Interfaces3 implements in1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Interfaces3 i = new Interfaces3();
			i.a();
			Hop.getJump();
	}

}

interface Hop{
	static int getJump() {
		System.out.println("static method in a interface");
		return 1;
		
	}
}
