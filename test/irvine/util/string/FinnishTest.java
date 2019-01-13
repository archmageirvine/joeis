package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FinnishTest extends TestCase {

  public void testIntToFinnishText() {
    assertEquals("nolla", Finnish.toFinnish(0));
    assertEquals("yksi", Finnish.toFinnish(1));
    assertEquals("kaksi", Finnish.toFinnish(2));
    assertEquals("kolme", Finnish.toFinnish(3));
    assertEquals("nelj\u00E4", Finnish.toFinnish(4));
    assertEquals("viisi", Finnish.toFinnish(5));
    assertEquals("kuusi", Finnish.toFinnish(6));
    assertEquals("seitsem\u00E4n", Finnish.toFinnish(7));
    assertEquals("kahdeksan", Finnish.toFinnish(8));
    assertEquals("yhdeks\u00E4n", Finnish.toFinnish(9));
    assertEquals("kymmenen", Finnish.toFinnish(10));
    assertEquals("yksitoista", Finnish.toFinnish(11));
    assertEquals("kaksitoista", Finnish.toFinnish(12));
    assertEquals("kolmetoista", Finnish.toFinnish(13));
    assertEquals("nelj\u00E4toista", Finnish.toFinnish(14));
    assertEquals("viisitoista", Finnish.toFinnish(15));
    assertEquals("kuusitoista", Finnish.toFinnish(16));
    assertEquals("seitsem\u00E4ntoista", Finnish.toFinnish(17));
    assertEquals("kahdeksantoista", Finnish.toFinnish(18));
    assertEquals("yhdeks\u00E4ntoista", Finnish.toFinnish(19));
    assertEquals("kaksikymment\u00E4", Finnish.toFinnish(20));
    assertEquals("kaksikymment\u00E4yksi", Finnish.toFinnish(21));
    assertEquals("kolmekymment\u00E4", Finnish.toFinnish(30));
    assertEquals("sata", Finnish.toFinnish(100));
    assertEquals("tuhat", Finnish.toFinnish(1000));
    assertEquals("kolmetuhattaseitsem\u00E4nsataakaksikymment\u00E4yksi", Finnish.toFinnish(3721));
  }
}
