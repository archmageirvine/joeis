package jmason.poly;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class UniqueMaker3sTest extends TestCase {

  public void test() {
    final PolySide ps = new PolySide(1);
    assertEquals("000010100110", new UniqueMaker3s(ps).uniqString());
    assertEquals("000010100110", new UniqueMaker3s(ps.rotxy()).uniqString());
    assertEquals("000010100110", new UniqueMaker3s(ps.mirrorxz()).uniqString());
    assertEquals("000010100110", new UniqueMaker3s(ps.mirrorz()).uniqString());
  }
}
