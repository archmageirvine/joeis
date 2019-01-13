package irvine.math.set;

import irvine.math.r.Reals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RealFunctionTest extends TestCase {

  public void testDurbin1p11() {
    final RealFunction f = new RealFunction(true, true) {
        @Override
        public Double image(final Double x) {
          return 2 * x;
        }
      };
    assertTrue(f.isOnto());
    assertTrue(f.isOneToOne());
    assertEquals(4.0, f.image(2.0), 1e-10);
  }

  public void testDurbin1p14() {
    final RealFunction f = new RealFunction(false, false) {
        @Override
        public Double image(final Double x) {
          return x * x + x;
        }
      };
    assertFalse(f.isOnto());
    assertFalse(f.isOneToOne());
    assertEquals(-0.25, f.image(-0.5), 1e-10);
    assertEquals(0.00, f.image(0.0), 1e-10);
    assertEquals(0.00, f.image(-1.0), 1e-10);
  }

  public void testDurbin1p15() {
    final RealFunction f = new RealFunction(false, true) {
        @Override
        public Double image(final Double x) {
          return Math.exp(x);
        }
      };
    assertFalse(f.isOnto());
    assertTrue(f.isOneToOne());
    assertEquals(1.0, f.image(0.0), 1e-10);
    try {
      f.image();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  public void testDurbin1p16() {
    final RealFunction f = new RealFunction(true, false) {
        @Override
        public Double image(final Double x) {
          return Math.tan(x);
        }
      };
    assertTrue(f.isOnto());
    assertEquals(Reals.SINGLETON, f.image());
    assertFalse(f.isOneToOne());
    assertEquals(0.0, f.image(0.0), 1e-10);
  }
}
