package irvine.nt.smarandache;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SmarandacheTest extends TestCase {

  public void testSm() {
    for (int i = -5; i <= 0; ++i) {
      try {
        Smarandache.smarandache(i);
        fail("Took negative");
      } catch (final IllegalArgumentException e) {
        // ok
      }
      try {
        Smarandache.smarandacheZ(i);
        fail("Took negative");
      } catch (final IllegalArgumentException e) {
        // ok
      }
    }
    assertEquals("1", Smarandache.smarandache(1));
    assertEquals("12", Smarandache.smarandache(2));
    assertEquals("123", Smarandache.smarandache(3));
    assertEquals("1234", Smarandache.smarandache(4));
    assertEquals("12345", Smarandache.smarandache(5));
    assertEquals("123456", Smarandache.smarandache(6));
    assertEquals("1234567", Smarandache.smarandache(7));
    assertEquals("12345678", Smarandache.smarandache(8));
    assertEquals("123456789", Smarandache.smarandache(9));
    assertEquals("12345678910", Smarandache.smarandache(10));
    assertEquals("1234567891011", Smarandache.smarandache(11));
    assertEquals(new Z("1234567891011"), Smarandache.smarandacheZ(11));
    assertEquals("123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100", Smarandache.smarandache(100));
  }

  private static final int LIM = Smarandache.SMARANDACHE_LIMIT;

  public void testIsSmarandache() {
    for (int i = 1; i <= 120; ++i) {
      assertEquals(i, Smarandache.isSmarandache(Smarandache.smarandacheZ(i)));
    }
    assertEquals(LIM, Smarandache.isSmarandache(Smarandache.smarandacheZ(LIM)));
    assertEquals(LIM - 1, Smarandache.isSmarandache(Smarandache.smarandacheZ(LIM - 1)));
    assertEquals(0, Smarandache.isSmarandache(Smarandache.smarandacheZ(LIM + 1)));
    assertEquals(0, Smarandache.isSmarandache(Z.ZERO));
    assertEquals(0, Smarandache.isSmarandache(Z.TWO.negate()));
    assertEquals(0, Smarandache.isSmarandache(new Z("123456789101")));
    assertEquals(0, Smarandache.isSmarandache(new Z("1234567891")));
    assertEquals(0, Smarandache.isSmarandache(new Z("12345679101")));
    assertEquals(0, Smarandache.isSmarandache(new Z(Smarandache.smarandache(120) + "1")));
    assertEquals(0, Smarandache.isSmarandache(new Z(Smarandache.smarandache(120) + "12")));
  }

  public void testRSm() {
    for (int i = -5; i <= 0; ++i) {
      try {
        Smarandache.reverseSmarandache(i);
        fail("Took negative");
      } catch (final IllegalArgumentException e) {
        // ok
      }
      try {
        Smarandache.reverseSmarandacheZ(i);
        fail("Took negative");
      } catch (final IllegalArgumentException e) {
        // ok
      }
    }
    assertEquals("1", Smarandache.reverseSmarandache(1));
    assertEquals("21", Smarandache.reverseSmarandache(2));
    assertEquals("321", Smarandache.reverseSmarandache(3));
    assertEquals("4321", Smarandache.reverseSmarandache(4));
    assertEquals("54321", Smarandache.reverseSmarandache(5));
    assertEquals("654321", Smarandache.reverseSmarandache(6));
    assertEquals("7654321", Smarandache.reverseSmarandache(7));
    assertEquals("87654321", Smarandache.reverseSmarandache(8));
    assertEquals("987654321", Smarandache.reverseSmarandache(9));
    assertEquals("10987654321", Smarandache.reverseSmarandache(10));
    assertEquals("1110987654321", Smarandache.reverseSmarandache(11));
    assertEquals(new Z("1110987654321"), Smarandache.reverseSmarandacheZ(11));
    assertEquals("100999897969594939291908988878685848382818079787776757473727170696867666564636261605958575655545352515049484746454443424140393837363534333231302928272625242322212019181716151413121110987654321", Smarandache.reverseSmarandache(100));
  }

  public void testIsReverseSmarandache() {
    for (int i = 1; i <= 120; ++i) {
      assertEquals(i, Smarandache.isReverseSmarandache(Smarandache.reverseSmarandacheZ(i)));
    }
    assertEquals(LIM, Smarandache.isReverseSmarandache(Smarandache.reverseSmarandacheZ(LIM)));
    assertEquals(LIM - 1, Smarandache.isReverseSmarandache(Smarandache.reverseSmarandacheZ(LIM - 1)));
    assertEquals(0, Smarandache.isReverseSmarandache(Smarandache.reverseSmarandacheZ(LIM + 1)));
    assertEquals(0, Smarandache.isReverseSmarandache(Z.ZERO));
    assertEquals(0, Smarandache.isReverseSmarandache(Z.TWO.negate()));
    assertEquals(0, Smarandache.isReverseSmarandache(new Z("110987654321")));
    assertEquals(0, Smarandache.isReverseSmarandache(new Z("1987654321")));
    assertEquals(0, Smarandache.isReverseSmarandache(new Z("110987654321")));
    assertEquals(0, Smarandache.isReverseSmarandache(new Z("3" + Smarandache.reverseSmarandache(122))));
    assertEquals(0, Smarandache.isReverseSmarandache(new Z("23" + Smarandache.reverseSmarandache(120))));
  }

}
