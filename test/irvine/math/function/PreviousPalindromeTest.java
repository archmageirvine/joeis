package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PreviousPalindromeTest extends TestCase {

  public void testPreviousPalindrome() {
    final Function1 f = new PreviousPalindrome();
    assertEquals(22, f.l(23));
    assertEquals(9, f.l(9));
    assertEquals(99, f.l(100));
    assertEquals(9, f.l(10));
  }
}
