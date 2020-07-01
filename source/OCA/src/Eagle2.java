
class Bird2 {
   Bird2(){ }
}
public class Eagle2 extends Bird2 {
  public String name;
  public Eagle2(String name){
    this.name = name;
  }
  public static void main(String[] args) {
    System.out.println(new Eagle2("Bald Eagle").name);
  }
}