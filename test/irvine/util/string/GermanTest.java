package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GermanTest extends TestCase {

  public void testIntToGermanText() {
    assertEquals("null", German.toGerman(0));
    assertEquals("eins", German.toGerman(1));
    assertEquals("zwei", German.toGerman(2));
    assertEquals("drei", German.toGerman(3));
    assertEquals("vier", German.toGerman(4));
    assertEquals("f\u00FCnf", German.toGerman(5));
    assertEquals("sechs", German.toGerman(6));
    assertEquals("sieben", German.toGerman(7));
    assertEquals("acht", German.toGerman(8));
    assertEquals("neun", German.toGerman(9));
    assertEquals("zehn", German.toGerman(10));
    assertEquals("elf", German.toGerman(11));
    assertEquals("zw\u00F6lf", German.toGerman(12));
    assertEquals("dreizehn", German.toGerman(13));
    assertEquals("vierzehn", German.toGerman(14));
    assertEquals("f\u00FCnfzehn", German.toGerman(15));
    assertEquals("sechzehn", German.toGerman(16));
    assertEquals("siebzehn", German.toGerman(17));
    assertEquals("achtzehn", German.toGerman(18));
    assertEquals("neunzehn", German.toGerman(19));
    assertEquals("zwanzig", German.toGerman(20));
    assertEquals("einundzwanzig", German.toGerman(21));
    assertEquals("neunundzwanzig", German.toGerman(29));
    assertEquals("drei\u00DFig", German.toGerman(30));
    assertEquals("einhundert", German.toGerman(100));
    assertEquals("einhunderteins", German.toGerman(101));
    assertEquals("einhundertzehn", German.toGerman(110));
    assertEquals("einhundertdreiundzwanzig", German.toGerman(123));
    assertEquals("f\u00FCnfhundertneun", German.toGerman(509));
    assertEquals("siebenhundertelf", German.toGerman(711));
    assertEquals("eintausend", German.toGerman(1000));

  }
}
