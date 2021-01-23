package irvine.oeis.a001;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A001167Test extends TestCase {

  public void testWords() {
    assertEquals(13, A001167.wordCount(1121121));
    assertEquals(14, A001167.wordCount(21121121));
    assertEquals(15, A001167.wordCount(101101121));
  }
}
