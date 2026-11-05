package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400293 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A400293 extends A400291 {

  @Override
  public Z next() {
    step();
    return mRow.get(mRow.size() - 1);
  }
}

