package Capitel5Tests;

class Arthropod{
	public void printName(double input) {
		System.out.println("Arthropod");
	}
}

public class Spider extends Arthropod{

	public void printName(int input) {
		System.out.println("Spider");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider spider = new Spider();
		spider.printName(4);
		spider.printName(9.0);
	}

}


class AA{}

abstract class BB extends AA{}