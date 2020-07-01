import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ClassArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [true]
		list.add(new Integer(1)); // [1]
		System.out.println(list); // [hawk, true, 1]
		
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		// safer.add(Boolean.TRUE); // does not compile
		
		List<String> birds = new ArrayList<>();
		
		birds.add(0,"hawk"); // [hawk]
		birds.add(1,"robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		
		System.out.println(birds);
		
		List<String> birds2 = new ArrayList<>();
		
		birds2.add("hawk"); // [hawk]
		birds2.add("hawk"); // [hawk, hawk]
		
		System.out.println(birds2.remove("cardinal")); // false
		
		// birds2.remove(100); // IndexOutOfBoundsException: Index 100 out of bounds for length 2
		
		System.out.println(birds2.remove("hawk")); // true
		
		System.out.println(birds2.remove(0)); // hawk
		
		System.out.println(birds2); // []
		
		
		List numbers = new ArrayList<>();
		
		numbers.add("unu");
		numbers.add("doi");
		numbers.add("trei");
		numbers.add(2);
		
		System.out.println(numbers.remove(new Integer(2)));
		System.out.println(numbers.remove(new String("unu")));
		
		System.out.println(numbers);
		
		
		List<String> birds3 = new ArrayList<>();
		
		birds3.add("hawk"); // [hawk]
		System.out.println(birds3.size()); // 1
		birds3.set(0, "robin");
		System.out.println(birds3.size()); // 1 
		
		birds3.add("Victor");
		birds3.add("Leunti");
		birds3.add("hawk");
		
		
		// birds3.set(1, "robin"); // IndexOutOfBoundsException
		
		
		System.out.println(birds3.contains("hawk"));
		System.out.println(birds3.contains("Hallo"));
		
		
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		
		System.out.println(one.equals(two));
		
		one.add("a");
		
		System.out.println(one.equals(two));
		
		two.add("a");
		
		System.out.println(one.equals(two));
		
		one.add("b");
		two.add(0,"b");
		
		System.out.println(one.equals(two));
		
// Autoboxing
		
		List<Double> weights = new ArrayList<>();
		
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0);
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		System.out.println(heights);
		
		// int h = heights.get(0); // NullPointerException
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("hawk");
		list2.add("robin");
		
		Object[] objectArray = list2.toArray();
		
		System.out.println(objectArray.length);
		
		String[] stringArray = list2.toArray(new String[0]);
		
		System.out.println(stringArray.length);
		
		
		
		String[] array = {"hawk", "robin"}; // [hawk, robin]
		
		List<String> list3 = Arrays.asList(array); // returns fixed size list
		
		System.out.println(list3.size());
		
		list3.set(1, "test"); // [hawk, test]
		
		for(String b: array)
			System.out.println(b + " ");
		
		array[0] = "new"; // [new, test]
		
		for(String b: array)
			System.out.println(b + " ");
		
		System.out.println(list3);
		
		// list3.remove(1); // UnsupportedOperationException, we are not allowed to change the size of the list
		
		

// Sorting ArrayList
		
		
		List<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(99);
		numbers2.add(5);
		numbers2.add(81);
		
		Collections.sort(numbers2);
		
		System.out.println(numbers2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
