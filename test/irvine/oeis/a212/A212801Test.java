package irvine.oeis.a212;

import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A212801Test extends AbstractSequenceTest {

  public void testUnity() {
    final A212801 seq = new A212801();
    assertEquals("-1.0000000000+0.0000000000i", seq.compute(1L, 2L).toString());
    assertEquals("-0.5000000000+0.8660254038i", seq.compute(1L, 3L).toString());
    assertEquals("-0.5000000000-0.8660254038i", seq.compute(2L, 3L).toString());
    assertEquals("1.0000000000+0.0000000000i", seq.compute(3L, 3L).toString());
  }
}
