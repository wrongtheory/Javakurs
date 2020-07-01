import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	DateTimeFormatter local = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
	
	local = DateTimeFormatter.ofPattern("dd.MM.yyyy - a hh:mm:ss");
	LocalDateTime dateTime = LocalDateTime.parse("27.04.2020 - AM 10:33:24", local);
	
	
	
	//System.out.println(dateTime.format(local));
	System.out.println(dateTime);
	System.out.println(Locale.getDefault());
	
	//showSortedSystemProperties();

	}
	
	private static void showSortedSystemProperties() {
	    Map<String, String> mapProp = System.getProperties()
	    		.entrySet()
	    		.stream()
	    		.collect(
	    				Collectors.toMap(
	    						e -> (String) e.getKey(),
	    						e -> (String) e.getValue()
	    						)
	    				)
	    		;
	    
	    System.out.println("--System-Properties----------------------------------");
		TreeMap<String, String> treeMap = new TreeMap<>(mapProp);
		treeMap.forEach((key, val) -> System.out.println(String.format("%-30s - %s", key, val)));
	    System.out.println("/--System-Properties---------------------------------");		
	}


}
