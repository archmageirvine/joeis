package irvine.oeis.a400;

import irvine.oeis.StretchedRiordanTriangle;

/**
 * A400858 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A400858 extends StretchedRiordanTriangle {

  /** Construct the sequence. */
  public A400858() {
    super("1/(1-x)", "x/(1-x-x^2)", 2);
  }
}
