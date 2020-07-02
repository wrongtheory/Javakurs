package web.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {


		List<String> lines = Arrays.asList("spring","node", "mykong");
		List<String> result = getFilterOutput(lines, "mykong");
		
		result.forEach(System.out::println);
		
		List<String> resultwithStream = lines
				.stream()
				.filter(line -> !"mykong".equals(line))
				.collect(Collectors.toList());
		
		resultwithStream.forEach(System.out::println);

	}
	
	private static List<String> getFilterOutput(List<String> lines, String filter){
		List<String> result = new ArrayList<>();
		for(String line : lines) {
			if(!"mykong".equals(line))
				result.add(line);
		}
		
		return result;
	}

}
