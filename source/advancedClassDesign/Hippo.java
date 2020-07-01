package advancedClassDesign;

public class Hippo {
	
	private String name;
	private double weight;
	
	public Hippo(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hippo h1 = new Hippo("Harry",3100);
		System.out.println(h1);
	}

}
