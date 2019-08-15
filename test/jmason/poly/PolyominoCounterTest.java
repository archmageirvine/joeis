package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolyominoCounterTest extends TestCase {

  public void test() {
    final PolyominoCounter pc = new PolyominoCounter(5, false, false, false);
    pc.run(true, true, false);
    assertEquals(63, pc.getCu().getCounter(5));
    assertEquals(19, pc.getCu().getCounter(4));
    assertEquals(1, pc.getMbcu().getCounter(5));
    assertEquals(4, pc.getMbcu().getCounter(4));
  }
}
