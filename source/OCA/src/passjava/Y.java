package passjava;

class AA {}

class BB extends AA {}

class CC extends BB {}

class X {
	BB getB() {return new BB();}
}

public class Y extends X {
	
	
	//protected BB getB() {return new CC();} // kompiliert
	// CC getB() {return new CC();} // kompiliert
	
	//public CC getB() { return new BB(); } // error - cannot convert from BB to CC
	
	// AA getB() { return AA(); } // error - The method AA() is undefined for the type Y

}
