package irvine.math.group;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SchreierArrayTest extends TestCase {

  public void test() {
    final SchreierArray a = new SchreierArray();
    a.set(10, 2);
    assertEquals(2, a.get(10));
    assertEquals(-2, a.get(4));
  }
}
