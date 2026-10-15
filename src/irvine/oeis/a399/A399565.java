package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399565 Number of factorizations of (p*q*r*s)^n into parts &gt; 1 containing at least one part divisible by p*q*r*s, where p, q, r, and s are distinct primes.
 * @author Sean A. Irvine
 */
public class A399565 extends Sequence0 {

  // After Jishnu Babu Ranitha

  private int mM = 0;
  private Z[] mT;
  private Z[] mR;
  private int mN = 0;

  private void compute(final int nMax) {
    mM = nMax + 1;
    final int m2 = mM * mM;
    final int m3 = m2 * mM;
    final int size = m3 * mM;
    mT = new Z[size];
    mR = new Z[size];
    Arrays.fill(mT, Z.ZERO);
    Arrays.fill(mR, Z.ZERO);
    mT[0] = Z.ONE;
    mR[0] = Z.ONE;
    for (int c1 = 0; c1 < mM; ++c1) {
      for (int c2 = 0; c2 < mM; ++c2) {
        for (int c3 = 0; c3 < mM; ++c3) {
          for (int c4 = 0; c4 < mM; ++c4) {
            if (c1 + c2 + c3 + c4 == 0) {
              continue;
            }
            final int shift = c1 * m3 + c2 * m2 + c3 * mM + c4;
            for (int i1 = c1; i1 < mM; ++i1) {
              for (int i2 = c2; i2 < mM; ++i2) {
                for (int i3 = c3; i3 < mM; ++i3) {
                  for (int i4 = c4; i4 < mM; ++i4) {
                    final int idx = i1 * m3 + i2 * m2 + i3 * mM + i4;
                    mT[idx] = mT[idx].add(mT[idx - shift]);
                  }
                }
              }
            }
            if (c1 * c2 * c3 * c4 == 0) {
              for (int i1 = c1; i1 < mM; ++i1) {
                for (int i2 = c2; i2 < mM; ++i2) {
                  for (int i3 = c3; i3 < mM; ++i3) {
                    for (int i4 = c4; i4 < mM; ++i4) {
                      final int idx = i1 * m3 + i2 * m2 + i3 * mM + i4;
                      mR[idx] = mR[idx].add(mR[idx - shift]);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (mN >= mM) {
      compute(mN);
    }
    final int k = mN++;
    final int m2 = mM * mM;
    final int m3 = m2 * mM;
    final int idx = k * m3 + k * m2 + k * mM + k;
    return mT[idx].subtract(mR[idx]);
  }
}
