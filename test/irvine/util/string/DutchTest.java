package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DutchTest extends TestCase {

  public void testDutch() {
    assertEquals("nul", Dutch.toDutch(0));
    assertEquals("een", Dutch.toDutch(1));
    assertEquals("tien", Dutch.toDutch(10));
    assertEquals("elf", Dutch.toDutch(11));
    assertEquals("negentien", Dutch.toDutch(19));
    assertEquals("twintig", Dutch.toDutch(20));
    assertEquals("eenentwintig", Dutch.toDutch(21));
    assertEquals("negenennegentig", Dutch.toDutch(99));
    assertEquals("honderd", Dutch.toDutch(100));
    assertEquals("tweehonderd", Dutch.toDutch(200));
    assertEquals("vijfhonderd achtenzeventig", Dutch.toDutch(578));
    assertEquals("duizend", Dutch.toDutch(1000));
    assertEquals("duizend zevenentachtig", Dutch.toDutch(1087));
    assertEquals("elfhonderd vijfentwintig", Dutch.toDutch(1125));
    assertEquals("een miljoen", Dutch.toDutch(1000000));
  }
}
