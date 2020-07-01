package de.wbs.bs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.Stream;

public class Wahl2 {

	private static List<String> person = Arrays.asList("Ralf", "Helin", "Youssef", "Naoufel", "Jürgen", "Walter",
			"Marcel", "Arafat", "Alexander", "Oleksiy", "Rüdiger", "Victor", "Christian Meyenburg", "Armin Otto",
			"Jens", "Christoph", "Claudia", "Cristo", "Michaela", "Benjamin", "Christian Malter");

	private static int[] ids = new int[person.size()];
	private static int j = 0;
	private static Random random = new Random();

	private static String[] students = { "Ralf", "Helin", "Youssef", "Naoufel", "Jürgen", "Walter", "Marcel", "Arafat",
			"Alexander", "Oleksiy", "Rüdiger", "Victor", "Christian Meyenburg", "Armin Otto", "Jens", "Christoph",
			"Claudia", "Cristo", "Michaela", "Benjamin", "Christian Malter" };

	public static void main(String[] args) {

		// System.out.println(random.nextInt(person.size()));
		// System.out.println(person.get(random.nextInt(person.size())));
		// System.out.println(person.indexOf(person.get(random.nextInt(person.size()))));

		// System.out.println(person);

		// for(int i: ids)
		// System.out.println(i);

		// int count = person.indexOf(random.nextInt(person.size()));
		// System.out.println(count);

		while (j < 20) {
			int count = person.indexOf(person.get(random.nextInt(person.size())));
			System.out.println(person.get(count) + " " + count);
			ids[count]++;
			// System.out.println(count);
			// System.out.println(ids[count]);
			j++;
		}

		
		/*
		 * int aux=0;
		 * 
		 * for(int i=0;i<ids.length;i++) { for(int j=i;j<ids.length;j++) {
		 * if(ids[i]<ids[j]) { aux = ids[i]; ids[i] = ids[j]; ids[j] = aux; } }
		 * 
		 * }
		 */

		//Collections.sort(person);
		
		for (int i = 0; i < person.size(); i++)
			System.out.println(person.get(i) + " occured " + ids[i] + " times");

		// int[] ids = new int[] {4,6,8,2,0,1};

		for (int i = 0; i < ids.length; i++)
			System.out.println(ids[i]);

	}

}
