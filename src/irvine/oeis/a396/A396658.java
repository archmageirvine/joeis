package irvine.oeis.a396;

import irvine.oeis.a395.A395365;

/**
 * A396658 Consider the 0-indexed spiral on a hexagonal grid, as in A395365. Three players, Red, Green and Blue, take turns and place knights at the smallest unoccupied cell not attacked by an opposing knight, where Red is only opposed by Blue, Green by Red and Blue by Green. Sequence lists cells occupied by Blue knights.
 * @author Sean A. Irvine
 */
public class A396658 extends A395365 {

  /** Construct the sequence. */
  public A396658() {
    super(3, 2, new byte[] {0b010, 0b100, 0b001});
  }
}
