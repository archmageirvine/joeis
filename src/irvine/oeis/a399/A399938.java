package irvine.oeis.a399;

import irvine.oeis.InverseSequence;

/**
 * A399938 Smallest k such that A399937(k) = n, or -1 if no such k exists.
 * @author Sean
 */
public class A399938 extends InverseSequence {

  /** Construct the sequence. */
  public A399938() {
    super(1, new A399937());
  }
}
