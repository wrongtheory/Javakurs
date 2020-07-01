package Ubungen20_05;

class C151 {
}

class C152 extends C151 {
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

class C153 extends C152 {
}

public class C15 {
	public static void main(String[] args) {
		C151 c1511 = new C153();
		C151 c1512 = new C152();
		C151 c1513 = new C151();
		System.out.println(c1511);
		System.out.println(c1512);
		System.out.println(c1513);
	}
}