package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DateTest extends TestCase {

  public void testGetMonth() {
    assertEquals(0, Date.getMonth(""));
    assertEquals(0, Date.getMonth("ja"));
    assertEquals(1, Date.getMonth("jan"));
    assertEquals(1, Date.getMonth("january"));
    assertEquals(1, Date.getMonth("jaNUArY"));
    assertEquals(2, Date.getMonth("feb"));
    assertEquals(3, Date.getMonth("mar"));
    assertEquals(4, Date.getMonth("apr"));
    assertEquals(5, Date.getMonth("may"));
    assertEquals(6, Date.getMonth("jun"));
    assertEquals(7, Date.getMonth("jul"));
    assertEquals(8, Date.getMonth("aug"));
    assertEquals(9, Date.getMonth("sep"));
    assertEquals(10, Date.getMonth("oct"));
    assertEquals(11, Date.getMonth("nov"));
    assertEquals(12, Date.getMonth("dec"));
  }

  public void testNow() {
    final String date = Date.now();
    assertTrue(date.startsWith("20"));
    assertTrue(date.endsWith(" "));
    assertEquals(20, date.length());
  }
}
