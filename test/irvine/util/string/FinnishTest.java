package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FinnishTest extends TestCase {

  public void testIntToFinnishText() {
    assertEquals("nolla", Finnish.SINGLETON.toText(0));
    assertEquals("yksi", Finnish.SINGLETON.toText(1));
    assertEquals("kaksi", Finnish.SINGLETON.toText(2));
    assertEquals("kolme", Finnish.SINGLETON.toText(3));
    assertEquals("nelj\u00E4", Finnish.SINGLETON.toText(4));
    assertEquals("viisi", Finnish.SINGLETON.toText(5));
    assertEquals("kuusi", Finnish.SINGLETON.toText(6));
    assertEquals("seitsem\u00E4n", Finnish.SINGLETON.toText(7));
    assertEquals("kahdeksan", Finnish.SINGLETON.toText(8));
    assertEquals("yhdeks\u00E4n", Finnish.SINGLETON.toText(9));
    assertEquals("kymmenen", Finnish.SINGLETON.toText(10));
    assertEquals("yksitoista", Finnish.SINGLETON.toText(11));
    assertEquals("kaksitoista", Finnish.SINGLETON.toText(12));
    assertEquals("kolmetoista", Finnish.SINGLETON.toText(13));
    assertEquals("nelj\u00E4toista", Finnish.SINGLETON.toText(14));
    assertEquals("viisitoista", Finnish.SINGLETON.toText(15));
    assertEquals("kuusitoista", Finnish.SINGLETON.toText(16));
    assertEquals("seitsem\u00E4ntoista", Finnish.SINGLETON.toText(17));
    assertEquals("kahdeksantoista", Finnish.SINGLETON.toText(18));
    assertEquals("yhdeks\u00E4ntoista", Finnish.SINGLETON.toText(19));
    assertEquals("kaksikymment\u00E4", Finnish.SINGLETON.toText(20));
    assertEquals("kaksikymment\u00E4yksi", Finnish.SINGLETON.toText(21));
    assertEquals("kolmekymment\u00E4", Finnish.SINGLETON.toText(30));
    assertEquals("sata", Finnish.SINGLETON.toText(100));
    assertEquals("tuhat", Finnish.SINGLETON.toText(1000));
    assertEquals("kolmetuhattaseitsem\u00E4nsataakaksikymment\u00E4yksi", Finnish.SINGLETON.toText(3721));
  }
}
