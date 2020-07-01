package tag16;

import java.util.ArrayList;
import java.util.List;

public class Vergleichen extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste = new ArrayList<>();
		
		liste.add("Brend");
		liste.add("Horst");
		liste.add("Albert");
		liste.add("Christian");
		liste.add("Katrin");
		liste.add("Johanna");
		liste.add("Silvia");
		
		
		for(String name: liste)
			System.out.println(name);

	}

}
