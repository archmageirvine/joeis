package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolySideTest extends TestCase {

  public void test() {
    final PolySide ps = new PolySide(1);
    assertEquals("000010100110", ps.makeString());
    assertEquals("000010100110", ps.rotxy().makeString());
    assertEquals("000010100110", ps.mirrorxy().makeString());
    assertEquals("000001010011", ps.mirrorxz().makeString());
    assertEquals(12, ps.listSons().size());
  }
}
