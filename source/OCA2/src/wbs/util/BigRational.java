package wbs.util;

import java.math.BigInteger;
import java.util.Objects;

/*
 * die nachstehende klasse BigRational soll das exakte rechnen mit bruchzahlen ermöglichen.
 * das potenzieren von bruchzahlen mit ganzen zahlen soll möglich sein.
 * der kehrwert soll gebildet werden können.
 * wir wollen also dinge rechnen können wie 2/3 + 4/5, 17/6 * 32/7, ..., 1/(4/5),..., (13/16) ^ 5, ...
 * zaehler und nenner eines bruches sollen beliebig grosse ganze zahlen sein.
 * bitte beantworten sie die folgenden fragen:
 */

// was wählen wir als basisklasse?
	// -- Number

// soll die klasse ein natural ordering haben?
	// -- Ja

// falls ja: welches interface müssen wir dann implementieren? welche methode(n)? wie?
	// -- Wir implementieren interface Comparable und methode compateTo (T o)

// sollen instanzen der klasse immutable sein?
	// -- Ja

// welche felder bräuchte die klasse?

// welchen typ sollten diese felder haben?

// sollten diese felder als final deklariert werden?
	// -- Ja

// sollen wir die methoden equals() / hashCode() überschreiben? falls ja: wie?
	// - Ja

// welche sonstigen methoden von Object sollten überschrieben werden?
	// -- toString()

// welche methoden und konstruktoren sollte die klasse anbieten?

// welche typen sollten die parameter der methoden / konstruktoren haben?

// was sollte der return-typ der methoden sein?

// welche der methoden sollten static sein, welche nicht?

// welche exceptions sollten die methoden / konstruktoren ggf deklarieren?

// sollten brüche intern immer in gekürzter form vorliegen?

public class BigRational extends Number implements Comparable<BigRational>{
	
	// TODO: spater noch andern
	private final BigInteger numerator;
	private final BigInteger denominator;
	
	// Von Number geerbte methoden

	private static final long serialVersionUID = 1L;
	
	// konstruktoren
	
	public BigRational(BigInteger num, BigInteger denom) throws ArithmeticException {
		
		// da unsere bruche immer in gekurzter form vorliegen sollen
		// mussen wir zahler und nenner durch den groessten gemeinsamen teiler dividieren
		// die klasse BigInteger bietet dazu die methode gcd() an (greatest common divisor)
		// wir mussen auch sicherstellen, das ein eventuelles vorzeichen im zahler liegt
		
		if(denom.equals(BigInteger.ZERO)) {
			throw new ArithmeticException("division by zero...");
		}
		if(!num.equals(BigInteger.ZERO)) {
			BigInteger gcd = num.gcd(denom);
			num = num.divide(gcd);
			denom = denom.divide(gcd);
			if(denom.compareTo(BigInteger.ZERO) < 0) {
				num = num.negate();
				denom = denom.negate();
			}
		} else {
			denom = BigInteger.ONE;
		}
		this.numerator = num;
		this.denominator = denom;

	}
	
	public BigRational(long num, long denom) throws ArithmeticException {
			this(BigInteger.valueOf(num), BigInteger.valueOf(denom));
	}
	
	public BigRational(BigInteger num) {
			this(num, BigInteger.ONE);
	}
	
	public BigRational(long num) {
			this(BigInteger.valueOf(num), BigInteger.ONE);
	}
	
	public BigRational add(BigRational r) {
		BigInteger b1 = this.numerator.multiply(r.denominator);
		BigInteger b2 = this.denominator.multiply(r.numerator);
		BigInteger x = b1.add(b2);
		BigInteger y = this.denominator.multiply(r.denominator);
		
		return new BigRational(x,y);
	}
	
	public BigRational substract(BigRational r) {
		return this.add(r.negate());
	}
	
	public BigRational multiply(BigRational r) {
		BigInteger b1 = numerator.multiply(r.numerator);
		BigInteger b2 = denominator.multiply(r.denominator);
		
		return new BigRational(b1,b2);
	}
	
	public BigRational divide(BigRational r) throws ArithmeticException {
		return this.multiply(r.inverse());
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(BigRational o) {
		// TODO Auto-generated method stub
		return 0;
	}

	// methoden von Objekt
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(numerator,denominator);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		boolean result = false;
		
		if(obj instanceof BigRational) {
			if(obj == this) {
				result = true;
			} else
			{
				BigRational r = (BigRational)obj;
				result = this.numerator.equals(r.numerator)&&this.denominator.equals(denominator);
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public BigRational pow(int n) throws ArithmeticException {
		//TODO

		if(n < 0 && numerator.equals(BigInteger.ZERO))
			throw new ArithmeticException("illegal operation...");
		
		BigRational result;
		if(n==0)
			result = new BigRational(1,1);
		else {
			BigInteger numerator = this.numerator;
			BigInteger denominator = this.denominator;
			for(int p = Math.abs(n); p > 1; p--) {
				numerator = numerator.multiply(this.numerator);
				denominator = denominator.multiply(this.denominator);
			}
			result = n > 0 ? new BigRational(numerator,denominator)
					: new BigRational(denominator,numerator);
		}
		
		return result;
	}
	
	public BigRational inverse() throws ArithmeticException {
		return new BigRational(denominator,numerator);
	}
	
	public static BigRational valueOf(String s)
					throws ArithmeticException, NumberFormatException {
		BigInteger numerator;
		BigInteger denominator;
		int pos = s.indexOf('/');
		if(pos < 0) {
			numerator = new BigInteger(s);
			denominator = BigInteger.ONE;
		} else {
			numerator = new BigInteger(s.substring(0, pos));
			denominator = new BigInteger(s.substring(pos + 1));
		}
		
		return new BigRational(numerator,denominator);
	}
	
	public BigRational negate() {
		return new BigRational(numerator.negate(),denominator);
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}
	
	
}
