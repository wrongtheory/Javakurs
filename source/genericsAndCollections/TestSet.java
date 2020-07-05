package genericsAndCollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		Set s = new HashSet();
		s.add(53454);
		s.add(2);
		s.add(65465);
		
		System.out.print(s);
		
		List l = new ArrayList();
		l.add(53454);
		l.add(2);
		l.add(65465);
		
		System.out.print(l);
		
		Queue q = new ArrayDeque();
		q.add(54354);
		q.add(2436);
		q.add(3);
		q.offer(8);
		q.add(343);

		System.out.print(q);
		
		
		
		
	}

}
