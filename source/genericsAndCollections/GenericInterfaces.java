package genericsAndCollections;

interface Shippable<T>{
	void ship(T t);
}


//class ShippableRobotCrate implements Shippable<Robot>{
//	public void ship(Robot t) {}
//}


class ShippableAbstractCrate<T> implements
Shippable<T>{
	public void ship(T t) {}
}

class ShippableCrate implements Shippable {
	public void ship(Object t) {}
}

public class GenericInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
