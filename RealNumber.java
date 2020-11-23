public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if (value == 0 || other.getValue() == 0) {
      if (value != other.getValue()) {
        return false;
      }
    }

    if ((Math.abs(value - other.getValue())) >= (0.00001 * value) ||
        (Math.abs(value - other.getValue())) >= (0.00001 * other.getValue())) {
      return false;
    }
    return true;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
     double sumValue = value + other.getValue();
     RealNumber sum = new RealNumber(sumValue);
     return sum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
      double productValue = value * other.getValue();
      RealNumber product = new RealNumber(productValue);
      return product;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
      return null;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    return null;
  }
}
