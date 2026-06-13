package irvine.oeis.a396;

import irvine.oeis.a395.A395365;

/**
 * A396653 Consider the 0-indexed spiral on a hexagonal grid, as in A395365. Three players, Red, Green and Blue, take turns and place knights at the smallest unoccupied cell not attacked by an opposing knight. Sequence lists cells occupied by Red knights.
 * @author Sean A. Irvine
 */
public class A396653 extends A395365 {

  /** Construct the sequence. */
  public A396653() {
    super(3, 0);
  }
}
