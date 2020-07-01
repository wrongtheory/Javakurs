package Capitel5Tests;

interface CanHop {}

public class Frog implements CanHop{
public static void main(String[] args) {
			Frog frog = new TurtleFrog(); // ok
			TurtleFrog frog2 = new TurtleFrog(); // ok
			Brazilian frog3 = new TurtleFrog(); // not ok
			CanHop frog4 = new TurtleFrog(); // ok
			Object frog5 = new TurtleFrog(); // ok
			Long frog6 = new TurtleFrog(); // not ok
	}
}


class Brazilian extends Frog{}
class TurtleFrog extends Frog{}