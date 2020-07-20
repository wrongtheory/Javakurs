package test1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class TestStream {
	
	public static List<String> readFile(File in) throws IOException{
		
		//InputStream input = null;
		List<String> list = new ArrayList<>();
		String string = "";
		System.out.println("before try");
		try(
				InputStream input = new BufferedInputStream(new FileInputStream(in));
				){
			int s ;
			
			while((s = input.read()) != -1) {
				string+=(char)s;
			}
		}
		System.out.println("nach try");
		
		StringTokenizer str = new StringTokenizer(string, " ");
		while(str.hasMoreTokens())
			list.add(str.nextToken());
		
		System.out.println("nach tokenizer");
		return list;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String text = "When using the groupingBy collector, we cannot make assumptions about the type of the returned Map. If we want to be specific about which type of Map we want to get from the group by then we can use the third variation of the groupingBy method that allows us to change the type of the Map by passing a Map supplier function.";
		
		String[] split = text.split(" ");
		
		
		
		//for(String s : split)
			//System.out.println(s);
		
		//long count = Arrays.stream(split).count();
		//System.out.println(count);
		
		
		//List<String> strings = new ArrayList<String>(Arrays.asList("abc","def","ghi","jkl","mno","abc"));
		//System.out.println(strings);
		
		//List<String> l = Arrays.asList(split);
		
		List<String> l = readFile(new File("C:/data/source.txt"));
		
		Map<String, Long> maps = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		//System.out.println(maps.keySet() + " " + maps);
		
		Map<String, Long> sort = new HashMap<>();
		
		//maps.entrySet().stream()
			//.sorted(Map.Entry.comparingByKey()).forEach(e -> sort.put(e.getKey(), e.getValue()));
		
		/*
		 * Comparator<Entry<String, Long>> comp = new
		 * Comparator<Map.Entry<String,Long>>() { public int compare(Entry<String, Long>
		 * l1, Entry<String, Long> e2) { Long o1 = l1.getValue(); Long o2 =
		 * e2.getValue(); return o1.compareTo(o2); } };
		 */
		
		
			Comparator<Map.Entry<String, Long>> valueComparator = new Comparator<Map.Entry<String,Long>>() {
            
			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().intValue() - o1.getValue().intValue();
			}
        };


        Function<Map.Entry<String,Long>,?> key = e -> e.getKey();
        Function<Map.Entry<String,Long>,?> value = e -> e.getValue();
        BinaryOperator<?> bin =  (e1, e2) -> e2;
        Supplier<?> sup = HashMap::new;

		
		Map<?, ?> sorted =  maps
		        .entrySet()
		        .stream()
		        .sorted(valueComparator)
		        .collect(
		            Collectors.toMap(key, value, (e1, e2) -> e2, LinkedHashMap::new));
		
		
		/*
		 * maps.entrySet().stream() .sorted(Map.Entry.<String, Long>comparingByValue())
		 * 
		 * .forEach(e -> sort.put(e.getKey(), e.getValue()));
		 */
		
		for(Object s : sorted.keySet())
			System.out.println(s + " " + sorted.get(s));
		
		

	}

}
