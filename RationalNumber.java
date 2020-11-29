public class RationalNumber extends Number
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else if (deno < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    int nume = denominator;
    int deno = numerator;
    RationalNumber reciprocal = new RationalNumber(nume, deno);
    return reciprocal;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;

  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    a = Math.abs(a);
    b = Math.abs(b);
    int origA = a;
    int origB = b;
    if (a < b) {
      a = origB;
      b = origA;
    }
    if (b == 0) {
      return a;
    }

    int r = -1;
    while (r != 0){
      r = a % b;
      if (r != 0) {
        a = b;
        b = r;
      }
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int x = gcd(numerator, denominator);
    numerator = numerator / x;
    denominator = denominator / x;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int otherNume = other.getNumerator();
    int otherDeno = other.getDenominator();
    int prodNume = numerator * otherNume;
    int prodDeno = denominator * otherDeno;
    RationalNumber product = new RationalNumber(prodNume, prodDeno);
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int otherNume = other.getNumerator();
    int otherDeno = other.getDenominator();
    RationalNumber sum = new RationalNumber((numerator * otherDeno) + (denominator * otherNume), denominator * otherDeno);
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int otherNume = other.getNumerator();
    int otherDeno = other.getDenominator();
    RationalNumber diff = new RationalNumber((numerator * otherDeno) - (denominator * otherNume), denominator * otherDeno);
    return diff;
  }
}
