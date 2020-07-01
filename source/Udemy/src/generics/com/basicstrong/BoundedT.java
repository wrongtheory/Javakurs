package generics.com.basicstrong;

import java.util.Arrays;
import java.util.List;

public class BoundedT {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(new Integer[] {9,4,8,5,1});
		List<Double> dlist = Arrays.asList(new Double[] {1.1,3.3,9.9,2.2});
		
		DataSorter<Integer> sorter1 = new DataSorter<Integer>(list);
		DataSorter<Double> sorter2 = new DataSorter<Double>(dlist);
		
		sorter1.getSortedData();
		sorter2.getSortedData();

		//getSortedData(list);
		
		CBound b = new CBound();
		getSortedData(b);
		
	}

	
	public static <T extends IBound1 & IBound2> void getSortedData (T list) {
		/*
		 * list.sort(null);
		 * 
		 * for (T t : list) { System.out.println(t); }
		 */
	}
}


interface IBound1{
}

interface IBound2{
}


class CBound implements IBound1,IBound2 {
	
}