package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402175 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A402175 extends Sequence1 {

  // After Felix Huber

  private static final Z FOUR = Z.valueOf(4);
  private static final Z TWO = Z.valueOf(2);
  // Current search bound.
  private Z mT = Z.ONE;
  private final Map<Z, Boolean> mB = new HashMap<>();

  private boolean isFourthPower(final Z m) {
    if (m.signum() < 0) {
      return false;
    }
    // Find floor(sqrt(sqrt(m))) using binary search.
    Z low = Z.ZERO;
    Z high = Z.ONE.shiftLeft((m.bitLength() + 3) / 4);
    while (low.compareTo(high) < 0) {
      final Z mid = low.add(high).add(Z.ONE).shiftRight(1);
      if (mid.pow(4).compareTo(m) <= 0) {
        low = mid;
      } else {
        high = mid.subtract(Z.ONE);
      }
    }
    return low.pow(4).equals(m);
  }

  private void g(final int i, final Z e, final Z m, final Z d) {
    mB.put(m, d.mod(FOUR).equals(TWO) || isFourthPower(m));
    final Z p = Functions.PRIME.z(i);
    Z x = m;
    for (Z h = Z.ONE; h.compareTo(e) <= 0; h = h.add(Z.ONE)) {
      x = x.multiply(p);
      if (x.compareTo(mT) > 0) {
        break;
      }
      g(i + 1, h, x, d.multiply(h.add(Z.ONE)));
    }
  }

  /*
   * Extend the enumeration until at least n qualifying values exist.
   */
  private void extend(final int n) {
    while (true) {
      int count = 0;
      for (final boolean value : mB.values()) {
        if (value) {
          ++count;
        }
      }
      if (count >= n) {
        return;
      }
      mT = mT.multiply(TWO);
      g(1, mT, Z.ONE, Z.ONE);
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    extend(mN);

    // Sort all enumerated m.
    final List<Z> values = new ArrayList<>(mB.keySet());
    Collections.sort(values);
    // Find the nth qualifying value s[n].
    int qualifying = 0;
    Z threshold = Z.ZERO;
    for (final Z x : values) {
      if (Boolean.TRUE.equals(mB.get(x))) {
        if (++qualifying == mN) {
          threshold = x;
          break;
        }
      }
    }
    int result = 0;
    for (final Z x : values) {
      if (x.compareTo(threshold) <= 0) {
        ++result;
      } else {
        break;
      }
    }
    return Z.valueOf(result);
  }
}
