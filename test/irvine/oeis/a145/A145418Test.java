package irvine.oeis.a145;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A145418Test extends TestCase {

  public void testSum() {
    final A145418 seq = new A145418();
    long s = 0;
    for (int k = 0; k < 2000; ++k) {
      s += seq.next().mod(1234567890L);
    }
    assertEquals(1234009373671L, s);
  }
}
