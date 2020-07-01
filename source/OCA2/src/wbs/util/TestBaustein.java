package wbs.util;

import java.util.Comparator;

interface  A<T,K>{
	
}

interface B<X,T,R> extends A {} 

class C implements Comparable<C>, Comparator<C> {

	@Override
	public int compareTo(C o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(C o1, C o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class TestBaustein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
