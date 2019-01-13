package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IrishGaelicTest extends TestCase {

  public void testIntToIrishGaelicText() {
    assertEquals("n\u00E1id", IrishGaelic.toIrishGaelic(0));
    assertEquals("aon", IrishGaelic.toIrishGaelic(1));
    assertEquals("d\u00F3", IrishGaelic.toIrishGaelic(2));
    assertEquals("tr\u00ED", IrishGaelic.toIrishGaelic(3));
    assertEquals("ceathair", IrishGaelic.toIrishGaelic(4));
    assertEquals("c\u00FAig", IrishGaelic.toIrishGaelic(5));
    assertEquals("s\u00E9", IrishGaelic.toIrishGaelic(6));
    assertEquals("seacht", IrishGaelic.toIrishGaelic(7));
    assertEquals("ocht", IrishGaelic.toIrishGaelic(8));
    assertEquals("naoi", IrishGaelic.toIrishGaelic(9));
    assertEquals("deich", IrishGaelic.toIrishGaelic(10));
    assertEquals("aon d\u00E9ag", IrishGaelic.toIrishGaelic(11));
    assertEquals("d\u00F3 dh\u00E9ag", IrishGaelic.toIrishGaelic(12));
    assertEquals("tr\u00ED d\u00E9ag", IrishGaelic.toIrishGaelic(13));
    assertEquals("ceathair d\u00E9ag", IrishGaelic.toIrishGaelic(14));
    assertEquals("c\u00FAig d\u00E9ag", IrishGaelic.toIrishGaelic(15));
    assertEquals("s\u00E9 d\u00E9ag", IrishGaelic.toIrishGaelic(16));
    assertEquals("seacht d\u00E9ag", IrishGaelic.toIrishGaelic(17));
    assertEquals("ocht d\u00E9ag", IrishGaelic.toIrishGaelic(18));
    assertEquals("naoi d\u00E9ag", IrishGaelic.toIrishGaelic(19));
    assertEquals("fiche", IrishGaelic.toIrishGaelic(20));
    assertEquals("fiche haon", IrishGaelic.toIrishGaelic(21));
    assertEquals("tr\u00EDocha", IrishGaelic.toIrishGaelic(30));
    assertEquals("c\u00E9ad", IrishGaelic.toIrishGaelic(100));
    assertEquals("m\u00EDle", IrishGaelic.toIrishGaelic(1000));
    assertEquals("fiche d\u00F3", IrishGaelic.toIrishGaelic(22));
    assertEquals("tr\u00EDocha naoi", IrishGaelic.toIrishGaelic(39));
    assertEquals("seasca seacht", IrishGaelic.toIrishGaelic(67));
    assertEquals("n\u00F3cha tr\u00ED", IrishGaelic.toIrishGaelic(93));
  }
}
