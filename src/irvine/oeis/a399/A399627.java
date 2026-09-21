package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a396.A396966;

/**
 * A399627 a(n) is the number of residues modulo 2^n counted by A396966 that are not lifts of a residue counted by A396966 modulo 2^(n-1).
 * @author Sean A. Irvine
 */
public class A399627 extends A396966 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t.multiply2());
  }
}
