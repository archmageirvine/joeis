package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396196 The n-th digit of the n-th term of the Look-and-Say sequence (A005150), padded with 0 if the term has fewer than n digits.
 * @author Sean A. Irvine
 */
public class A396196 extends Sequence1 {

  private String mA = null;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mA == null) {
      mA = "1";
    } else {
      // We actually only need a prefix of the full string
      mA = Functions.LOOK_AND_SAY.z(new Z(mA.substring(0, Math.min(mN + 1, mA.length())))).toString();
    }
    return mN >= mA.length() ? Z.ZERO : Z.valueOf(mA.charAt(mN) - '0');
  }
}
