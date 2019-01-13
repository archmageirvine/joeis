package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class HungarianTest extends TestCase {

  public void testIntToHungarianText() {
    assertEquals("nulla", Hungarian.toHungarian(0));
    assertEquals("egy", Hungarian.toHungarian(1));
    assertEquals("t\u00EDz", Hungarian.toHungarian(10));
    assertEquals("t\u00EDzenegy", Hungarian.toHungarian(11));
    assertEquals("h\u00FAsz", Hungarian.toHungarian(20));
    assertEquals("kilencvenkilenc", Hungarian.toHungarian(99));
    assertEquals("sz\u00E1zhuszonh\u00E1rom", Hungarian.toHungarian(123));
    assertEquals("hatezer \u00E9s n\u00E9gysz\u00E1zh\u00FAsz", Hungarian.toHungarian(6420));
  }
}
