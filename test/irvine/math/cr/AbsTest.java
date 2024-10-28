package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AbsTest extends TestCase {

  public void testAbs() {
    CRTest.assertEquals("abs", CR.ZERO, CR.ZERO.abs());
    CRTest.assertEquals("abs", CR.ONE, CR.ONE.abs());
    CRTest.assertEquals("abs", CR.ONE, CR.ONE.negate().abs());
    final UnaryCrFunction abs = new Abs();
    CRTest.assertEquals("abs", CR.ZERO, abs.execute(CR.ZERO));
    CRTest.assertEquals("abs", CR.ONE, abs.execute(CR.ONE));
    CRTest.assertEquals("abs", CR.ONE, abs.execute(CR.ONE.negate()));
  }
}
