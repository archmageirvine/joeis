package irvine.oeis.a307;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A307102Test extends TestCase {

  public void testOverflow() {
    try {
      new A307102().compute(new Z("1122755752855713895623244049306709034778906250"));
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
