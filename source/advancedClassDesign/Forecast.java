package advancedClassDesign;

public class Forecast {
	
	public enum Snow {BLIZARD, SQUALL, FLURRY}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(Snow.BLIZARD.ordinal());
			System.out.println(Snow.valueOf("flurry".toUpperCase()).name());
	}

}
