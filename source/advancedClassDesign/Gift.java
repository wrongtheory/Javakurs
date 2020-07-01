package advancedClassDesign;

interface Toy{
	String play();
}

public class Gift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract class Robot {}
			class Transformer extends Robot implements Toy {
				public String name = "GiantRobot";
				public String play() {return "DinosaurRobot";}
			}
			Transformer prime = new Transformer() {
				public String play() {return name;}
			};
			
		
		System.out.println(prime.play() + " " + new Transformer().name);
	}

}
