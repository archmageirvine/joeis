package irvine.oeis.a397;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397527 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A397527 extends Sequence2 {

  /*
  //  todo I suspect this code is wrong
  ptm[k_, h_, m_]:=Which[m==1, 0, h==1, Mod[k, m], True, With[{phi=EulerPhi[m], e=ptm[k, h-1, EulerPhi[m]]}, PowerMod[k, If[GCD[k, m]==1, e, e+phi], m]]];

a[n_]:=Module[{j=3, p}, While[True, p=Prime[j]; If[Mod[1+Sum[ptm[i, n, p], {i, 2, n}], p]==0, Return[p]]; j++]]
   */

  // After Zhining Yang

  private long mN = 3;

  private long ptm(final long k, final long h, final long m) {
    if (m == 1) {
      return 0;
    }
    if (h == 1) {
      return k % m;
    }
    final long phi = Functions.PHI.l(m);
    final long e = ptm(k, h - 1, phi);
    return LongUtils.modPow(k, Functions.GCD.l(k, m) == 1 ? e : e + phi, m);
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (true) {
      p = Functions.NEXT_PRIME.l(p);
      Z sum = Z.ONE;
      for (long i = 2; i <= mN; ++i) {
        sum = sum.add(ptm(i, mN, p));
      }
      if (sum.mod(p) == 0) {
        return Z.valueOf(p);
      }
    }
  }
}
