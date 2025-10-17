package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EditDistTest extends TestCase {

  public void testId() {
    final EditDist ed = new EditDist("abcdef", "abcdef");
    assertEquals(0, ed.distance());
  }

  public void test1() {
    final EditDist ed = new EditDist("abcdef", "abcgef");
    assertEquals(1, ed.distance());
  }

  public void test2() {
    final EditDist ed = new EditDist("abcdef", "abcef");
    assertEquals(1, ed.distance());
  }

  public void test3() {
    final EditDist ed = new EditDist("abcdef", "abcdgef");
    assertEquals(1, ed.distance());
  }

  public void test4() {
    final EditDist ed = new EditDist("abcdefg", "abcdgefh");
    assertEquals(2, ed.distance());
  }
}
