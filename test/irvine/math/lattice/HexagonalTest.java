package irvine.math.lattice;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HexagonalTest extends TestCase {

  public void testTranslate() {
    final Animal a0 = new Animal(Lattices.HEXAGONAL.toPoint(-2, 0), Lattices.HEXAGONAL.toPoint(-3, 1), Lattices.HEXAGONAL.toPoint(-1, 1), Lattices.HEXAGONAL.toPoint(1, 1));
    final Animal a1 = Hexagonal.translate(a0);
    assertEquals("(2,0),(1,1),(3,1),(5,1)", a1.toString(Lattices.HEXAGONAL));
    assertEquals("(2,0),(1,1),(3,1),(5,1)", Hexagonal.translate(a1).toString(Lattices.HEXAGONAL));
  }

  public void testRotatePoint() {
    final long p0 = Lattices.HEXAGONAL.toPoint(2, 0);
    final long p1 = Hexagonal.rotate(p0);
    assertEquals("(1,1)", Lattices.HEXAGONAL.toString(p1));
    final long p2 = Hexagonal.rotate(p1);
    assertEquals("(-1,1)", Lattices.HEXAGONAL.toString(p2));
    final long p3 = Hexagonal.rotate(p2);
    assertEquals("(-2,0)", Lattices.HEXAGONAL.toString(p3));
    final long p4 = Hexagonal.rotate(p3);
    assertEquals("(-1,-1)", Lattices.HEXAGONAL.toString(p4));
    final long p5 = Hexagonal.rotate(p4);
    assertEquals("(1,-1)", Lattices.HEXAGONAL.toString(p5));
    final long p6 = Hexagonal.rotate(p5);
    assertEquals("(2,0)", Lattices.HEXAGONAL.toString(p6));
    assertEquals(p0, p6);
  }

  public void testRotateAnimal() {
    final Animal a0 = new Animal(Lattices.HEXAGONAL.origin(), Lattices.HEXAGONAL.toPoint(1, 1), Lattices.HEXAGONAL.toPoint(2, 2));
    assertEquals("(0,0),(1,1),(2,2)", a0.toString(Lattices.HEXAGONAL));
    final Animal a1 = Hexagonal.rotate(a0);
    assertEquals("(2,0),(1,1),(0,2)", a1.toString(Lattices.HEXAGONAL));
    final Animal a2 = Hexagonal.rotate(a1);
    assertEquals("(0,0),(2,0),(4,0)", a2.toString(Lattices.HEXAGONAL));
    final Animal a3 = Hexagonal.rotate(a2);
    assertEquals("(0,0),(1,1),(2,2)", a3.toString(Lattices.HEXAGONAL));
  }

  public void testRotateAnimal2() {
    final Animal a0 = new Animal(Lattices.HEXAGONAL.origin(), Lattices.HEXAGONAL.toPoint(-1, -1), Lattices.HEXAGONAL.toPoint(-2, -2));
    assertEquals("(0,0),(-2,-2),(-1,-1)", a0.toString(Lattices.HEXAGONAL));
    final Animal a1 = Hexagonal.rotate(a0);
    assertEquals("(2,0),(1,1),(0,2)", a1.toString(Lattices.HEXAGONAL));
  }

  public void testRotateAnimal3() {
    final Animal a0 = new Animal(Lattices.HEXAGONAL.origin(), Lattices.HEXAGONAL.toPoint(1, 1), Lattices.HEXAGONAL.toPoint(2, 2), Lattices.HEXAGONAL.toPoint(0, 2));
    assertEquals("(0,0),(1,1),(0,2),(2,2)", a0.toString(Lattices.HEXAGONAL));
    assertEquals("(0,0),(1,1),(0,2),(2,2)", Hexagonal.translate(a0).toString(Lattices.HEXAGONAL));
    final Animal a1 = Hexagonal.rotate(a0);
    assertEquals("(4,0),(1,1),(3,1),(2,2)", a1.toString(Lattices.HEXAGONAL));
    final Animal a2 = Hexagonal.rotate(a1);
    assertEquals("(2,0),(1,1),(3,1),(5,1)", a2.toString(Lattices.HEXAGONAL));
    final Animal a3 = Hexagonal.rotate(a2);
    assertEquals("(0,0),(2,0),(1,1),(2,2)", a3.toString(Lattices.HEXAGONAL));
  }

}
