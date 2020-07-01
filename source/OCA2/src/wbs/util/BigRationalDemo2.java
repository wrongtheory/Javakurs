package wbs.util;


import java.util.Arrays;

public class BigRationalDemo2 {
	
	// wir bestucken ein array mit einigen strings
	// wir iterieren uber alle elemente des arrays und wandeln jeden
	// string in ein BigRational - objekt um und geben dieses objekt aus
	// wir fangen alle moglichen exceptions ab
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] breucheAlsStrings = {"48/16", "blabla", "8/-10","6/0","7","abc/3","-42/3", "0/6","12/"};
		BigRational r;
		for(String s: breucheAlsStrings) {
			try {
				r = BigRational.valueOf(s);
				System.out.println(s + " => " + r);
			} catch(NumberFormatException e) {
				System.out.println("NumberFormatException for string: " + s);
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException for string: " + s);
			}
		}
		
		System.out.println("grundrechenarten");
		
		BigRational b1 = new BigRational(2,3);
		BigRational b2 = new BigRational(3,4);
		
		System.out.println(b1 + " + " + b2 + " = " + b1.add(b2));
		System.out.println(b1 + " - " + b2 + " = " + b1.substract(b2));
		System.out.println(b1 + " * " + b2 + " = " + b1.multiply(b2));
		System.out.println(b1 + " / " + b2 + " = " + b1.divide(b2));
		
		System.out.println("---potenzieren---");
		
		BigRational r31 = new BigRational(2,3);
		BigRational r32 = new BigRational(0);
		int exponent1 = 4;
		int exponent2 = -4;
		int exponent3 = 0;
		
		System.out.println(r31 + " ^ " + exponent1 + " = " + r31.pow(exponent1));
		System.out.println(r31 + " ^ " + exponent2 + " = " + r31.pow(exponent2));
		System.out.println(r31 + " ^ " + exponent3 + " = " + r31.pow(exponent3));
		
		
		try {
			System.out.println(r31 + " ^ " + exponent2 + " = " + r32.pow(exponent2));
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	
}




/*
 * add(int index, E element) addAll(int index, Collection<? extends E> c)
 * get(int index) indexOf(Object o) lastIndexOf(Object o) listIterator()
 * listIterator(int index) remove(int index) replaceAll(UnaryOperator<E>
 * operator) set(int index, E element) sort(Comparator<? super E> c) subList(int
 * fromIndex, int toIndex)
 */
