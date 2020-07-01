package wbs.collections;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MoreSortLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Comparator<Integer> cmp = (i1,i2) -> { int diff =
		 * CountDiffChars.Method2((Integer.toString(i1))) -
		 * CountDiffChars.Method2((Integer.toString(i2))); return diff != 0 ?
		 * diff:Integer.compare(i1, i2); };
		 */
		
		Comparator<Integer> cmp2 =  (i1,i2) -> {
			int diff =  Prim.primfaktoren(i1).size() - Prim.primfaktoren(i2).size();
			return diff !=0 ? diff : Integer.compare(i1, i2);
			
		};
		
		IntStream.rangeClosed(1,1000).boxed().sorted(cmp2).forEach(n -> System.out.println(n + " -> " + Prim.primfaktoren(n)));

	}

}
