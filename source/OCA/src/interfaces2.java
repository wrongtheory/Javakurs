
interface inter{
	public abstract void meth();
}


public class interfaces2 implements inter{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter i = new interfaces2();
		i.meth();

	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println("Hello Streng Java");
	}

}
