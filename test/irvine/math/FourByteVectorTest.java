package irvine.math;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FourByteVectorTest extends TestCase {

  public void testPack() {
    assertEquals(0, FourByteVector.pack());
    assertEquals(0, FourByteVector.pack(0));
    assertEquals(1, FourByteVector.pack(1));
    assertEquals(255, FourByteVector.pack(255));
    assertEquals(255, FourByteVector.pack(255, 0));
    assertEquals(65536 + 255, FourByteVector.pack(255, 1));
    assertEquals(0x00FE00FD00FC00FBL, FourByteVector.pack(251, 252, 253, 254, 255));
  }

  public void testUnpack() {
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      final int[] e = FourByteVector.unpack(v);
      assertEquals(4, e.length);
      assertEquals(v, FourByteVector.pack(e));
    }
  }

  public void testSet() {
    final long v = FourByteVector.pack(251, 252, 253, 254);
    assertEquals(0x00FA00FD00FC00FBL, FourByteVector.set(v, 250, 3));
    assertEquals(0x00FE00FA00FC00FBL, FourByteVector.set(v, 250, 2));
    assertEquals(0x00FE00FD00FA00FBL, FourByteVector.set(v, 250, 1));
    assertEquals(0x00FE00FD00FC00FAL, FourByteVector.set(v, 250, 0));
  }

  public void testGet() {
    final long v = FourByteVector.pack(251, 252, 253, 254);
    assertEquals(251, FourByteVector.get(v, 0));
    assertEquals(252, FourByteVector.get(v, 1));
    assertEquals(253, FourByteVector.get(v, 2));
    assertEquals(254, FourByteVector.get(v, 3));
  }

  public void testConstant() {
    assertEquals(0, FourByteVector.constant(0));
    assertEquals(0x01000100010001L, FourByteVector.constant(1));
    assertEquals(0xFF00FF00FF00FFL, FourByteVector.constant(255));
  }

  public void testLogical() {
    final long v = FourByteVector.pack(251, 252, 253, 254);
    assertEquals(v, FourByteVector.and(v, v));
    assertEquals(0, FourByteVector.and(v, 0L));
    assertEquals(v, FourByteVector.or(v, v));
    assertEquals(v, FourByteVector.or(v, 0L));
    assertEquals(0, FourByteVector.xor(v, v));
    assertEquals(v, FourByteVector.xor(v, 0L));
    assertEquals(0, FourByteVector.and(v, 0));
    assertEquals(v, FourByteVector.or(v, 0));
    assertEquals(v, FourByteVector.xor(v, 0));
    assertEquals(v, FourByteVector.and(v, 255));
    assertEquals(0xFF00FF00FF00FFL, FourByteVector.or(v, 255));
    assertEquals(0x01000200030004L, FourByteVector.xor(v, 255));
    assertEquals(0x01000200030004L, FourByteVector.not(v));
  }

  public void testLeftShift() {
    final long v = FourByteVector.pack(1, 2, 4, 8);
    assertEquals(v, FourByteVector.lsl(v, 0));
    assertEquals(v, FourByteVector.lsl(v, 8));
    assertEquals(0x10000800040002L, FourByteVector.lsl(v, 1));
    assertEquals(0x10000800040002L, FourByteVector.lsl(v, 9));
    assertEquals(0x20001000080004L, FourByteVector.lsl(v, 2));
    assertEquals(0x40002000100008L, FourByteVector.lsl(v, 3));
    assertEquals(0x80004000200010L, FourByteVector.lsl(v, 4));
    assertEquals(0x00008000400020L, FourByteVector.lsl(v, 5));
    assertEquals(0x00000000800040L, FourByteVector.lsl(v, 6));
    assertEquals(0x00000000000080L, FourByteVector.lsl(v, 7));
  }

  public void testRightShift() {
    final long v = FourByteVector.pack(16, 32, 64, 128);
    assertEquals(v, FourByteVector.lsr(v, 0));
    assertEquals(v, FourByteVector.lsr(v, 8));
    assertEquals(0x40002000100008L, FourByteVector.lsr(v, 1));
    assertEquals(0x40002000100008L, FourByteVector.lsr(v, 9));
    assertEquals(0x20001000080004L, FourByteVector.lsr(v, 2));
    assertEquals(0x10000800040002L, FourByteVector.lsr(v, 3));
    assertEquals(0x08000400020001L, FourByteVector.lsr(v, 4));
    assertEquals(0x04000200010000L, FourByteVector.lsr(v, 5));
    assertEquals(0x02000100000000L, FourByteVector.lsr(v, 6));
    assertEquals(0x01000000000000L, FourByteVector.lsr(v, 7));
  }

  public void testArithmeticRightShift() {
    final long v = FourByteVector.pack(16, 255, 64, 128);
    assertEquals(v, FourByteVector.asr(v, 0));
    assertEquals(v, FourByteVector.asr(v, 8));
    assertEquals(0xC0002000FF0008L, FourByteVector.asr(v, 1));
    assertEquals(0xC0002000FF0008L, FourByteVector.asr(v, 9));
    assertEquals(0xE0001000FF0004L, FourByteVector.asr(v, 2));
    assertEquals(0xF0000800FF0002L, FourByteVector.asr(v, 3));
    assertEquals(0xF8000400FF0001L, FourByteVector.asr(v, 4));
    assertEquals(0xFC000200FF0000L, FourByteVector.asr(v, 5));
    assertEquals(0xFE000100FF0000L, FourByteVector.asr(v, 6));
    assertEquals(0xFF000000FF0000L, FourByteVector.asr(v, 7));
  }

  public void testNegate() {
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      assertEquals(v, FourByteVector.negate(FourByteVector.negate(v)));
    }
    assertEquals(0xFF00C0000100F1L, FourByteVector.negate(FourByteVector.pack(0x0F, 255, 64, 1)));
  }

  public void testAdd() {
    final Random r = new Random();
    for (int j = 0; j < 20; ++j) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      assertEquals(v, FourByteVector.add(v, 0L));
      assertEquals(v, FourByteVector.add(0L, v));
      final long u = r.nextLong() & 0xFF00FF00FF00FFL;
      final long q = FourByteVector.add(u, v);
      assertEquals(q, FourByteVector.add(v, u));
      final int[] vv = FourByteVector.unpack(v);
      final int[] uu = FourByteVector.unpack(u);
      final int[] qq = FourByteVector.unpack(q);
      for (int k = 0; k < vv.length; ++k) {
        assertEquals(qq[k], (vv[k] + uu[k]) & 0xFF);
      }
    }
  }

  public void testAddScalar() {
    final Random r = new Random();
    for (int j = 0; j < 20; ++j) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      final int s = r.nextInt(256);
      final long q = FourByteVector.add(v, s);
      final int[] vv = FourByteVector.unpack(v);
      final int[] qq = FourByteVector.unpack(q);
      for (int k = 0; k < vv.length; ++k) {
        assertEquals(qq[k], (vv[k] + s) & 0xFF);
      }
    }
  }

  public void testSub() {
    final Random r = new Random();
    for (int j = 0; j < 20; ++j) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      assertEquals(v, FourByteVector.sub(v, 0L));
      assertEquals(FourByteVector.negate(v), FourByteVector.sub(0L, v));
      final long u = r.nextLong() & 0xFF00FF00FF00FFL;
      final long q = FourByteVector.sub(v, u);
      final int[] vv = FourByteVector.unpack(v);
      final int[] uu = FourByteVector.unpack(u);
      final int[] qq = FourByteVector.unpack(q);
      for (int k = 0; k < vv.length; ++k) {
        assertEquals(qq[k], (vv[k] - uu[k]) & 0xFF);
      }
    }
  }

  public void testMulScalar() {
    final Random r = new Random();
    for (int j = 0; j < 20; ++j) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      final int s = r.nextInt(256);
      final long q = FourByteVector.mul(v, s);
      final int[] vv = FourByteVector.unpack(v);
      final int[] qq = FourByteVector.unpack(q);
      for (int k = 0; k < vv.length; ++k) {
        assertEquals(qq[k], (vv[k] * s) & 0xFF);
      }
    }
  }

  public void testMul() {
    final Random r = new Random();
    final long one = FourByteVector.constant(1);
    for (int j = 0; j < 20; ++j) {
      final long v = r.nextLong() & 0xFF00FF00FF00FFL;
      assertEquals(0, FourByteVector.mul(v, 0L));
      assertEquals(0, FourByteVector.mul(0L, v));
      assertEquals(v, FourByteVector.mul(v, one));
      assertEquals(v, FourByteVector.mul(one, v));
      final long u = r.nextLong() & 0xFF00FF00FF00FFL;
      final long q = FourByteVector.mul(u, v);
      final int[] vv = FourByteVector.unpack(v);
      final int[] uu = FourByteVector.unpack(u);
      final int[] qq = FourByteVector.unpack(q);
      assertEquals(q, FourByteVector.mul(v, u));
      for (int k = 0; k < vv.length; ++k) {
        assertEquals(qq[k], (vv[k] * uu[k]) & 0xFF);
      }
    }
  }

}
