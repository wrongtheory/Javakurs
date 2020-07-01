package genericsAndCollections;

public class GenericsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	
	public static <T> void sink(T t) {}
	public static <T> T identify(T t) {return t;}
	public static <T> T noGood(T t) {return t;}

}
