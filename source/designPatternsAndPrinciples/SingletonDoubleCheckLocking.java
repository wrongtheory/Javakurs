package designPatternsAndPrinciples;

public class SingletonDoubleCheckLocking {
	
	private static volatile SingletonDoubleCheckLocking instance;
	
	public SingletonDoubleCheckLocking getInstance() {
		if(instance == null) {
			synchronized(SingletonDoubleCheckLocking.class) {
				if(instance==null) {
					instance = new SingletonDoubleCheckLocking();
				}
			}
		}
		
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
