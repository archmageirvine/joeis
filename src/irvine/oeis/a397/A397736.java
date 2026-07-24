package irvine.oeis.a397;

import irvine.oeis.gf.GfSequence;

/**
 * A397736 a(n) is the number of Motzkin paths of length n in which level steps on even levels come in 2 colors.
 * @author Sean A. Irvine
 */
public class A397736 extends GfSequence {

  /** Construct the sequence. */
  public A397736() {
    super(0, "(1 - 3*x + 2*x^2 - sqrt((1 - x)*(1 - 2*x)*(1 - 3*x - 2*x^2)))/(2*(1 - 2*x)*x^2)");
  }
}

