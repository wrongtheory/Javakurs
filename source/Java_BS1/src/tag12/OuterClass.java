package tag12;


public class OuterClass {
	
	public static void main(String[] args) {
	
	}
	
	public String outerWert = "outerInstanceMember";
	public static String outerStaticWert = "outerStaticMember";
	
	public void doIt() {
		System.out.println(Inner2.innerStaticWert);
		Inner1 innerKlasse1 = new Inner1();
		System.out.println(innerKlasse1.innerWert);
		System.out.println(outerStaticWert);
		System.out.println(outerWert);
	}
	
	public static class Inner1{
		public String innerWert = "outerInstanceMember";
		public static String innerStaticWert = "innerStaticMember";
		public void doIt() {
			System.out.println(outerStaticWert);
			System.out.println(new OuterClass().outerWert);
		}
		
	}
	
	public static class Inner2{
		public String innerWert = "innerInstanceMember";
		public static String innerStaticWert = "innerStaticMember";
		
	}
	

}
