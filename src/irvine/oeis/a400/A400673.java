package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400673 allocated for Jakub Buczak.
 * @author Sean A. Irvine
 */
public class A400673 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.LPF.z(Z.valueOf(2 * ++mN).pow(4 * mN * mN).add(1));
  }
}

