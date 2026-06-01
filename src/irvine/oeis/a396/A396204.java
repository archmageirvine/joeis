package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396204 Numbers whose decimal representation begins with their hexadecimal representation.
 * @author Sean A. Irvine
 */
public class A396204 extends Sequence1 {

  // After Jacob Vecht

  private static final Z Z16 = Z.valueOf(16);
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mH = 0;

  /**
   * DFS search.
   * @param h total hex length
   * @param t decimal excess length
   * @param k digits chosen so far
   * @param partHex partial hexadecimal value
   * @param prefix decimal prefix value
   */
  private void search(final int h, final int t, final int k, final Z partHex, final Z prefix) {
    if (k == h) {
      // exact condition: floor(n / 10^t) == prefix
      if (partHex.divide(Z.TEN.pow(t)).equals(prefix)) {
        final String hs = partHex.toString(16);
        if (hs.indexOf('a') < 0
          && hs.indexOf('b') < 0
          && hs.indexOf('c') < 0
          && hs.indexOf('d') < 0
          && hs.indexOf('e') < 0
          && hs.indexOf('f') < 0
          && partHex.toString().startsWith(hs)) {
          mA.add(partHex);
        }
      }
      return;
    }

    final int remain = h - k - 1;
    final Z pow16 = Z16.pow(remain);
    for (int d = 0; d <= 9; ++d) {
      if (k == 0 && h > 1 && d == 0) {
        continue;
      }
      final Z newHex = partHex.multiply(16).add(d);
      final Z newPrefix = prefix.multiply(10).add(d);

      // Hex range
      final Z nLo = newHex.multiply(pow16);
      final Z nHi = nLo.add(Z.NINE.multiply(pow16.subtract(1).divide(15)));
      // Corresponding decimal range
      final Z aLo = nLo.divide(Z.TEN.pow(t)).divide(Z.TEN.pow(remain));
      final Z aHi = nHi.divide(Z.TEN.pow(t)).divide(Z.TEN.pow(remain));
      // Interval pruning
      if (newPrefix.compareTo(aLo) < 0 || newPrefix.compareTo(aHi) > 0) {
        continue;
      }
      search(h, t, k + 1, newHex, newPrefix);
    }
  }

  private void expand() {
    ++mH;
    final Z lo = Z16.pow(mH - 1);
    final Z hi = Z16.pow(mH);
    final int dLo = lo.toString().length();
    final int dHi = hi.subtract(1).toString().length();
    for (int d = dLo; d <= dHi; ++d) {
      final int t = d - mH;
      search(mH, t, 0, Z.ZERO, Z.ZERO);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      expand();
    }
    return mA.pollFirst();
  }
}
