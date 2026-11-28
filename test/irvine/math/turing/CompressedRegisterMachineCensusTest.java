package irvine.math.turing;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Gregory Morse
 */
public class CompressedRegisterMachineCensusTest extends TestCase {

  public void test() {
    final long[] counts = CompressedRegisterMachineCensus.count(12);
    // The 84-bit reconstruction intentionally differs from the published count.
    final long[] expected = {0, 1, 1, 3, 8, 50, 311, 1012, 4382, 19164, 99785, 515279, 2559787};
    assertEquals(expected.length, counts.length);
    for (int i = 0; i < expected.length; ++i) {
      assertEquals("Width " + i, expected[i], counts[i]);
    }
  }
}
