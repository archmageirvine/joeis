package irvine.oeis.a396;

import irvine.oeis.gf.GfSequence;

/**
 * A396508 Number of palindromic special Motzkin paths of weight n.
 * @author Sean A. Irvine
 */
public class A396508 extends GfSequence {

  /** Construct the sequence. */
  public A396508() {
    super(1, "x/(1-x^2)*sqrt((1-x^2)/(1-5*x^2)) + (1+x)/(2*(1+x^2))*(sqrt((1-x^2)/(1-5*x^2))-1)");
  }
}
