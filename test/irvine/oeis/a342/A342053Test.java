package irvine.oeis.a342;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A342053Test extends TestCase {

  public void testD() {
    final A342053 seq = new A342053();
    assertEquals(Z.valueOf(282285432), seq.mD.apply(7, 5));
  }

  public void testW() {
    final A342053 seq = new A342053();
    assertEquals(Z.valueOf(16965), seq.mW.apply(7, 0));
    assertEquals(Z.valueOf(6256152), seq.mW.apply(7, 5));
  }

  public void testEr() {
    final A342053 seq = new A342053();
    assertEquals(Z.valueOf(2583997416L), seq.mEr.apply(7, 5));
  }

  public void testE3() {
    final A342053 seq = new A342053();
    assertEquals(Z.valueOf(1093229676), seq.mE3.apply(7, 5));
  }

  public void testE2() {
    final A342053 seq = new A342053();
    assertEquals(Z.valueOf(836922240), seq.mE2.apply(7, 0, 5));
    assertEquals(Z.valueOf(1174544280), seq.mE2.apply(7, 1, 5));
  }

}
