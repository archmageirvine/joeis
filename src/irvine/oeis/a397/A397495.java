package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397495 allocated for Devansh Kumar Tripathi.
 * @author Sean A. Irvine
 */
public class A397495 extends Sequence2 {

  private long mP = 2;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.l(mP);
    return Z.valueOf(mP - 1).multiply(mP * mP - 2 * mP + 7 + 2L * Z.NEG_ONE.jacobi(Z.valueOf(mP))).divide(16);
  }
}
