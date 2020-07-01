package lambdas_ubungen;

import java.util.function.Function;

public class C2 {
	public static void main(String[] args) {
		Function<String, Integer> f = (s,i) -> s.length();
	}
}