package irvine.oeis.a402;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402230 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402230 extends Sequence1 {

  // After Alper Ferudun

  private final HashSet<String> mTerms = new HashSet<>();
  private int mN = 0;

  private String search(final String p, final int n, final Set<String> residuals) {
    if (residuals.contains("")) {
      return null;
    }
    if (p.length() == n) {
      return p;
    }
    final char last = p.isEmpty() ? '1' : '0';
    for (char d = '9'; d >= last; --d) {
      final Set<String> r = new HashSet<>();
      for (final String u : residuals) {
        if (u.charAt(0) <= d) {
          r.add(u);
        }
        if (u.charAt(0) == d) {
          r.add(u.substring(1));
        }
      }
      final String w = search(p + d, n, r);
      if (w != null) {
        return w;
      }
    }
    return null;
  }

  @Override
  public Z next() {
    final String w = search("", ++mN, mTerms);
    if (w == null) {
      return null;
    }
    mTerms.add(w);
    return new Z(w);
  }
}
