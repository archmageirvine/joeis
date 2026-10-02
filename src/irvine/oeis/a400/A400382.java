package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.oeis.a032.A032510;

/**
 * A400382 allocated for Leonard Peil.
 * @author Sean A. Irvine
 */
public class A400382 extends A032510 {

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
