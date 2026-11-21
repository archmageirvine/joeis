package irvine.oeis.a400;

import irvine.oeis.StretchedRiordanTriangle;

/**
 * A400858 Irregular triangle read by rows: the stretched Riordan array ( 1/(1 - x), x^2/(1 - x - x^2) ).
 * @author Sean A. Irvine
 */
public class A400858 extends StretchedRiordanTriangle {

  /** Construct the sequence. */
  public A400858() {
    super("1/(1-x)", "x/(1-x-x^2)", 2);
  }
}
