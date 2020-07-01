package finalTest;

import java.util.Arrays;
import java.util.List;

public class Frage45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> exams = Arrays.asList("OCA","OCP");
		
		for(String s1: exams)
			for(String s2: exams)
				for(String s3: exams)
					for(String s4: exams)
						for(String s5: exams)
							for(String s6: exams)
				System.out.println(s1 + " " + s2 + s3 + " " + s3 + s5 + " " + s6);
		System.out.println();

	}

}
