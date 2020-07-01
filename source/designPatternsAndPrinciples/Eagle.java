package designPatternsAndPrinciples;

import java.util.List;

interface Fly {
	public int getWingSpan() throws Exception;
	public static final int MAX_SPEED = 100;
	
	public default void land() {
		System.out.println("Animal is landing");
	}
	
	public static double calculateSpeed(float distance, double time) {
		return distance/time;
	}
}

public class Eagle implements Fly{
	
	public int getWingSpan() {
		return 15;
	}
	
	public void land() {
		System.out.println("Eagle is diving fast");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eagle eagle = new Eagle();
		eagle.getWingSpan();
		eagle.land();
		Fly.calculateSpeed(100, 100);

	}

}

//======================================================================



interface Walk {
	boolean isQuadruped();
	abstract double getMaxSpeed();
}


interface Run extends Walk {
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}


class Lion implements Run {
	public boolean isQuadruped() {
		return true;
	}
	
	public boolean canHuntWhileRunning() {
		return true;
	}
	
	public double getMaxSpeed() {
		return 100;
	}
}



//==============================================================================



class Animal {}
class Tortoise extends Animal {}
class Hare extends Animal {}

interface RaceManager {
	public Animal getWinner(List<Animal> animals);
}


class DummyRaceManager implements RaceManager {

	@Override
	public Animal getWinner(List<Animal> animals) {
		return animals==null || animals.size()==0 ? null : animals.get(0);
	}
	
}

