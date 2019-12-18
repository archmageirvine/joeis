package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DanishTest extends TestCase {

  public void testIntToText() {
    assertEquals("nul", Danish.SINGLETON.toText(0));
    assertEquals("en", Danish.SINGLETON.toText(1));
    assertEquals("to", Danish.SINGLETON.toText(2));
    assertEquals("tre", Danish.SINGLETON.toText(3));
    assertEquals("ti", Danish.SINGLETON.toText(10));
    assertEquals("elleve", Danish.SINGLETON.toText(11));
    assertEquals("tyve", Danish.SINGLETON.toText(20));
    assertEquals("hundrede", Danish.SINGLETON.toText(100));
    assertEquals("hundrede og en", Danish.SINGLETON.toText(101));
    assertEquals("hundrede og femogtyve", Danish.SINGLETON.toText(125));
    assertEquals("to hundrede", Danish.SINGLETON.toText(200));
    assertEquals("to hundrede og en", Danish.SINGLETON.toText(201));
    assertEquals("to hundrede og to", Danish.SINGLETON.toText(202));
    assertEquals("to hundrede og treogfyrre", Danish.SINGLETON.toText(243));
    assertEquals("tusind", Danish.SINGLETON.toText(1000));
    assertEquals("to tusinde", Danish.SINGLETON.toText(2000));
    assertEquals("to tusinde fem hundrede", Danish.SINGLETON.toText(2500));
    assertEquals("fire tusinde to hundrede og fireogtyve", Danish.SINGLETON.toText(4224));
  }
}
