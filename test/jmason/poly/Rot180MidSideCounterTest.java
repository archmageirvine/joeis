package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Rot180MidSideCounterTest extends TestCase {

  public void test() {
    assertEquals(16, new Rot180MidSideCounter(8, true, false, false).getCuasym().getCounter(8));
    assertEquals(32, new Rot180MidSideCounter(8, true, true, false).getCuasym().getCounter(8));
    assertEquals(32, new Rot180MidSideCounter(8, true, true, true).getCuasym().getCounter(8));
    assertEquals(32, new Rot180MidSideCounter(8, false, true, true).getCuasym().getCounter(8));
    assertEquals(32, new Rot180MidSideCounter(8, false, false, true).getCuasym().getCounter(8));
    assertEquals(16, new Rot180MidSideCounter(8, false, false, false).getCuasym().getCounter(8));
    assertEquals(16, new Rot180MidSideCounter(8, false, false, false).getCu().getCounter(8));
  }
}
