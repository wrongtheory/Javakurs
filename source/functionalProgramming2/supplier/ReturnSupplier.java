package functionalProgramming2.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ReturnSupplier<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnSupplier<String> obj = new ReturnSupplier();
		List<String> list = obj.supplier().get();
	}

	
	public Supplier<List<T>> supplier() {
		return ArrayList::new;
	}
	
}
