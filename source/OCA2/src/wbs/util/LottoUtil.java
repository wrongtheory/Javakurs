package wbs.util;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoUtil {
	
	
	public static NavigableSet<Integer> createTipp1(){
		NavigableSet<Integer> zahlen = new TreeSet<>();
		for(int i=1;i<=6;i++)
			zahlen.add(new Random().nextInt(49)+1);
		return zahlen;
	}
	
	public static int[] createTipp2() {
		return null;
	}
	
	public static ArrayList<Integer> createTipp3(){
		return null;
	}
	
	public static BitSet createTipp4() {

			
		return null;
	}
	
	public static long createTipp5() {
		
		
		return 0;
	}

}
