package irvine.oeis;

import java.io.IOException;

import irvine.math.z.Z;
import irvine.oeis.prime.EuclidMullinSequence;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EuclidMullinSequenceTest extends TestCase {

  public void test3() {
    EuclidMullinSequence ems = EuclidMullinSequence.create(3);
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.valueOf(13), ems.next());
    // Following tests reset works
    ems = EuclidMullinSequence.create(3);
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.valueOf(13), ems.next());
  }

  public void test5() throws IOException {
    // This has a trusted source
    final EuclidMullinSequence ems = new EuclidMullinSequence(Z.FIVE);
    assertEquals(Z.FIVE, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.valueOf(11), ems.next());
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.valueOf(331), ems.next());
    assertEquals(Z.valueOf(19), ems.next());
    assertEquals(Z.valueOf(199), ems.next());
    assertEquals(Z.valueOf(53), ems.next());
    assertEquals(Z.valueOf(21888927391L), ems.next());
    int c = 0;
    try {
      while (++c < 10000) {
        ems.next();
      }
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    assertEquals(49, c);
  }

  public void test7() throws IOException {
    final EuclidMullinSequence ems = new EuclidMullinSequence(Z.SEVEN);
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.valueOf(13), ems.next());
    assertNotSame(ems, EuclidMullinSequence.create(5));
    assertSame(EuclidMullinSequence.create(7), EuclidMullinSequence.create(7));
  }

  public void test43() throws IOException {
    final EuclidMullinSequence ems = new EuclidMullinSequence(Z.valueOf(43));
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.valueOf(13), ems.next());
  }

  public void testComposite() {
    try {
      EuclidMullinSequence.create(6);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testX() {
    // Another random value
    final EuclidMullinSequence ems = EuclidMullinSequence.create(1234567891);
    assertEquals(Z.valueOf(1234567891), ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.valueOf(23), ems.next());
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.valueOf(2843), ems.next());
  }
}
