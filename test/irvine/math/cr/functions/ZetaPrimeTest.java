package irvine.math.cr.functions;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ZetaPrimeTest extends TestCase {

  public void test() {
    assertEquals("-0.93754825431584375370", CrFunctions.ZETA_PRIME.cr(2).toString(20));
    assertEquals("-0.19812624288563685333", CrFunctions.ZETA_PRIME.cr(3).toString(20));
    assertEquals("-0.06891126589612537985", CrFunctions.ZETA_PRIME.cr(4).toString(20));
    assertEquals("-0.91893853320467274178", CrFunctions.ZETA_PRIME.cr(0).toString(20));
    assertEquals("-0.16542114370045092921", CrFunctions.ZETA_PRIME.cr(-1).toString(20));
  }
}
