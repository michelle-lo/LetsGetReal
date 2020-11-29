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
    RationalNumber zero = new RationalNumber(1, 0);
    print(zero.equals(a1), true);

    System.out.println("add()\n");
    RealNumber e1 = new RealNumber(c1.add(d1).getValue());
    RealNumber f1 = new RealNumber(20000.01);
    print(e1.equals(f1), true);
    RealNumber g1 = new RealNumber(-10.0);
    RealNumber h1 = new RealNumber(9.0);
    print(g1.add(h1).getValue(), -1.0);

    System.out.println("multiply()\n");
    print(g1.multiply(h1).getValue(), -90.0);
    print(c1.multiply(a1).getValue(), 0.0);
    RealNumber i1 = new RealNumber(1.0);
    print(d1.multiply(i1).getValue(), 10000.01);

    System.out.println("divide()\n");
    RealNumber j1 = new RealNumber(2.0);
    print(b1.divide(b1).getValue(), 1.0);
    print(i1.divide(j1).getValue(), 0.5);

    System.out.println("subtract()\n");
    print(d1.subtract(c1).getValue(), 10000.01 - 10000);
    print(h1.subtract(g1).getValue(), 19.0);

    System.out.println("\n----RationalNumber----\n");
    System.out.println("getValue()\n");
    RationalNumber a2 = new RationalNumber(1, 2);
    //RationalNumber zero = new RationalNumber(1, 0);
    print(a2.getValue(), 0.5);
    print(zero.getValue(), 0.0);

    System.out.println("getNumerator & getDenominator()\n");
    RationalNumber neg = new RationalNumber(9, -1);
    print(neg.getNumerator(), -9);
    print(neg.getDenominator(), 1);
    print(zero.getNumerator(), 0);
    print(zero.getDenominator(), 1);

    System.out.println("Reciprocal()\n");
    print(a2.reciprocal().getValue(), 2.0);
    print(zero.getNumerator(), 0);
    print(zero.reciprocal().getNumerator(), 0); // a rationalnum of (1/0), the reciprocal, turns into (0/1)
    print(zero.reciprocal().getDenominator(), 1);
    print(neg.reciprocal().getNumerator(), -1);
    print(neg.reciprocal().getDenominator(), 9);
    print(neg.reciprocal().getValue(), -1.0/9.0);

    System.out.println("reduce()\n");
    RationalNumber b2 = new RationalNumber(2, 4);
    print(b2.toString(), "1/2");
    RationalNumber c2 = new RationalNumber(4100, 5100);
    print(c2.toString(), "41/51");

    System.out.println("equals()\n");
    RationalNumber d2 = new RationalNumber(401800, 499800); //num/den * 98/98
    print(c2.equals(d2), true);
    print(zero.equals(neg), false);

    System.out.println("multiply()\n");
    print(zero.multiply(neg).toString(), "0/1");
    print(b2.multiply(c2).toString(), "41/102");

    System.out.println("divide()\n");
    RationalNumber e2 = new RationalNumber(5, 2);
    RationalNumber two = new RationalNumber(2, 1);
    print(e2.divide(two).toString(), "5/4");
    print(e2.divide(zero).toString(), "0/1");
    System.out.println("add()\n");
    RationalNumber f2 = new RationalNumber(6, 8);
    print(f2.add(a2).toString(), "5/4");

    System.out.println("subtract()\n");
    print(a2.subtract(f2).toString(), "-1/4");
    print(f2.subtract(a2).toString(), "1/4");

    System.out.println("----Number----\n");
    System.out.println("----compareTo----\n");
    print(a1.compareTo(a2), -1); // 0, 1/2
    print(a1.compareTo(b1), -1); //0, 0.0001
    print(b1.compareTo(a1), 1);

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
