package genericsAndCollections;

import java.util.TreeSet;

public class Test3Frage8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		
		System.out.println(tree);
		
		System.out.println(tree.ceiling("On"));

	}

}
