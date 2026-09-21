package irvine.oeis.a399;

import irvine.oeis.FiniteSequence;

/**
 * A399602 The first 25 prime numbers (from 2 to 97) arranged row by row into a 5 X 5 balanced quasi-magic square. Every outer row and column sums to 215, while the four lines passing through the central number 2 (central row, central column, and both diagonals) sum exactly to 200.
 * @author Sean A. Irvine
 */
public class A399602 extends FiniteSequence {

  /** Construct the sequence. */
  public A399602() {
    super(1, FINITE, 7, 47, 89, 29, 43, 11, 53, 31, 59, 61, 97, 79, 2, 19, 3, 17, 13, 73, 71, 41, 83, 23, 5, 37, 67);
  }
}
