package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396565 allocated for Jishnu Babu Ranitha.
 * @author Sean
 */
public class A396565 extends Sequence0 {

  // After Jishnu Babu Ranitha

  private static final class Part {
    private final int mX;
    private final int mY;
    private final int mShift;

    private Part(final int x, final int y, final int m) {
      mX = x;
      mY = y;
      mShift = x * m + y;
    }
  }

  private Z mCount;

  private void dfs(final List<Part> parts, final int idx, final int rx, final int ry, final Z mask) {
    if (rx == 0 && ry == 0) {
      mCount = mCount.add(Z.ONE);
      return;
    }
    if (rx + ry < 2) {
      return;
    }
    for (int i = idx; i < parts.size(); ++i) {
      final Part p = parts.get(i);
      if (p.mX <= rx && p.mY <= ry) {
        final Z shifted = mask.shiftLeft(p.mShift);
        if (mask.and(shifted).isZero()) {
          dfs(parts, i + 1, rx - p.mX, ry - p.mY, mask.or(shifted));
        }
      }
    }
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    final int m = mN + 1;
    final List<Part> parts = new ArrayList<>();
    for (int i = mN; i >= 0; --i) {
      for (int j = mN; j >= 0; --j) {
        if (i + j >= 2) {
          parts.add(new Part(i, j, m));
        }
      }
    }

    parts.sort(Comparator.comparingInt((Part p) -> -(p.mX + p.mY)).thenComparingInt(p -> -p.mX));

    mCount = Z.ZERO;
    dfs(parts, 0, mN, mN, Z.ONE);
    return mCount;
  }
}
