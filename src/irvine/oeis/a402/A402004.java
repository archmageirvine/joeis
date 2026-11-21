package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001359;

/**
 * A402004 Lesser twin primes p such that (7*p+4)/3 is also a lesser twin prime.
 * @author Sean A. Irvine
 */
public class A402004 extends FilterSequence {

  /** Construct the sequence. */
  public A402004() {
    super(1, new A001359(), p -> {
      final Z t = p.multiply(7).add(4).divide(3);
      return t.isProbablePrime() && t.add(2).isProbablePrime();
    });
  }
}
