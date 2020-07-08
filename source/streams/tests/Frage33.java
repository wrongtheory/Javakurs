package streams.tests;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Ballot {
	private String name;
	private int judgeNumber;
	private int score;
	
	public Ballot(String name, int judgeNumber, int score) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.judgeNumber = judgeNumber;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJudgeNumber() {
		return judgeNumber;
	}

	public void setJudgeNumber(int judgeNumber) {
		this.judgeNumber = judgeNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Ballot [name=" + name + ", judgeNumber=" + judgeNumber + ", score=" + score + "]";
	}
	
	
}

public class Frage33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Ballot> ballots = Stream.of(
				new Ballot("Mario", 1, 10),
				new Ballot("Chirstina", 1, 8),
				new Ballot("Mario", 2, 9),
				new Ballot("Chirstina", 2, 8)
				);
		
		Map<String, Integer> scores = ballots.collect(Collectors.groupingBy(Ballot::getName,Collectors.summingInt(Ballot::getScore)));
		System.out.println(scores.get("Mario"));
				

	}

}
