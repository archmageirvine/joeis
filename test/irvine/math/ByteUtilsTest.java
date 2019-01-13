package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ByteUtilsTest extends TestCase {

  public void testReverse() {
    assertEquals(0, ByteUtils.reverse((byte) 0));
    assertEquals(255, ByteUtils.reverse((byte) 255) & 0xFF);
    assertEquals(1, ByteUtils.reverse((byte) 128));
    assertEquals(0b01010101, ByteUtils.reverse((byte) 0b10101010));
  }

  public void testReverseArray() {
    final byte[] data = {1, (byte) 128, 0, (byte) 255};
    ByteUtils.reverse(data);
    assertEquals(128, data[0] & 0xFF);
    assertEquals(1, data[1]);
    assertEquals(0, data[2]);
    assertEquals(255, data[3] & 0xFF);
  }
}
