package generics.com.basicstrong;

public class Demo {

	public static void main(String[] args) {
		Data<String> d1 = new Data<>("This is d1");
		
		System.out.println(d1.toString());
		
		Data<Integer> d2 = new Data<>(10);
		
		System.out.println(d2.toString());
		

		IData<String> d3 = new Data<>("We have implemented generic Interface");
		
		System.out.println(d3.toString());
		
		
		Data<String> d4 = new Data<>("data 4");
		
		BaseData<String> b1 = d4;
		
	}

}
