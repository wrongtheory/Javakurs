package genericsAndCollections2;

import JavaIO.Animal;

@FunctionalInterface
interface Sprint{
	public void sprint(Animal animal);
}

class Tiger implements Sprint {
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast!" + animal.toString());
	}
}

public class FirstFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


@FunctionalInterface
interface Run2 extends Sprint {}

@FunctionalInterface
interface SprintDaster extends Sprint {
	public void sprint(Animal animal);
}

@FunctionalInterface
interface Skip extends Sprint {
	public default int getHopCount(Animal animal) {
		return 10;
	}
	
	public static void skip(int speed) {}
}

interface T{}

