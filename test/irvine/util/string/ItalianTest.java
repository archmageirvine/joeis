package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ItalianTest extends TestCase {

  public void testIntToText() {
    assertEquals("zero", Italian.SINGLETON.toText(0));
    assertEquals("uno", Italian.SINGLETON.toText(1));
    assertEquals("tredici", Italian.SINGLETON.toText(13));
    assertEquals("quarantacinque", Italian.SINGLETON.toText(45));
    assertEquals("settantasette", Italian.SINGLETON.toText(77));
    assertEquals("centootto", Italian.SINGLETON.toText(108));
    assertEquals("centottantatre", Italian.SINGLETON.toText(183));
    assertEquals("duemila", Italian.SINGLETON.toText(2000));
  }
}
