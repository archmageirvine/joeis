package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399044 Total number of connected components in all induced subgraphs of the n X n rook graph.
 * @author Gregory Morse
 */
public class A399044 extends A399043 {
  private int mN = -1;

  /** Construct the sequence. */
  public A399044() {
    super(0);
  }

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
