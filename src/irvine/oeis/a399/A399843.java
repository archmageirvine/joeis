package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399843 a(n) is the number of nonzero digits in the product of first n primes (cf. A002110).
 * @author Sean A. Irvine
 */
public class A399843 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399843() {
    super(0, new A002110(), k -> Z.valueOf(k.toString().replace("0", "").length()));
  }
}
