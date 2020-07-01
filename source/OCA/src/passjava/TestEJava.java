package passjava;

class Programmer{
	void print() {
		System.out.println("Programmer - WooJ");
	}
}

class Author extends Programmer {
	void print() {
		System.out.println("Author - WooJ");
	}
}

public class TestEJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer a = new Programmer();
		Programmer b = new Author();
		Author c = new Author();
		
		// Author d = new Programmer(); // does not compile
		// Author e = (Author)new Programmer(); // ClassCastException
		// Programmer f = (Author)new Programmer(); // ClassCastException
		
		a.print();
		b.print();
		c.print();
		
		
	}

}
