package JavaIO.tests;

import java.io.Serializable;

public class Frage14 implements Serializable{
	
	private transient String name = "CocoaCookies";
	private transient int sugar;
	
	public Frage14() {
		super();
		this.name = "CaptainPebbles";
	}
	
	{
		name = "SugarPops";
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getSugar() {
		return sugar;
	}



	public void setSugar(int sugar) {
		this.sugar = sugar;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frage14 f = new Frage14();
			System.out.println(f.name);
	}

}
