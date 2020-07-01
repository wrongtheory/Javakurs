package exceptions;


abstract class Duck {
	protected int count;
	public abstract int getDuckies() throws Exception;
}

public class Ducklings extends Duck {
	private int age;
	
	public Ducklings(int age) {this.age = age;}
	
	public int getDuckies() throws Exception {return this.age / count;}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			Duck itQuacks  = new Ducklings(5);
			try {
				System.out.println(itQuacks.getDuckies());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Ex");
			}
	}

}
