package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ItalianTest extends TestCase {

  public void testIntToText() {
    assertEquals("zero", Italian.toItalian(0));
    assertEquals("uno", Italian.toItalian(1));
    assertEquals("tredici", Italian.toItalian(13));
    assertEquals("quarantacinque", Italian.toItalian(45));
    assertEquals("settantasette", Italian.toItalian(77));
    assertEquals("centootto", Italian.toItalian(108));
    assertEquals("centottantatre", Italian.toItalian(183));
    assertEquals("duemila", Italian.toItalian(2000));
  }
}
