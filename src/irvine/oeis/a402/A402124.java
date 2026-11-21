package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402124 Lexicographically earliest sequence of integers &gt;= 2 such that no two adjacent blocks of terms have the same product.
 * @author Sean A. Irvine
 */
public class A402124 extends Sequence1 {

  // After Alper Ferudun

  private final List<Z> mTerms = new ArrayList<>();
  private final Set<Z> mSeen = new HashSet<>();

  /** Construct the sequence. */
  public A402124() {
    mTerms.add(Z.ONE);
    mSeen.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z prev = mTerms.get(mTerms.size() - 1);
    Z a = Z.TWO;
    while (true) {
      final Z z = prev.multiply(a);
      boolean ok = true;
      for (final Z y : mTerms) {
        final Z square = y.square();
        final Z[] qr = square.divideAndRemainder(z);
        if (qr[1].isZero() && mSeen.contains(qr[0])) {
          ok = false;
          break;
        }
      }
      if (ok) {
        mTerms.add(z);
        mSeen.add(z);
        return a;
      }
      a = a.add(1);
    }
  }
}
