package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DutchTest extends TestCase {

  public void testDutch() {
    assertEquals("nul", Dutch.SINGLETON.toText(0));
    assertEquals("een", Dutch.SINGLETON.toText(1));
    assertEquals("tien", Dutch.SINGLETON.toText(10));
    assertEquals("elf", Dutch.SINGLETON.toText(11));
    assertEquals("negentien", Dutch.SINGLETON.toText(19));
    assertEquals("twintig", Dutch.SINGLETON.toText(20));
    assertEquals("eenentwintig", Dutch.SINGLETON.toText(21));
    assertEquals("negenennegentig", Dutch.SINGLETON.toText(99));
    assertEquals("honderd", Dutch.SINGLETON.toText(100));
    assertEquals("tweehonderd", Dutch.SINGLETON.toText(200));
    assertEquals("vijfhonderd achtenzeventig", Dutch.SINGLETON.toText(578));
    assertEquals("duizend", Dutch.SINGLETON.toText(1000));
    assertEquals("duizend zevenentachtig", Dutch.SINGLETON.toText(1087));
    assertEquals("elfhonderd vijfentwintig", Dutch.SINGLETON.toText(1125));
    assertEquals("een miljoen", Dutch.SINGLETON.toText(1000000));
  }
}
