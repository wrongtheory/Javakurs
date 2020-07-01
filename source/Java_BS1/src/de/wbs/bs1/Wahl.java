package de.wbs.bs1;

import java.util.concurrent.ThreadLocalRandom;

public class Wahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = {"Ralf","Helin","Youssef","Naoufel","Jürgen","Walter","Marcel","Arafat",
                "Alexander","Oleksiy","Rüdiger","Victor","Christian Meyenburg","Armin Otto",
                "Jens","Christoph","Claudia","Cristo","Michaela","Benjamin","Christian Malter"
                };

System.out.println(students.length);

int min = 0;
int max = 0;
max = students.length - 1;
int randomNum = 0;

for(int i=0;i<100;i++) {
	randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
	System.out.println(students[randomNum] + students[randomNum].valueOf(randomNum));
}



	}

}
