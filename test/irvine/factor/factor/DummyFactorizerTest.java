package irvine.factor.factor;

import irvine.StandardIoTestCase;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyFactorizerTest extends StandardIoTestCase {

  public void test() {
    final Cheetah cheetah = new Cheetah(false);
    cheetah.setVerbose(true);
    assertTrue(cheetah.isVerbose());
    assertEquals("<2>\n<3>\n<7>\n", cheetah.factorize(Z.valueOf(42)).toString());
    assertEquals("", getOut());
    assertEquals("", getErr());
  }

  public void testMessage() {
    new AbstractFactorizer() {
      @Override
      protected void factor(final FactorSequence fs, final Z n) {
      }
      {
        setVerbose(true);
        message("test");
      }
    };
    assertEquals("", getOut());
    final String err = getErr();
    //mOldOut.println(err);
    assertEquals(68, err.length());
    assertTrue(err.contains("irvine.factor.factor.DummyFactorizerTest$1 test"));
    assertEquals('-', err.charAt(4));
    assertEquals('-', err.charAt(7));
    assertEquals(' ', err.charAt(10));
  }
}
