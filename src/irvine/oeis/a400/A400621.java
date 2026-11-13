package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019446;

/**
 * A400621 allocated for Christian Efrain Maldonado Sifuentes.
 * @author Sean A. Irvine
 */
public class A400621 extends A019446 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN).add(Functions.TRIANGULAR.z(mN - 1));
  }
}
