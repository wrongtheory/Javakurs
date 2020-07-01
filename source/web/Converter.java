package web;


@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
