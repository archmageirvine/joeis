package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401646 Total number of symmetric peaks over all Dyck paths of semilength n.
 * @author Sean A. Irvine
 */
public class A401646 extends GfSequence {

  /** Construct the sequence. */
  public A401646() {
    super(0, "(1 + (5*x-1)/((1-x)*sqrt(1 - 4*x)))/2");
  }
}

