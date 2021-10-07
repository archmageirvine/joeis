package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CatalanTest extends TestCase {

  public void testIntToCatalanText() {
    assertEquals("zero", Catalan.SINGLETON.toText(0));
    assertEquals("un", Catalan.SINGLETON.toText(1));
    assertEquals("deu", Catalan.SINGLETON.toText(10));
    assertEquals("onze", Catalan.SINGLETON.toText(11));
    assertEquals("vint", Catalan.SINGLETON.toText(20));
    assertEquals("vint-i-cinc", Catalan.SINGLETON.toText(25));
    assertEquals("trenta", Catalan.SINGLETON.toText(30));
    assertEquals("trenta-dos", Catalan.SINGLETON.toText(32));
    assertEquals("cent", Catalan.SINGLETON.toText(100));
    assertEquals("tres-cents trenta-sis", Catalan.SINGLETON.toText(336));
    assertEquals("vuit-cents", Catalan.SINGLETON.toText(800));
  }
}
