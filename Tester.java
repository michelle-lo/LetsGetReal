public class Tester {
  public static void main (String[] args) {
    System.out.println("----RealNumber----");
    System.out.println("\nEquals()\n");
    RealNumber a1 = new RealNumber(0);
    RealNumber b1 = new RealNumber(0.00001);
    print(a1.equals(b1), false);
    RealNumber c1 = new RealNumber(10000);
    RealNumber d1 = new RealNumber(10000.01);
    print(c1.equals(d1), true);
    System.out.println("\nadd()\n");
    RealNumber e1 = new RealNumber(c1.add(d1).getValue());
    RealNumber f1 = new RealNumber(20000.01);
    print(e1.equals(f1), true);
    RealNumber g1 = new RealNumber(-10.0);
    RealNumber h1 = new RealNumber(9.0);
    print(g1.add(h1).getValue(), -1.0);
    



  }

  public static void print (Object actual, Object expected) {
    String str = "";
    str += "Actual: " + actual + "\n";
    str += "Expected: " + expected + "\n";
    if (actual.equals(expected)) {
      str += "Success! :)\n";
    } else {
      str += "Fail! :(\n";
    }
    System.out.println(str);
  }

}
