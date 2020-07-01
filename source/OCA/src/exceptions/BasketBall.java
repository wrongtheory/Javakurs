package exceptions;

public class BasketBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(1);
			throw new ClassCastException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(2);
		} catch (Throwable e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
