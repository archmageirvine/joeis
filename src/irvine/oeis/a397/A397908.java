package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397908 a(1) = 1; a(n) = a(n-d(n)) + n - 1 for n &gt; 1, where d(n) = prime(n) - prime(n-1).
 * @author Sean
 */
public class A397908 extends CachedSequence {

  /** Construct the sequence. */
  public A397908() {
    super(1, Long.class, (self, n) -> n == 1 ? Z.ONE : self.a(n - Functions.PRIME.l(n) + Functions.PRIME.l(n - 1)).add(n - 1));
  }
}

