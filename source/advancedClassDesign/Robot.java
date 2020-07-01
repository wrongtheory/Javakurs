package advancedClassDesign;


interface Pump {
	static void pump(double psi) {}
}

interface Bend extends Pump {
	void bend(double tensile);
}

public class Robot {
	
	public static final void apply(Bend instr, double inp) {
		instr.bend(inp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Robot r = new Robot();
		r.apply(x -> System.out.print(x + " bent!"), 5);
	}

}
