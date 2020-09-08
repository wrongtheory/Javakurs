package enthuware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {

	private String title;
	private String genre;
	private String author;

	public Test5(String title, String genre, String author) {
		this.title = title;
		this.genre = genre;
		this.author = author;

	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	
	public String getAuthor() {
		return author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Test5> test = Arrays.asList(
				new Test5("There is nothing to do", "action", "James"),
				new Test5("Java ist auch ein Insel", "action", "James"),
				new Test5("Berlin ist wunderschon", "action", "John")
				);
		
		
		Map<String, Map<String, List<String>>> classified = null;
		//classified = test.stream().collect(Collectors.groupingBy(Test5::getGenre, Collectors.groupingBy(Test5::getAuthor)));
		//classified = test.stream().collect(Collectors.groupingBy(x -> x.getGenre(), Collectors.groupingBy(x->x.getAuthor().toString(),Collectors.toList())));
		
		classified = test.stream().collect(Collectors.groupingBy(Test5::getGenre,Collectors.groupingBy(Test5::getAuthor,Collectors.mapping(Test5::getTitle, Collectors.toList()))));
		System.out.println(classified);
		
		
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
		map.put("Luni", "Java");
		map.put("Marti", "Java");
		map.put("Miercuri", "Java");
		map.put("Luni", "Java");
		map.put("Vineri", "Java");
		map.put("Sambata", "Tenis");
		map.put("Duminica", "Tenis");
		
		//map.merge("Luni", "Java", (a,b) -> a.equalsIgnoreCase("Joi") ? "Tenis":"Unknown");
		map.forEach((a,b) -> map2.merge(a, b, (d,e) -> d.equalsIgnoreCase(a) ? "Tenis":"Unknown"));
		
		System.out.println(map2);
		
		
		
		

	}

}
