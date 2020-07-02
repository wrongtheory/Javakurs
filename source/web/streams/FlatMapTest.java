package web.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {


    public void flatMap() {
        List<Developer> team = new ArrayList<>();
        Developer polyglot = new Developer("esoteric");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("javascript");

        team.add(polyglot);
        team.add(busy);

        List<String> teamLanguages = team.stream().
                map(d -> d.getLanguages()).
                flatMap(l -> l.stream()).
                collect(Collectors.toList());
        
        teamLanguages.forEach(System.out::println);
        
    }
    public static void main(String[] args) {
		FlatMapTest f = new FlatMapTest();
		f.flatMap();
	}
}