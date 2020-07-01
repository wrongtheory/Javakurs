package Capitel5Tests;

public class Rodent {
	protected static Integer chew() throws Exception {
		System.out.println("Rodent");
		return 1;
	}

}


class Beaver extends Rodent {
	public  Number chew() throws RuntimeException {
		System.out.println("Beaver");
		return 2;
	}
}