package pond.goose;
import pond.shore.Bird;

public class BirdWatcherFromAfar extends Bird{
	
	public void watchBird() {
		
		Bird bird = new Bird();
		bird.floatInWater();
		System.out.println(bird.text);
		
		BirdWatcherFromAfar bwfa = new BirdWatcherFromAfar();
		bwfa.floatInWater();
		System.out.println(bwfa.text);;
		
		floatInWater();
		System.out.println(text);
	}

}
