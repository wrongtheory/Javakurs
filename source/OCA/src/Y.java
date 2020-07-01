
class X {
  X(int i) {}
  void one() {}
}
class Y extends X {
  private Y()
 {super(1);}
  public static void main(String[] args) {
    new Y().one();
  }
}
