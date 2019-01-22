package irvine.math;

import java.lang.reflect.Field;

import irvine.util.array.LongDynamicIntArray;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class MobiusTest extends TestCase {

  public void testMobius() {
    final Mobius m = new Mobius(99);
    try {
      m.mobiusMu(-1);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Out of range.", e.getMessage());
    }
    assertEquals(0, m.mobiusMu(0));
    assertEquals(1, m.mobiusMu(1));
    assertEquals(-1, m.mobiusMu(2));
    assertEquals(-1, m.mobiusMu(3));
    assertEquals(0, m.mobiusMu(4));
    assertEquals(-1, m.mobiusMu(5));
    assertEquals(1, m.mobiusMu(6));
    assertEquals(-1, m.mobiusMu(7));
    assertEquals(0, m.mobiusMu(8));
    assertEquals(0, m.mobiusMu(9));
    assertEquals(1, m.mobiusMu(10));
    assertEquals(-1, m.mobiusMu(11));
    assertEquals(0, m.mobiusMu(12));
    assertEquals(-1, m.mobiusMu(13));
    assertEquals(1, m.mobiusMu(14));
    assertEquals(1, m.mobiusMu(15));
    assertEquals(0, m.mobiusMu(16));
    assertEquals(-1, m.mobiusMu(17));
    assertEquals(0, m.mobiusMu(18));
    assertEquals(-1, m.mobiusMu(19));
    assertEquals(0, m.mobiusMu(20));
    assertEquals(1, m.mobiusMu(21));
    assertEquals(1, m.mobiusMu(22));
    assertEquals(-1, m.mobiusMu(23));
    assertEquals(0, m.mobiusMu(24));
    assertEquals(0, m.mobiusMu(25));
    assertEquals(1, m.mobiusMu(26));
    assertEquals(0, m.mobiusMu(27));
    assertEquals(0, m.mobiusMu(28));
    assertEquals(-1, m.mobiusMu(29));
    assertEquals(-1, m.mobiusMu(30));
    assertEquals(-1, m.mobiusMu(31));
    assertEquals(0, m.mobiusMu(32));
    assertEquals(1, m.mobiusMu(33));
    assertEquals(1, m.mobiusMu(34));
    assertEquals(1, m.mobiusMu(35));
    assertEquals(0, m.mobiusMu(36));
    assertEquals(-1, m.mobiusMu(37));
    assertEquals(1, m.mobiusMu(38));
    assertEquals(1, m.mobiusMu(39));
    assertEquals(0, m.mobiusMu(40));
    assertEquals(-1, m.mobiusMu(41));
    assertEquals(-1, m.mobiusMu(42));
    assertEquals(-1, m.mobiusMu(43));
    assertEquals(0, m.mobiusMu(44));
    assertEquals(0, m.mobiusMu(45));
    assertEquals(1, m.mobiusMu(46));
    assertEquals(-1, m.mobiusMu(47));
    assertEquals(0, m.mobiusMu(48));
    assertEquals(0, m.mobiusMu(49));
    assertEquals(0, m.mobiusMu(50));
    assertEquals(1, m.mobiusMu(51));
    assertEquals(0, m.mobiusMu(52));
    assertEquals(-1, m.mobiusMu(53));
    assertEquals(0, m.mobiusMu(54));
    assertEquals(1, m.mobiusMu(55));
    assertEquals(0, m.mobiusMu(56));
    assertEquals(1, m.mobiusMu(57));
    assertEquals(1, m.mobiusMu(58));
    assertEquals(-1, m.mobiusMu(59));
    assertEquals(0, m.mobiusMu(60));
    assertEquals(-1, m.mobiusMu(61));
    assertEquals(1, m.mobiusMu(62));
    assertEquals(0, m.mobiusMu(63));
    assertEquals(0, m.mobiusMu(64));
    assertEquals(1, m.mobiusMu(65));
    assertEquals(-1, m.mobiusMu(66));
    assertEquals(-1, m.mobiusMu(67));
    assertEquals(0, m.mobiusMu(68));
    assertEquals(1, m.mobiusMu(69));
    assertEquals(-1, m.mobiusMu(70));
    assertEquals(-1, m.mobiusMu(71));
    assertEquals(0, m.mobiusMu(72));
    assertEquals(-1, m.mobiusMu(73));
    assertEquals(1, m.mobiusMu(74));
    assertEquals(0, m.mobiusMu(75));
    assertEquals(0, m.mobiusMu(76));
    assertEquals(1, m.mobiusMu(77));
    assertEquals(-1, m.mobiusMu(78));
    assertEquals(-1, m.mobiusMu(79));
    assertEquals(0, m.mobiusMu(80));
    assertEquals(0, m.mobiusMu(81));
    assertEquals(1, m.mobiusMu(82));
    assertEquals(-1, m.mobiusMu(83));
    assertEquals(0, m.mobiusMu(84));
    assertEquals(1, m.mobiusMu(85));
    assertEquals(1, m.mobiusMu(86));
    assertEquals(1, m.mobiusMu(87));
    assertEquals(0, m.mobiusMu(88));
    assertEquals(-1, m.mobiusMu(89));
    assertEquals(0, m.mobiusMu(90));
    assertEquals(1, m.mobiusMu(91));
    assertEquals(0, m.mobiusMu(92));
    assertEquals(1, m.mobiusMu(93));
    assertEquals(1, m.mobiusMu(94));
    assertEquals(1, m.mobiusMu(95));
    assertEquals(0, m.mobiusMu(96));
    assertEquals(-1, m.mobiusMu(97));
    assertEquals(0, m.mobiusMu(98));
    assertEquals(0, m.mobiusMu(99));
    try {
      m.mobiusMu(100);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  public void testMobiusSmall() {
    final Mobius m = new Mobius(9);
    assertEquals(0, m.mobiusMu(0));
    assertEquals(1, m.mobiusMu(1));
    assertEquals(-1, m.mobiusMu(2));
    assertEquals(-1, m.mobiusMu(3));
    assertEquals(0, m.mobiusMu(4));
    assertEquals(-1, m.mobiusMu(5));
    assertEquals(1, m.mobiusMu(6));
    assertEquals(-1, m.mobiusMu(7));
    assertEquals(0, m.mobiusMu(8));
    assertEquals(0, m.mobiusMu(9));
  }

  public void testMobiusStatic() {
    assertEquals(1, Mobius.mobius(95));
    assertEquals(0, Mobius.mobius(96));
    assertEquals(-1, Mobius.mobius(97));
    assertEquals(0, Mobius.mobius(98));
    assertEquals(0, Mobius.mobius(99));
  }

  public void testNastyArrayLength() throws Exception {
    final Mobius m = new Mobius(31);
    final Field f = Mobius.class.getDeclaredField("mMu");
    f.setAccessible(true);
    final Object obj = f.get(m);
    assertTrue(obj instanceof LongDynamicIntArray);
    final LongDynamicIntArray x = (LongDynamicIntArray) obj;
    assertEquals(0, x.get(1));
  }

  public void testBadCons() {
    try {
      new Mobius(-1);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Limit must be nonnegative.", e.getMessage());
    }
    final Mobius m = new Mobius(0);
    try {
      m.mobiusMu(-1);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(0, m.mobiusMu(0));
    try {
      m.mobiusMu(1);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  public void testMertens() {
    final Mobius m = new Mobius(1000000);
    try {
      m.mertens(-1);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      m.mertens(0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(1, m.mertens(1));
    assertEquals(0, m.mertens(2));
    assertEquals(-1, m.mertens(3));
    assertEquals(-1, m.mertens(4));
    assertEquals(1, m.mertens(100));
    assertEquals(212, m.mertens(1000000));
  }

}
