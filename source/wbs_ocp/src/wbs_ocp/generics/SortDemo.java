package wbs_ocp.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,10,20,30,40,100,200,300,400);
		
		System.out.println("original list");
		System.out.println(list);
		
		Comparator<Number> cmp = (n1,n2) -> n1.toString().compareTo(n2.toString());
		
		Collections.sort(list,cmp);
		
		System.out.println("list, sortiert nach der string representation");
		
		System.out.println(list);

	}

}
