package irvine.oeis.a399;

import irvine.oeis.recur.PeriodicSequence;

/**
 * A399797 Nontrivial cycle starting with 5 under the map: x -&gt; A063655(x) if x is composite, x -&gt; A072055(m) if x is the m-th prime.
 * @author Sean A. Irvine
 */
public class A399797 extends PeriodicSequence {

  /** Construct the sequence. */
  public A399797() {
    super(5, 11, 23, 47, 95, 24, 10, 7, 15, 8, 6);
  }
}

