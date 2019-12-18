package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GermanTest extends TestCase {

  public void testIntToGermanText() {
    assertEquals("null", German.SINGLETON.toText(0));
    assertEquals("eins", German.SINGLETON.toText(1));
    assertEquals("zwei", German.SINGLETON.toText(2));
    assertEquals("drei", German.SINGLETON.toText(3));
    assertEquals("vier", German.SINGLETON.toText(4));
    assertEquals("f\u00FCnf", German.SINGLETON.toText(5));
    assertEquals("sechs", German.SINGLETON.toText(6));
    assertEquals("sieben", German.SINGLETON.toText(7));
    assertEquals("acht", German.SINGLETON.toText(8));
    assertEquals("neun", German.SINGLETON.toText(9));
    assertEquals("zehn", German.SINGLETON.toText(10));
    assertEquals("elf", German.SINGLETON.toText(11));
    assertEquals("zw\u00F6lf", German.SINGLETON.toText(12));
    assertEquals("dreizehn", German.SINGLETON.toText(13));
    assertEquals("vierzehn", German.SINGLETON.toText(14));
    assertEquals("f\u00FCnfzehn", German.SINGLETON.toText(15));
    assertEquals("sechzehn", German.SINGLETON.toText(16));
    assertEquals("siebzehn", German.SINGLETON.toText(17));
    assertEquals("achtzehn", German.SINGLETON.toText(18));
    assertEquals("neunzehn", German.SINGLETON.toText(19));
    assertEquals("zwanzig", German.SINGLETON.toText(20));
    assertEquals("einundzwanzig", German.SINGLETON.toText(21));
    assertEquals("neunundzwanzig", German.SINGLETON.toText(29));
    assertEquals("drei\u00DFig", German.SINGLETON.toText(30));
    assertEquals("einhundert", German.SINGLETON.toText(100));
    assertEquals("einhunderteins", German.SINGLETON.toText(101));
    assertEquals("einhundertzehn", German.SINGLETON.toText(110));
    assertEquals("einhundertdreiundzwanzig", German.SINGLETON.toText(123));
    assertEquals("f\u00FCnfhundertneun", German.SINGLETON.toText(509));
    assertEquals("siebenhundertelf", German.SINGLETON.toText(711));
    assertEquals("eintausend", German.SINGLETON.toText(1000));

  }
}
