package mothdosAndEncapsulation;

public class Dools {
	
	private final int u=1;
	
	Short k;
	short f;
	public final int i=1;
	final protected int j = 2;
	
	
	public void nested() { nested(2,true); }
	
	public int nested(int level, boolean height) {return nested(level);}
	
	public int nested(int level) {return level+1;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new Dools();
		
		//System.out.println(new Dools().nested());
	}

}
