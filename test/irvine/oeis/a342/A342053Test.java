package irvine.oeis.a342;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
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

  public void testMakeSquareBgfTr() {
    final A342053 seq = new A342053();
    assertEquals("(1+y+3y^2+13y^3)+(2+5y+20y^2+100y^3)x+(5+21y+105y^2+595y^3)x^2+(14+84y+504y^2+3192y^3)x^3+(42+330y+2310y^2+16170y^3)x^4", seq.makeSquareBgfTr(seq.mD, 4, 3, 1).toString());
    assertEquals("(1+y^2+3y^4+13y^6)+(2+5y^2+20y^4+100y^6)x+(5+21y^2+105y^4+595y^6)x^2+(14+84y^2+504y^4+3192y^6)x^3+(42+330y^2+2310y^4+16170y^6)x^4", seq.makeSquareBgfTr(seq.mD, 4, 3, 2).toString());
  }

  public void testInvHelp() {
    final A342053 seq = new A342053();
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 1);
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Z>> bgf = ring.create(Arrays.asList(
      Polynomial.create(1, 2),
      Polynomial.create(3, 12)
    ));
    final Polynomial<Polynomial<Z>> fi = ring.create(Arrays.asList(
      inner.zero(),
      inner.one(),
      Polynomial.create(-1, -1),
      Polynomial.create(0, -1),
      Polynomial.create(0, -1)
    ));
    assertEquals("(1+2y)+(1+6y)x", seq.invHelp(1, bgf, fi).toString());
  }

  public void testOrientedStrongTriangsGf() {
    final A342053 seq = new A342053();
    assertEquals("(1+y+y^2+5y^3+24y^4)x^3+(y+2y^2+10y^3+60y^4)x^4+(y+2y^2+16y^3+122y^4)x^5", seq.orientedStrongTriangsGf(5, 4).toString());
    assertEquals("(1+y+y^2+5y^3+24y^4)x^3", seq.orientedStrongTriangsGf(3, 4).toString());
  }

  public void testJgf() {
    final A342053 seq = new A342053();
    assertEquals("1+y+y^2+3y^3+8y^4+23y^5+68y^6+215y^7", seq.jgf(7).toString());
  }

  public void testAchiralStrongTriangsGf() {
    final A342053 seq = new A342053();
    assertEquals("", seq.achiralStrongTriangsGf(3, 2).toString());
  }
}
