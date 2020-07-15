package JavaIO.tests;

public class A23 {

	  public static void main(String[] args) {

	    int i = Integer.parseInt(args[0]);

	    if (i < 0) {

	      i = -i;

	    }

	    assert (i >= 0) : "...";

	  }

	}