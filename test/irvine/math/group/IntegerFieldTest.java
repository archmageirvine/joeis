package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerFieldTest extends TestCase {

  public void test() {
    final IntegerField i = IntegerField.SINGLETON;
    assertEquals(Z.TWO, i.divide(Z.FIVE, Z.TWO));
    try {
      i.inverse(Z.TWO);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

}
