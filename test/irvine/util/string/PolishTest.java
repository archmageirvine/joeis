package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolishTest extends TestCase {

  public void testIntToText() {
    assertEquals("zero", Polish.SINGLETON.toText(0));
    assertEquals("jeden", Polish.SINGLETON.toText(1));
    assertEquals("dwa", Polish.SINGLETON.toText(2));
    assertEquals("trzy", Polish.SINGLETON.toText(3));
    assertEquals("dziesi\u0119\u0107", Polish.SINGLETON.toText(10));
    assertEquals("jedena\u015bcie", Polish.SINGLETON.toText(11));
    assertEquals("dwadzie\u015bcia", Polish.SINGLETON.toText(20));
    assertEquals("dwadzie\u015bciajeden", Polish.SINGLETON.toText(21));
    assertEquals("sto", Polish.SINGLETON.toText(100));
    assertEquals("sto jeden", Polish.SINGLETON.toText(101));
    assertEquals("sto dwadzie\u015bciapi\u0119\u0107", Polish.SINGLETON.toText(125));
    assertEquals("dwie\u015bcie", Polish.SINGLETON.toText(200));
    assertEquals("dwie\u015bcie jeden", Polish.SINGLETON.toText(201));
    assertEquals("dwie\u015bcie siedemna\u015bcie", Polish.SINGLETON.toText(217));
    assertEquals("dwie\u015bcie czterdzie\u015bcitrzy", Polish.SINGLETON.toText(243));
    assertEquals("tysi\u0105c", Polish.SINGLETON.toText(1000));
    assertEquals("dwa tysi\u0105ce", Polish.SINGLETON.toText(2000));
    assertEquals("dwa tysi\u0105ce pi\u0119\u0107set", Polish.SINGLETON.toText(2500));
    assertEquals("cztery tysi\u0105ce dwie\u015bcie dwadzie\u015bciacztery", Polish.SINGLETON.toText(4224));
    assertEquals("pi\u0119\u0107 tysi\u0119cy", Polish.SINGLETON.toText(5000));
  }
}
