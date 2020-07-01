package advancedClassDesign;

public final class Bottle2 {
private final int size = 14;
final protected class Insert {
	private final int size = 25;
	public final int getSize() {
		return Bottle2.this.size;
	}
}

final Insert insert = new Insert();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Bottle2().insert.getSize());
	}

}
