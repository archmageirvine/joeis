package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EsperantoTest extends TestCase {

  public void testEsperanto() {
    assertEquals("nul", Esperanto.SINGLETON.toText(0));
    assertEquals("dek", Esperanto.SINGLETON.toText(10));
    assertEquals("mil sepcent dudek na\u016D", Esperanto.SINGLETON.toText(1729));
  }
}
