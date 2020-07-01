package web;

public class Lambda4 {
	
	static int outerStaticNum=2;
	int outerNum=1;
	
	
	void testScopes() {
		Converter<Integer, String> stringConverter = (from) -> {
			outerNum = 23;
			return String.valueOf(from);
		};
		
		Converter<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			return String.valueOf(from);
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
