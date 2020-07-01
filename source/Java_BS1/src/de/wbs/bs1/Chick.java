package de.wbs.bs1;

public class Chick {
	
	static private String name = "Fluffy";

	public Chick() {
		// TODO Auto-generated constructor stub
		name = "Tiny";
		
		Long max = 31234567895453L;
		
		System.out.println("setting constructor");
	}
	
	public void aMethod() {
		int x;
		//System.out.println(x); error
	}
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		
		if(check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
			onlyOneBranch = 2;
		}
		
		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int input = (char)System.in.read();
		while(input >=1 && input <=3) {
			switch (input) {
			case 1:
				System.out.println("1 - Angebot");
				break;
			case 2:
				System.out.println("2 - Rechnung");
				break;
			case 3:
				System.out.println("3 - Kasse");
				break;
			}
			
			
			
		}

		System.out.println('1');
		Chick chick = new Chick();
		System.out.println(chick.name);

		/*
		 * System.out.println(Character.MIN_VALUE); System.out.println(Byte.MAX_VALUE);
		 * System.out.println(Short.MAX_VALUE); System.out.println(Integer.MAX_VALUE);
		 * System.out.println(Long.MAX_VALUE); System.out.println(Float.MAX_VALUE);
		 * System.out.println(Double.MAX_VALUE);
		 */
		
		System.out.println(017);
		System.out.println(0xff);
		System.out.println(0b101011);
		
		if(1==1) 
			//int i = 1;
			name = "hz";

	{
		System.out.println("setting fields");
	}
	
	
	String a = "a";
	
	switch(a){
	case "a":
		System.out.println(a);
		break;
	}
	
	
	
	System.out.println(Wochwntage.Di.ordinal());
	
	Wochwntage wcht = Wochwntage.Di;
	
	switch(wcht) {
	case Mo:
		System.out.println("Mo");
	default:
		System.out.println("default");
	}
	

}

}


enum Wochwntage{
	Mo, Di, Mi, Do, Fr, Sa, So
}