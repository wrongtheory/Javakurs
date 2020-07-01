package internet;

import java.util.Arrays;

class Arr<T> {
	T tarray[];
	
	public Arr(T myarray[]) {
		tarray = myarray;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(tarray);
	}
}

public class GenericArrayWildcard {

	public static void main(String[] args) {
		
		Arr<Integer> arr1 = new Arr<Integer>(new Integer[] {2,4,6,8,10});
		System.out.println(arr1);
		
		Arr<String> arr2 = new Arr<String>(new String[] {"aa","bb","cc","dd"});
		System.out.println(arr2);
		
		Arr<?> arr3[] = new Arr<?>[5];
		
		arr3[0] = new Arr<Integer>(new Integer[] {10,20,30,40,50});
		System.out.println(arr3[0]);
		
		arr3[1] = new Arr<Float>(new Float[] {1.1f,2.2f,3.3f,4.4f,5.5f});
		System.out.println(arr3[1]);

	}

}
