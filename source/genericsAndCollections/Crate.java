package genericsAndCollections;

public class Crate<T> {
	
	private T contents;
	
	public T emptyCreate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
