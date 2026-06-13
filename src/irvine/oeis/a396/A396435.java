package irvine.oeis.a396;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000043;

/**
 * A396435 allocated for Michael C.H. Lin.
 * @author Sean A. Irvine
 */
public class A396435 extends Sequence1 {

  private final Sequence mMersenne = new A000043().skip();

  private static long m3Bsgs(final long p) {
    final Z m = Z.ONE.shiftLeft(p).subtract(Z.ONE);
    final Z nR = m.subtract(1).divide(p);
    final Z target = Z.THREE.modPow(nR, m);
    final long s = Functions.SQRT.l(p) + 1;
    final HashMap<Z, Long> baby = new HashMap<>();
    Z v = Z.ONE;
    for (long j = 0; j < s; ++j) {
      baby.put(v, j);
      v = v.multiply2().mod(m);
    }
    final Z step = Z.TWO.modPow(Z.valueOf(s), m).modInverse(m);
    Z g = target;
    for (int i = 0; i < s; ++i) {
      final Long j = baby.get(g);
      if (j != null) {
        final long k = i * s + j;
        if (k < p) {
          return k;
        }
      }
      g = g.modMultiply(step, m);
    }
    return -1;
  }

  @Override
  public Z next() {
    return Z.valueOf(m3Bsgs(mMersenne.next().longValueExact()));
  }
}

