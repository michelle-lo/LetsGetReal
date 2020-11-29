public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if (equals(other.getValue())) {
      return 0;
    }
    if (getValue() < other.getValue()) {
      return -1;
    } else {
      return 1;
    }
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if (getValue() == 0 && other.getValue() == 0) {
      return true;
    }

    if ((Math.abs(getValue() - other.getValue())) >= (0.00001 * getValue()) ||
        (Math.abs(getValue() - other.getValue())) >= (0.00001 * other.getValue())) {
      return false;
    }
    return true;
  }
}

/*
1. done. Restructure your RealNumber and RationalNumber classes to extend an abstract Number class.
a. done. You must move equals to the Number class. (using getValue() )
b. done. You must write a compareTo() method in your Number class. (using getValue() )
c. done. Your constructors may need to be modified since there is no parameterized superclass constructor to call.
d. done. Your RealNumber class will just use the inherited .equals() method.
e. done. Your rationalNumber class should have a .equals(RationalNumber) method.
f. Your RationalNumber toString method should account for denominator of 1, OR a numerator of 0. It should show the whole number when that happens.
g. All other methods should stay the same.
*/