package JavaIO.tests;

public class Zauderer {

	  @Override

	  public int hashCode() {

	    return 1;

	  }

	 

	  @Override

	  public boolean equals(Object obj) {

	    return obj != null ? obj.equals(this) : false;

	  }

	 

	  public static void main(String[] args) {

	    Zauderer zauderer = new Zauderer();

	    System.out.println(zauderer.equals("bin ich's oder bin ich's nicht..."));

	    System.out.println(zauderer.equals(zauderer));

	  }

	}