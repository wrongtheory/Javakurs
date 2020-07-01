package genericsAndCollections;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



class AA  {
	
	public static int meth(int param) {
		Function<Integer, Integer> function = (val) -> val+10;
		long r = function.apply(param);
		
		return (int) r;
	}


	
}


public class FunctionInterfaceExample implements Function<Long, Long>{

	@Override
	public Long apply(Long t) {
		// TODO Auto-generated method stub
		return t + 3;
	}
	
	public static void main(String[] args) {
		Function<Long, Long> adder = new FunctionInterfaceExample();
		Long resuylt = adder.apply((long) 4);
		System.out.println(resuylt);
		
		Function<Long, Long> adder2 = (value) -> value+3;
		Long res = adder2.apply((long) 8);
		System.out.println(res);
		
		int b = AA.meth(20);
		System.out.println(b);
		
		Integer i[] = {1,2,3,4};
		
		Predicate<Integer> p = (v) -> v%2==0;
		
		for(int j:i)
			if(p.test(j)==true)
				System.out.println(j);
		
		
		
		//BinaryOperator<mv> bin = (v1,v2) -> {v2.add(v2); return v1;};
		
		Supplier<Integer> sup = () -> new Integer((int) (Math.random() * 1000D));
		System.out.println(sup.get());
		
		Consumer<Integer> con = (f) -> System.out.println(f);
		con.accept(10);
		
		
		
	}

	
}
