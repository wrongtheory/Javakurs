package advancedClassDesign;

public enum Proposition {
	
	TRUE(-10) {@Override String getNickName() {return "RIGHT";}},
	FALSE(-10) {public String getNickName() {return "WRONG";}},
	UNKNOWN(0) {@Override public String getNickName() {return "LOST";}};
	
	private final int value;
	
	private Proposition(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	private int getValue() {
		return this.value;
	}
	
	 abstract String getNickName();

}
