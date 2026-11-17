package irvine.oeis.a398;

import irvine.oeis.a003.A003030;
import irvine.oeis.a401.A401321;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A398815 Number of strongly connected digraphs on n labeled nodes that are reducible as a flow graph rooted at no node.
 * @author Gregory Morse
 */
public class A398815 extends PairTransformSequence {

  /** Construct the sequence. */
  public A398815() {
    super(1, new A003030(), new A401321(), (n, u, v) -> u.subtract(v));
  }
}
