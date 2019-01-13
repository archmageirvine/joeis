package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CheetahTest extends TestCase {

  public void test() {
    assertEquals("", Cheetah.factor(0).toString());
    assertEquals("", Cheetah.factor(1).toString());
    assertEquals("2", FactorSequence.toString(Cheetah.factor(2)));
    assertEquals("<2>", Cheetah.factor(2).toString().trim());
    assertEquals("-1.2^3.3", FactorSequence.toString(Cheetah.factor(-24)));
    assertEquals("3.109", FactorSequence.toString(Cheetah.factor(327)));
    assertEquals("7.11.2251", FactorSequence.toString(Cheetah.factor(173327)));
    assertEquals("7.11.2251", FactorSequence.toString(Cheetah.factor(Z.valueOf(173327))));
  }

  public void testTooHard() {
    try {
      new Cheetah(false).factorize(new Z("13434831919201259236815426493921804806549679124593144241231827041757429530097263607753925714276914346198873098128132259821841"));
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
