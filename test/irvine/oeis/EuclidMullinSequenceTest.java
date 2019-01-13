package irvine.oeis;

import java.io.IOException;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EuclidMullinSequenceTest extends TestCase {

  public void test3() {
    final EuclidMullinSequence ems = EuclidMullinSequence.create(3);
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.valueOf(13), ems.next());
  }

  public void test5() {
    // This has a trusted source
    final EuclidMullinSequence ems = EuclidMullinSequence.create(5);
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

  public void test7() {
    final EuclidMullinSequence ems = EuclidMullinSequence.create(7);
    assertEquals(Z.SEVEN, ems.next());
    assertEquals(Z.TWO, ems.next());
    assertEquals(Z.THREE, ems.next());
    assertEquals(Z.valueOf(43), ems.next());
    assertEquals(Z.valueOf(13), ems.next());
    assertSame(ems, EuclidMullinSequence.create(7));
    assertNotSame(ems, EuclidMullinSequence.create(5));
  }

  public void test43() {
    final EuclidMullinSequence ems = EuclidMullinSequence.create(43);
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
    try {
      ems.process("not-a-number");
      fail();
    } catch (final IOException e) {
      // expected
    }
    try {
      ems.process("10 not-a-number");
      fail();
    } catch (final IOException e) {
      // expected
    }
    try {
      ems.process("10 7.");
      fail();
    } catch (final IOException e) {
      // expected
    }
  }
}
