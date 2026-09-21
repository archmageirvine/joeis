package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A399787 Length of the longest palindromic substring of n written in base 10.
 * @author Sean A. Irvine
 */
public class A399787 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    int k = s.length();
    while (true) {
      for (int j = 0; j + k <= s.length(); ++j) {
        if (StringUtils.isPalindrome(s.substring(j, j + k))) {
          return Z.valueOf(k);
        }
      }
      --k;
    }
  }
}
