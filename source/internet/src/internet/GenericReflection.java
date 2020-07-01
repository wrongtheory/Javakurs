package internet;

import java.util.Arrays;

class Array2<E> {
	private final E[] objArray;
	public final int length;
	
	public Array2(Class<E>dataType, int length) {
		this.objArray = (E[]) java.lang.reflect.Array.newInstance(dataType, length);
		this.length = length;
	}
	
	E get(int i) {
		return objArray[i];
	}
	
	void set(int i, E e) {
		objArray[i] = e;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(objArray);
	}
}

public class GenericReflection {

	public static void main(String[] args) {
		
		final int length = 5;
		
		Array2<Integer>int_Array = new Array2(Integer.class, length);
		
		for(int i=0; i < length; i++)
			int_Array.set(i, i + 10);
		System.out.println(int_Array);
		
		Array2<String>str_Array = new Array2(String.class, length);
		
		for(int i=0; i < length; i++)
			str_Array.set(i, String.valueOf((char)(i + 65)));
		System.out.println(str_Array);
	}

}
