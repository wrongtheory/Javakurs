package de.wbs.bs1.tag4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class TemperaturProgramm {
	
	public static void main(String[] args) {
		
		/* 
		 * Schreibt ein Programm, dass die Höchst und Tiefsttemperatur sowie den Mittelwert
		 * des Tages ermittelt und ausgibt
		 */

		int [] temps = {12,14,15,16,18,3,5};
		int[][] dayTemps = new int[2][];
		dayTemps[0] = temps;
		dayTemps[1] = new int [] {23,44,1,12,26,30,45,10,0,1};
		

		int maxNumberDay1 = Arrays.stream(dayTemps[0]).max().getAsInt();
		int minNumberDay1 = Arrays.stream(dayTemps[0]).min().getAsInt();
		Double averageDay1 = Arrays.stream(dayTemps[0]).average().getAsDouble();
		
		System.out.println(maxNumberDay1);
		System.out.println(minNumberDay1);
		System.out.println((int)Math.floor(averageDay1));
		
		int maxNumberDay2 = Arrays.stream(dayTemps[1]).max().getAsInt();
		int minNumberDay2 = Arrays.stream(dayTemps[1]).min().getAsInt();
		Double averageDay2 = Arrays.stream(dayTemps[1]).average().getAsDouble();
		
		System.out.println(maxNumberDay2);
		System.out.println(minNumberDay2);
		System.out.println((int)Math.floor(averageDay2));
	}


	
}
