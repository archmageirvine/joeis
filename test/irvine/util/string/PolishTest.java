package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PolishTest extends TestCase {

  public void testIntToText() {
    assertEquals("zero", Polish.toPolish(0));
    assertEquals("jeden", Polish.toPolish(1));
    assertEquals("dwa", Polish.toPolish(2));
    assertEquals("trzy", Polish.toPolish(3));
    assertEquals("dziesi\u0119\u0107", Polish.toPolish(10));
    assertEquals("jedena\u015bcie", Polish.toPolish(11));
    assertEquals("dwadzie\u015bcia", Polish.toPolish(20));
    assertEquals("dwadzie\u015bciajeden", Polish.toPolish(21));
    assertEquals("sto", Polish.toPolish(100));
    assertEquals("sto jeden", Polish.toPolish(101));
    assertEquals("sto dwadzie\u015bciapi\u0119\u0107", Polish.toPolish(125));
    assertEquals("dwie\u015bcie", Polish.toPolish(200));
    assertEquals("dwie\u015bcie jeden", Polish.toPolish(201));
    assertEquals("dwie\u015bcie siedemna\u015bcie", Polish.toPolish(217));
    assertEquals("dwie\u015bcie czterdzie\u015bcitrzy", Polish.toPolish(243));
    assertEquals("tysi\u0105c", Polish.toPolish(1000));
    assertEquals("dwa tysi\u0105ce", Polish.toPolish(2000));
    assertEquals("dwa tysi\u0105ce pi\u0119\u0107set", Polish.toPolish(2500));
    assertEquals("cztery tysi\u0105ce dwie\u015bcie dwadzie\u015bciacztery", Polish.toPolish(4224));
    assertEquals("pi\u0119\u0107 tysi\u0119cy", Polish.toPolish(5000));
  }
}
