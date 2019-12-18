package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CzechTest extends TestCase {

  public void testIntToText() {
    assertEquals("nula", Czech.SINGLETON.toText(0));
    assertEquals("jeden", Czech.SINGLETON.toText(1));
    assertEquals("dva", Czech.SINGLETON.toText(2));
    assertEquals("t\u0159i", Czech.SINGLETON.toText(3));
    assertEquals("deset", Czech.SINGLETON.toText(10));
    assertEquals("jeden\u00e1ct", Czech.SINGLETON.toText(11));
    assertEquals("dvacet", Czech.SINGLETON.toText(20));
    assertEquals("dvacet jeden", Czech.SINGLETON.toText(21));
    assertEquals("sto", Czech.SINGLETON.toText(100));
    assertEquals("sto jedna", Czech.SINGLETON.toText(101));
    assertEquals("sto dvacet p\u011bt", Czech.SINGLETON.toText(125));
    assertEquals("dv\u011b st\u011b", Czech.SINGLETON.toText(200));
    assertEquals("dv\u011b st\u011b jeden", Czech.SINGLETON.toText(201));
    assertEquals("dv\u011b st\u011b \u010dty\u0159icet t\u0159i", Czech.SINGLETON.toText(243));
    assertEquals("tysi\u0105c", Czech.SINGLETON.toText(1000));
    assertEquals("dva tis\u00edce", Czech.SINGLETON.toText(2000));
    assertEquals("\u010dty\u0159i tis\u00edce dv\u011b st\u011b dvacet \u010dty\u0159i", Czech.SINGLETON.toText(4224));
    assertEquals("p\u011bt tis\u00edc", Czech.SINGLETON.toText(5000));
  }
}
