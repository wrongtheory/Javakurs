package wbs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterationDemo {

	public static void main(String[] args) {
		
		// wir bestucken eine List mit den zahlen von 1 bis 5
		List<Integer> zahlen = Arrays.asList(1,2,3,4,5);
		
		System.out.println(zahlen.getClass());
		
		// wir geben alle elemente von zahlen aus
		
		// for - schleife
		
		for(int i=0;i<zahlen.size();i++)
			System.out.print(zahlen.get(i));
		System.out.println();
		// enhanced for loop
		
		for(Integer i: zahlen)
			System.out.print(i);
		System.out.println();
		
		// Iterator
		Iterator<Integer> it = zahlen.iterator();
		
		while(it.hasNext()) {
			//int i = it.next();
			System.out.print(it.next());
		}
		System.out.println();
		
		// foreach() und anonyme klasse
		
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t);
				
			}
			
		};
		
		zahlen.forEach(consumer);
		System.out.println();
		
		// foreach un lambda
		
		zahlen.forEach(i -> System.out.print(i));
		
		System.out.println();
		
		zahlen.forEach(System.out::print);
		
		
	Arrays.asList(10,28,100).forEach(n -> System.out.println(teiler(n)));
		

	}
	
	public static List<Long> teiler(long zahl){
		List<Long> list = new ArrayList<Long>();
		for(long t = 1; t<=zahl/2;t++)
			if(zahl % t == 0)
				list.add(t);
		
		return list;
	}
	
	

}


