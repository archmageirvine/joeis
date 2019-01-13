package irvine.oeis.a013;

import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A013990Test extends AbstractSequenceTest {

  @Override
  protected int maxTerms() {
    return 6;
  }

  public void testCombCount() {
    assertEquals(16, A013990.combs(4).size());
    assertEquals(50, A013990.combs(5).size());
    assertEquals(156, A013990.combs(6).size());
  }
}
