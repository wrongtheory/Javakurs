package designPatternsAndPrinciples;

public class SingletonLazyInstantiation {

	private static SingletonLazyInstantiation instance;
	
	private SingletonLazyInstantiation() {}
	
	public static synchronized SingletonLazyInstantiation getInstance() {
		if(instance == null)
			instance = new SingletonLazyInstantiation();
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
