package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MutableIntegerTest extends TestCase {

  public void test() {
    final MutableInteger i = new MutableInteger(42);
    assertEquals(42, i.postIncrement());
    assertEquals(43, i.postDecrement());
    assertEquals(42, i.get());
    i.set(5);
    assertEquals(5, i.get());
  }
}
