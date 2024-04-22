package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PartitionsTest extends TestCase {

  public void test() {
    final Function1 f = new Partitions();
    assertEquals(Z.ONE, f.z(1));
    assertEquals(42, f.l(10));
  }
}
