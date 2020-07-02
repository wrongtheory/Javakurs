package web.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamExample3 {

	public static void main(String[] args) {
		
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		
		myList
			.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		System.out.println("============================================================");
		
		Arrays.asList("a1", "a2", "a3")
			.stream()
			.findFirst()
			.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		Stream.of("a1", "a2", "a3")
			.findFirst()
			.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		IntStream.range(1, 4)
			.forEach(System.out::println);
		System.out.println("============================================================");
		
		Arrays.stream(new int[] {1,2,3})
			.map(n -> 2 * n + 1)
			.average()
			.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		Stream.of("a1", "a2", "a3")
			.map(s -> s.substring(1))
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		IntStream.range(1, 4)
			.mapToObj(i -> "a" + i)
			.forEach(System.out::println);
		System.out.println("============================================================");
		
		Stream.of(1.0, 2.0, 3.0)
			.mapToInt(Double::intValue)
			.mapToObj(i -> "a" + i)
			.forEach(System.out::println);
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.filter(s -> {
				System.out.println("filter: " + s); 
				return true;
			})
			.forEach(s -> System.out.println("forEach: " + s));
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
			})
			.anyMatch(s -> {
				System.out.println("anyMatch: " + s);
				return s.startsWith("A");
			});
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
			})
			.filter(s -> {
				System.out.println("filter: " + s);
				return s.startsWith("A");
			})
			.forEach(s -> System.out.println("forEach: " + s));
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.filter(s -> {
				System.out.println("filter: " + s);
				return s.startsWith("a");
			})
			.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
			})
			.forEach(s -> System.out.println("forEach: " + s));
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.sorted((s1,s2) -> {
				System.out.println(s1+" : "+s2);
				return s1.compareTo(s2);
			})
			.filter(s -> {
				System.out.println("filter: " + s);
				return s.startsWith("a");
			})
			.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
			})
			.forEach(s -> System.out.println("forEach: " + s));
		System.out.println("============================================================");
		
		Stream.of("d2", "a2", "b1", "b3", "c")
			.filter(s -> {
				System.out.println("filter: " + s);
				return s.startsWith("a");
			})
			.sorted((s1,s2) -> {
				System.out.println(s1 + " : " + s2);
				return s1.compareTo(s2);
			})
			.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
			})
			.forEach(s -> System.out.println("forEach" + s));
		System.out.println("============================================================");
		
		Supplier<Stream<String>> streamSupplier = 
				() -> Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("a"));
				System.out.println(streamSupplier.get().anyMatch(s -> true));
				System.out.println(streamSupplier.get().noneMatch(s -> true));
		System.out.println("============================================================");
				
	
		PersonExample p1 = new PersonExample("Max", 18);
		PersonExample p2 = new PersonExample("Peter", 23);
		PersonExample p3 = new PersonExample("Pamela", 23);
		PersonExample p4 = new PersonExample("David", 12);
		
		List<PersonExample> persons = Arrays.asList(p1,p2,p3,p4);
		
		
		List<PersonExample> filtered = 
				persons
					.stream()
					.filter(p -> p.name.startsWith("P"))
					.collect(Collectors.toList());
		System.out.println(filtered);
		System.out.println("============================================================");
		
		Map<Integer, List<PersonExample>> personsAge = persons
				.stream()
				.collect(Collectors.groupingBy(p -> p.age));
		personsAge
			.forEach((age,p) -> System.out.println(age + " : " + p));
		System.out.println("============================================================");
		
		Double averageAge = persons
				.stream()
				.collect(Collectors.averagingInt(p -> p.age));
		System.out.println(averageAge);
		System.out.println("============================================================");
		
		IntSummaryStatistics ageSumarry = 
				persons
					.stream()
					.collect(Collectors.summarizingInt(p -> p.age));
		System.out.println(ageSumarry);
		System.out.println("============================================================");
		
		String phrase = persons
				.stream()
				.filter(p -> p.age >= 18)
				.map(p -> p.name)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
		System.out.println(phrase);
		System.out.println("============================================================");
		
		Map<Integer, String> map = persons
				.stream()
				.collect(Collectors.toMap(
							p -> p.age,
							p -> p.name,
							(name1, name2) -> name1 + ";" +name2));
				System.out.println(map);
		System.out.println("============================================================");
		
		Collector<PersonExample, StringJoiner, String> personNameCollector =
			    Collector.of(
			        () -> new StringJoiner(" | "),          // supplier
			        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
			        (j1, j2) -> j1.merge(j2),               // combiner
			        StringJoiner::toString);                // finisher
		String names = persons
				.stream()
				.collect(personNameCollector);
		System.out.println(names);
		System.out.println("============================================================");
		
		List<Foo> foos = new ArrayList<>();
		
		IntStream
			.range(1, 4)
			.forEach(i -> foos.add(new Foo("Foo" + i)));
		
		foos.forEach(f ->
				IntStream
					.range(1, 4)
					.forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));
				
		foos.stream()
			.flatMap(f -> f.bars.stream())
			.forEach(b -> System.out.println(b.name));
		System.out.println("============================================================");
		
		IntStream.range(1, 4)
			.mapToObj(i -> new Foo("Foo" + i))
			.peek(f -> IntStream.range(1, 4)
					.mapToObj(i -> new Bar("Bar" + i + " <- " + f.name))
					.forEach(f.bars::add))
			.flatMap(f -> f.bars.stream())
			.forEach(b -> System.out.println(b.name));
		System.out.println("============================================================");
		
		Outer outer = new Outer();
		if(outer != null && outer.nested != null && outer.nested.inner != null)
			System.out.println(outer.nested.inner.foo);
		
		Optional.of(new Outer())
		.flatMap(o -> Optional.ofNullable(o.nested))
		.flatMap(n -> Optional.ofNullable(n.inner))
		.flatMap(i -> Optional.ofNullable(i.foo))
		.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		persons
			.stream()
			.reduce((x1, x2) -> x1.age > x2.age ? x1 : x2)
			.ifPresent(System.out::println);
		System.out.println("============================================================");
		
		PersonExample result = 
				persons
					.stream()
					.reduce(new PersonExample("",0), (q1,q2) -> {
						q1.age += q2.age;
						q1.name += q2.name;
						return q1;
					});
		
		
		System.out.println(result.name + " " + result.age);
		System.out.println("============================================================");
		
		Integer ageSum = persons
				.stream()
				.reduce(0, (sum,pum) -> sum+=pum.age, (sum1, sum2) -> sum1 + sum2);
		System.out.println(ageSum);
		System.out.println("============================================================");
		
		Integer ageSum2 = persons
				.parallelStream()
				.reduce(0,
						(v,n) -> {
							System.out.printf("acumulator: sum=%s; person=%s\n", v,n);
							return v+=n.age;
						},
						(st1,st2) -> {
							System.out.printf("combiner: sum1=%s; sum2=%s\n",st1,st2);
							return st1+st2;
						});
		System.out.println("============================================================");
		
		List<PersonExample> per = Arrays.asList(
				new PersonExample("Max", 18),
				new PersonExample("Peter", 23),
				new PersonExample("Pamela", 23),
				new PersonExample("David", 12));
		
				
		per
			.parallelStream()
			.reduce(0, 
					(sg,pg) -> {
						System.out.format("accumulator: sum=%s; person=%s [%s]\n",
								sg,pg,Thread.currentThread().getName());
						return sg+=pg.age;
					},
					(sum1, sum2) -> {
						System.out.format("combiner: sum1=%s sum2=%s [%s]\n",
								sum1,sum2,Thread.currentThread().getName());
						return sum1+sum2;
					});

	}
	
}


class Outer {
	Nested nested;
}

class Nested {
	Inner inner;
}

class Inner {
	String foo;
}


class Foo {
	String name;
	
	List<Bar> bars = new ArrayList<>();
	
	Foo(String name){
		this.name = name;
	}
}

class Bar {
	String name;
	
	Bar(String name){
		this.name = name;
	}
}


class PersonExample{
	
	String name;
	int age;
	
	public PersonExample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
