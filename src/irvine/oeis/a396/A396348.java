package irvine.oeis.a396;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A396348 Array read by ascending antidiagonals: A(n,k) = prime(n)^A249344(n,k).
 * @author Sean A. Irvine
 */
public class A396348 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A396348() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, int m) {
        int cnt = 0;
        final int p = Functions.PRIME.i(n);
        while (m % p == 0) {
          m /= p;
          ++cnt;
        }
        return Z.valueOf(p).pow(cnt);
      }
    });
  }
}
