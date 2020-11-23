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
