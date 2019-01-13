package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DanishTest extends TestCase {

  public void testIntToText() {
    assertEquals("nul", Danish.toDanish(0));
    assertEquals("en", Danish.toDanish(1));
    assertEquals("to", Danish.toDanish(2));
    assertEquals("tre", Danish.toDanish(3));
    assertEquals("ti", Danish.toDanish(10));
    assertEquals("elleve", Danish.toDanish(11));
    assertEquals("tyve", Danish.toDanish(20));
    assertEquals("hundrede", Danish.toDanish(100));
    assertEquals("hundrede og en", Danish.toDanish(101));
    assertEquals("hundrede og femogtyve", Danish.toDanish(125));
    assertEquals("to hundrede", Danish.toDanish(200));
    assertEquals("to hundrede og en", Danish.toDanish(201));
    assertEquals("to hundrede og to", Danish.toDanish(202));
    assertEquals("to hundrede og treogfyrre", Danish.toDanish(243));
    assertEquals("tusind", Danish.toDanish(1000));
    assertEquals("to tusinde", Danish.toDanish(2000));
    assertEquals("to tusinde fem hundrede", Danish.toDanish(2500));
    assertEquals("fire tusinde to hundrede og fireogtyve", Danish.toDanish(4224));
  }
}
