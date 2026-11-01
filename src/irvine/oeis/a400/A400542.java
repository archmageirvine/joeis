package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Albanian;

/**
 * A400542 allocated for Marko Radulovic.
 * @author Sean A. Irvine
 */
public class A400542 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Albanian.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}

