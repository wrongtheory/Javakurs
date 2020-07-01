package advancedClassDesign;

@FunctionalInterface interface Study {
	abstract int learn (String subject, int duration);
}

class BiologyMaterial implements Study {
	@Override
	public int learn(String subject, int duration) {
		if(subject == null)
			return duration;
		else
			return duration + 1;
	}
}

public class Scientist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final Study s = (a,b) -> { return a == null ? b : b+1;};
			System.out.println(s.learn(args[0],Integer.parseInt(args[1])));
	}

}
