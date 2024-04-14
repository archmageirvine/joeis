package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LookAndSayTest extends TestCase {

  public void test() {
    final Function1 f = new LookAndSay();
    assertEquals(12, f.l(Z.TWO));
    assertEquals(22, f.l(22));
    assertEquals(132415, f.l(3445));
  }
}
