package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IrishGaelicTest extends TestCase {

  public void testIntToIrishGaelicText() {
    assertEquals("n\u00E1id", IrishGaelic.SINGLETON.toText(0));
    assertEquals("aon", IrishGaelic.SINGLETON.toText(1));
    assertEquals("d\u00F3", IrishGaelic.SINGLETON.toText(2));
    assertEquals("tr\u00ED", IrishGaelic.SINGLETON.toText(3));
    assertEquals("ceathair", IrishGaelic.SINGLETON.toText(4));
    assertEquals("c\u00FAig", IrishGaelic.SINGLETON.toText(5));
    assertEquals("s\u00E9", IrishGaelic.SINGLETON.toText(6));
    assertEquals("seacht", IrishGaelic.SINGLETON.toText(7));
    assertEquals("ocht", IrishGaelic.SINGLETON.toText(8));
    assertEquals("naoi", IrishGaelic.SINGLETON.toText(9));
    assertEquals("deich", IrishGaelic.SINGLETON.toText(10));
    assertEquals("aon d\u00E9ag", IrishGaelic.SINGLETON.toText(11));
    assertEquals("d\u00F3 dh\u00E9ag", IrishGaelic.SINGLETON.toText(12));
    assertEquals("tr\u00ED d\u00E9ag", IrishGaelic.SINGLETON.toText(13));
    assertEquals("ceathair d\u00E9ag", IrishGaelic.SINGLETON.toText(14));
    assertEquals("c\u00FAig d\u00E9ag", IrishGaelic.SINGLETON.toText(15));
    assertEquals("s\u00E9 d\u00E9ag", IrishGaelic.SINGLETON.toText(16));
    assertEquals("seacht d\u00E9ag", IrishGaelic.SINGLETON.toText(17));
    assertEquals("ocht d\u00E9ag", IrishGaelic.SINGLETON.toText(18));
    assertEquals("naoi d\u00E9ag", IrishGaelic.SINGLETON.toText(19));
    assertEquals("fiche", IrishGaelic.SINGLETON.toText(20));
    assertEquals("fiche haon", IrishGaelic.SINGLETON.toText(21));
    assertEquals("tr\u00EDocha", IrishGaelic.SINGLETON.toText(30));
    assertEquals("c\u00E9ad", IrishGaelic.SINGLETON.toText(100));
    assertEquals("m\u00EDle", IrishGaelic.SINGLETON.toText(1000));
    assertEquals("fiche d\u00F3", IrishGaelic.SINGLETON.toText(22));
    assertEquals("tr\u00EDocha naoi", IrishGaelic.SINGLETON.toText(39));
    assertEquals("seasca seacht", IrishGaelic.SINGLETON.toText(67));
    assertEquals("n\u00F3cha tr\u00ED", IrishGaelic.SINGLETON.toText(93));
  }
}
