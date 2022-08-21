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

  public void testQ() {
    final A342053 seq = new A342053();
    final Polynomial<Z> j = Polynomial.create(1, 1, 1, 3);
    j.setIndeterminate("y");
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 2);
    final Polynomial<Polynomial<Z>> d = new PolynomialRingField<>(inner)
      .create(Arrays.asList(inner.one(), inner.onePlusXToTheN(2)));
    assertEquals("1+(1+y^2)x", d.toString());
    assertEquals("(1+y+y^2+3y^3)+(1+2y+y^2+4y^3)x", seq.q1(d, j).toString());
    assertEquals("(y+2y^2-4y^3)x", seq.q2(d, j).toString());
    assertEquals("(y+2y^2)x", seq.q3(d, j).toString());
  }

  public void testQ1A() {
    final A342053 seq = new A342053();
    final Polynomial<Z> j = Polynomial.create(1, 1, 1);
    j.setIndeterminate("y");
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 2);
    final Polynomial<Polynomial<Z>> d = new PolynomialRingField<>(inner).one();
    assertEquals("1+y+y^2", seq.q1(d, j).toString());
  }

  public void testQ1B() {
    final A342053 seq = new A342053();
    final Polynomial<Z> j = Polynomial.create(1, 1, 1, 3, 8);
    j.setIndeterminate("y");
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 2);
    final Polynomial<Polynomial<Z>> d = new PolynomialRingField<>(inner).create(Arrays.asList(inner.one(), inner.onePlusXToTheN(2)));
    assertEquals("(1+y+y^2+3y^3+8y^4)+(1+2y+4y^2+y^3+9y^4)x", seq.q1(d, j).toString());
    // Q1=(1 + y + y^2 + 3*y^3 + 8*y^4 + O(y^5)) + (1 + 2*y + 4*y^2 + O(y^3))*x + O(x^2)
  }

  public void testQ1C() {
    final A342053 seq = new A342053();
    final Polynomial<Z> j = Polynomial.create(1, 1, 1, 3, 8, 23, 68);
    j.setIndeterminate("y");
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 5);
    final Polynomial<Polynomial<Z>> d = new PolynomialRingField<>(inner).create(Arrays.asList(inner.one(), Polynomial.create(1, 0, 1, 0, 3)));
    assertEquals("(1+y+y^2+3y^3+8y^4+23y^5+68y^6)+(1+2y+4y^2+12y^3+36y^4-8y^5+70y^6)x", seq.q1(d, j).toString());
    // Q1=(1 + y + y^2 + 3*y^3 + 8*y^4 + 23*y^5 + 68*y^6 + O(y^7)) + (1 + 2*y + 4*y^2 + 12*y^3 + 36*y^4 + O(y^5))*x + O(x^2)
    // 2 :: 5 trimQ1=(1 + y + y^2 + 3*y^3 + 8*y^4 + O(y^5)) + (1 + 2*y + 4*y^2 + 12*y^3 + 36*y^4 + O(y^5))*x + O(x^2)
  }

  public void testQ1D() {
    final A342053 seq = new A342053();
    final Polynomial<Z> j = Polynomial.create(1, 1, 1, 3, 8, 23, 68, 215, 680);
    j.setIndeterminate("y");
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, 5);
    final Polynomial<Polynomial<Z>> d = new PolynomialRingField<>(inner).create(Arrays.asList(inner.one(), Polynomial.create(1, 0, 1, 0, 3, 0, 13), Polynomial.create(2, 0, 5, 0, 20, 0, 100)));
    assertEquals("(1+y+y^2+3y^3+8y^4+23y^5+68y^6+215y^7+680y^8)+(1+2y+4y^2+12y^3+36y^4+110y^5+348y^6-164y^7+622y^8)x+(2+5y+14y^2+44y^3+144y^4-832y^5+1099y^6+488y^7+1349y^8)x^2", seq.q1(d, j).toString());
    assertEquals("(y+2y^2+4y^3+12y^4+36y^5+110y^6+348y^7-1096y^8)x+(2y+5y^2+14y^3+44y^4+144y^5-1764y^6+1484y^7-439y^8)x^2", seq.q2(d, j).toString());
    assertEquals("(y+2y^2+8y^3+20y^4+68y^5+202y^6+680y^7)x+(3y+7y^2+33y^3+90y^4+335y^5-1196y^6+1294y^7-841y^8+988y^9+944y^10+2924y^11+2795y^12+8840y^13)x^2", seq.q3(d, j).toString());

    // Q1=(1 + y + y^2 + 3*y^3 + 8*y^4 + 23*y^5 + 68*y^6 + 215*y^7 + 680*y^8 + O(y^9)) + (1 + 2*y + 4*y^2 + 12*y^3 + 36*y^4 + 110*y^5 + 348*y^6 + O(y^7))*x + (2 + 5*y + 14*y^2 + 44*y^3 + 144*y^4 + O(y^5))*x^2 + O(x^3)
    // Q2=O(y^10) + (y + 2*y^2 + 4*y^3 + 12*y^4 + 36*y^5 + 110*y^6 + 348*y^7 + O(y^8))*x + (2*y + 5*y^2 + 14*y^3 + 44*y^4 + 144*y^5 + O(y^6))*x^2 + O(x^3)
    // Q3=(y + 2*y^2 + 8*y^3 + 20*y^4 + 68*y^5 + 202*y^6 + 680*y^7 + O(y^8))*x + (3*y + 7*y^2 + 33*y^3 + 90*y^4 + 335*y^5 + O(y^6))*x^2 + O(x^3)
  }

  /*
D=1 + (1 + y^2 + 3*y^4 + 13*y^6 + O(y^8))*x + (2 + 5*y^2 + 20*y^4 + 100*y^6 + O(y^8))*x^2 + O(x^3)
J=1 + y + y^2 + 3*y^3 + 8*y^4 + 23*y^5 + 68*y^6 + 215*y^7 + 680*y^8 + O(y^9)
3 :: 5 trimQ1=(1 + y + y^2 + 3*y^3 + 8*y^4 + O(y^5)) + (1 + 2*y + 4*y^2 + 12*y^3 + 36*y^4 + O(y^5))*x + (2 + 5*y + 14*y^2 + 44*y^3 + 144*y^4 + O(y^5))*x^2 + O(x^3)
num=O(y^12) + (y^3 + 3*y^4 + 7*y^5 + 19*y^6 + 57*y^7 + 176*y^8 + 557*y^9 + O(y^10))*x + (-y - y^2 - y^6 - y^7 - 11*y^8 + O(y^9))*x^2 + O(x^3)
den=(y^2 + y^3 + y^4 + y^5 + 3*y^6 + 8*y^7 + 23*y^8 + 68*y^9 + 215*y^10 + 680*y^11 + O(y^12)) + (-1 + y + y^3 + y^4 + 2*y^5 + 4*y^6 + 12*y^7 + 29*y^8 + 92*y^9 + 260*y^10 + O(y^11))*x + (y + 3*y^3 + 2*y^4 + 10*y^5 + 11*y^6 + 54*y^7 + 81*y^8 + O(y^9))*x^2 + O(x^3)

Me:
num=(2y+y^3+3y^4+7y^5+19y^6+57y^7+176y^8+557y^9-420y^10+785y^11+323y^12+988y^13+944y^14+2924y^15+2795y^16+8840y^17)x+(y-y^2+2y^3+6y^5-y^6+25y^7-11y^8+36y^9-80y^10+1637y^11+847y^12+4616y^13+3676y^14+17605y^15+12660y^16+68000y^17)x^2
den=(y^2+y^3+y^4+y^5+3y^6+8y^7+23y^8+68y^9+215y^10+680y^11)+(-1+y+y^3+y^4+2y^5+4y^6+12y^7+29y^8+92y^9+260y^10+785y^11+323y^12+988y^13+944y^14+2924y^15+2795y^16+8840y^17)x+(y+3y^3+2y^4+10y^5+11y^6+54y^7+81y^8+296y^9+705y^10+1960y^11+1835y^12+5560y^13+6600y^14+20400y^15+21500y^16+68000y^17)x^2


   */

  public void testAchiralStrongTriangsGf() {
    final A342053 seq = new A342053();
    assertTrue(seq.achiralStrongTriangsGf(3, 2).toString().startsWith("(y+y^2+3y^3+8y^4+23y^5)x^3+(y^2+2y^3+6y^4+18y^5)x^4"));
  }
}
