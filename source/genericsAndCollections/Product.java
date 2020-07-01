package genericsAndCollections;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Product)) {
			return false;
		}
		
		Product other = (Product) obj;
		return this.id == other.id;
	}
	
	public int compareTo(Product obj) {
		return this.name.compareTo(obj.name);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.name = "Hallo";
		p2.name = "Hallo";
		
		
		System.out.println(p1.name.compareTo(p2.name));
		
	}

}
