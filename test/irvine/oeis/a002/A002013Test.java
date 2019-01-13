package irvine.oeis.a002;

import irvine.oeis.AbstractShortSequenceTest;
import irvine.oeis.a002.A002013.Animal;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A002013Test extends AbstractShortSequenceTest {

  public void testVerticalFlip() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(new Animal(new Animal(null, 0, 0), 1, 0), 2, 0), 2, 1), 2, 2), 1, 2);
    assertEquals("(0,0)-(1,0)-(1,1)-(1,2)-(0,2)-(-1,2)", A002013.verticalFlip(null, a, 0, 0).toString());
  }

  public void testHorizontalFlip() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(new Animal(new Animal(null, 0, 0), 0, 1), 0, 2), 1, 2), 2, 2), 2, 1);
    assertEquals("(0,0)-(0,1)-(1,1)-(2,1)-(2,0)-(2,-1)", A002013.horizontalFlip(null, a, 0, 0).toString());
  }

  public void testNinety() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(null, 0, 0), 1, 0), 2, 0), 2, 1);
    assertEquals("(0,0)-(0,1)-(0,2)-(-1,2)", A002013.ninety(a).toString());
  }

  public void testOneEighty() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(null, 0, 0), 1, 0), 2, 0), 2, 1);
    assertEquals("(0,0)-(-1,0)-(-2,0)-(-2,-1)", A002013.oneEighty(a).toString());
  }

  public void testTwoSeventy() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(null, 0, 0), 1, 0), 2, 0), 2, 1);
    assertEquals("(0,0)-(0,-1)-(0,-2)-(1,-2)", A002013.twoSeventy(a).toString());
  }

  public void testSwapOrigin() {
    final Animal a = new Animal(new Animal(new Animal(new Animal(null, 0, 0), 1, 0), 2, 0), 2, 1);
    assertEquals("(0,0)-(0,-1)-(-1,-1)-(-2,-1)", A002013.swapOrigin(null, a, 0, 0).toString());
  }
}
