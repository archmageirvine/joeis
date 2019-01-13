package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CzechTest extends TestCase {

  public void testIntToText() {
    assertEquals("nula", Czech.toCzech(0));
    assertEquals("jeden", Czech.toCzech(1));
    assertEquals("dva", Czech.toCzech(2));
    assertEquals("t\u0159i", Czech.toCzech(3));
    assertEquals("deset", Czech.toCzech(10));
    assertEquals("jeden\u00e1ct", Czech.toCzech(11));
    assertEquals("dvacet", Czech.toCzech(20));
    assertEquals("dvacet jeden", Czech.toCzech(21));
    assertEquals("sto", Czech.toCzech(100));
    assertEquals("sto jedna", Czech.toCzech(101));
    assertEquals("sto dvacet p\u011bt", Czech.toCzech(125));
    assertEquals("dv\u011b st\u011b", Czech.toCzech(200));
    assertEquals("dv\u011b st\u011b jeden", Czech.toCzech(201));
    assertEquals("dv\u011b st\u011b \u010dty\u0159icet t\u0159i", Czech.toCzech(243));
    assertEquals("tysi\u0105c", Czech.toCzech(1000));
    assertEquals("dva tis\u00edce", Czech.toCzech(2000));
    assertEquals("\u010dty\u0159i tis\u00edce dv\u011b st\u011b dvacet \u010dty\u0159i", Czech.toCzech(4224));
    assertEquals("p\u011bt tis\u00edc", Czech.toCzech(5000));
  }
}
