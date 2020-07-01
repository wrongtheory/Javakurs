package generics.com.basicstrong;


interface Iinterface<T>{}

interface Iinterface2 {}

class class2<T> implements Iinterface<T>{}

public class Class1<T> extends class2<T> implements Iinterface<T> {

}



