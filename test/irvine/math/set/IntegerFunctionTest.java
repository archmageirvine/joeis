package irvine.math.set;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IntegerFunctionTest extends TestCase {

  static IntegerFunction alpha() {
    return new IntegerFunction(false, true) {
      @Override
      public Z image(final Z n) {
        return n.multiply2();
      }
    };
  }

  static IntegerFunction beta() {
    return new IntegerFunction(true, true) {
        @Override
        public Z image(final Z n) {
          return n.add(1);
        }
      };
  }

  private static final class CubeFunction extends IntegerFunction {
    private CubeFunction() {
      super(false, true);
    }

    @Override
    public Z image(final Z n) {
      return n.pow(3);
    }
  }

  public void testDurbin1p2() {
    final IntegerFunction alpha = alpha();
    assertFalse(alpha.isOnto());
    assertTrue(alpha.isOneToOne());
    assertEquals(Z.FOUR, alpha.image(Z.TWO));
    final IntegerFunction beta = beta();
    assertTrue(beta.isOnto());
    assertTrue(beta.isOneToOne());
    assertEquals(Z.ONE, beta.image(Z.ZERO));
    final IntegerFunction gamma = new CubeFunction();
    assertFalse(gamma.isOnto());
    assertTrue(gamma.isOneToOne());
    assertEquals(Z.EIGHT, gamma.image(Z.TWO));
    assertEquals(Z.NEG_ONE, gamma.image(Z.NEG_ONE));
    try {
      gamma.image();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
