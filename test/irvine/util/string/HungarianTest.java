package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HungarianTest extends TestCase {

  public void testIntToHungarianText() {
    assertEquals("nulla", Hungarian.SINGLETON.toText(0));
    assertEquals("egy", Hungarian.SINGLETON.toText(1));
    assertEquals("t\u00EDz", Hungarian.SINGLETON.toText(10));
    assertEquals("t\u00EDzenegy", Hungarian.SINGLETON.toText(11));
    assertEquals("h\u00FAsz", Hungarian.SINGLETON.toText(20));
    assertEquals("kilencvenkilenc", Hungarian.SINGLETON.toText(99));
    assertEquals("sz\u00E1zhuszonh\u00E1rom", Hungarian.SINGLETON.toText(123));
    assertEquals("hatezer \u00E9s n\u00E9gysz\u00E1zh\u00FAsz", Hungarian.SINGLETON.toText(6420));
  }
}
