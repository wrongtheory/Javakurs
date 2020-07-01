package level8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class MergingSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Kata.mergeArrays(new int[] {2,4,8},new int[] {2,4,6});
//Kata.mergeArrays(new int[] {1,3,5},new int[] {2,4,6});
		
Kata2.mergeArrays(new int[] {1,3,5},new int[] {2,4,6});
Kata2.mergeArrays(new int[] {2,4,8},new int[] {2,4,6,6});

	}

}


class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {

		List<Integer> l = new ArrayList<Integer>();
		
		
	loo:	for(int i=0;i<first.length;i++) {
			for(int j=i;j<second.length;j++) {
				if(first[i]==second[j])
				{
					l.add(first[i]);
					continue loo;
				}
				else {
					l.add(first[i]);
					l.add(second[j]);
					continue loo;
				}
			}
		}
		
		Collections.sort(l);
		
		int[] arr = new int[l.size()];
		for (int i =0; i < l.size(); i++) 
            arr[i] = l.get(i); 
  
		
	for(Object i:l)
		System.out.println(i);
		return arr;
	}
}

class Kata2 {
	public static int[] mergeArrays(int[] first, int[] second) {

		
		List<Integer> l = new ArrayList<Integer>(first.length);
		for(int i: first)
			l.add(i);
		System.out.println(l);
		
		List<Integer> l2 = new ArrayList<Integer>(second.length);
		for(int i: second)
			l2.add(i);
		System.out.println(l2);
		
		for(int i=0;i<l.size();i++) {
			if(!l2.contains(l.get(i)))
				l2.add(l.get(i));
		}
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(l2);
        
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
		
		Collections.sort(listWithoutDuplicates);
		System.out.println(listWithoutDuplicates);
		
		int[] arr = new int[listWithoutDuplicates.size()];
		for (int i =0; i < listWithoutDuplicates.size(); i++) 
            arr[i] = listWithoutDuplicates.get(i); 
		
		return arr;
	}
}