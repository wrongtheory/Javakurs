package advancedClassDesign;

public class Woods {
	
	static class Tree{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int water = 10 + 5;
		
		final class Oak extends Tree {
			public int getWater() {
				return water;
			}
		}
		System.out.println(new Oak().getWater());
	}

}
