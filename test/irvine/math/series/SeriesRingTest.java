package irvine.math.series;

import irvine.math.group.IntegerField;
import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SeriesRingTest extends TestCase {

  private final Series<Q> mS = Series.toQ(Series.create(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9));
  private final Series<Q> mT = Series.toQ(Series.create(2, 7, 1, 8, 2, 8, 1, 8, 2, 8, 4, 5, 9, 0));

  public void testZero() {
    assertEquals("0", SeriesRing.SQ.toString(SeriesRing.SQ.zero(), 10));
  }

  public void testOne() {
    assertEquals("1", SeriesRing.SQ.toString(SeriesRing.SQ.one(), 10));
  }

  public void testX() {
    assertEquals("x", SeriesRing.SQ.toString(SeriesRing.SQ.x(), 10));
  }

  public void testToString() {
    assertEquals("\\Q[x]", SeriesRing.SQ.toString());
    assertEquals("\\Z[x]", SeriesRing.SZ.toString());
  }

  public void testNegate() {
    assertEquals("-3-x-4*x^2-x^3-5*x^4-9*x^5-2*x^6-6*x^7-5*x^8-3*x^9-5*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.negate(mS), 10));
  }

  public void testAdd() {
    assertEquals("5+8*x+5*x^2+9*x^3+7*x^4+17*x^5+3*x^6+14*x^7+7*x^8+11*x^9+9*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.add(mS, mT), 10));
  }

  public void testSubtract() {
    assertEquals("1-6*x+3*x^2-7*x^3+3*x^4+x^5+x^6-2*x^7+3*x^8-5*x^9+x^10", SeriesRing.SQ.toString(SeriesRing.SQ.subtract(mS, mT), 10));
  }

  public void testMultiply() {
    assertEquals("6+23*x+18*x^2+55*x^3+35*x^4+112*x^5+99*x^6+134*x^7+162*x^8+180*x^9+201*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.multiply(mS, mT), 10));
  }

  public void testMultiplyConstant() {
    assertEquals("(3/2)+(1/2)*x+2*x^2+(1/2)*x^3+(5/2)*x^4+(9/2)*x^5+x^6+3*x^7+(5/2)*x^8+(3/2)*x^9+(5/2)*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.multiply(mS, Q.HALF), 10));
  }

  public void testDivideConstant() {
    assertEquals("(3/2)+(1/2)*x+2*x^2+(1/2)*x^3+(5/2)*x^4+(9/2)*x^5+x^6+3*x^7+(5/2)*x^8+(3/2)*x^9+(5/2)*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.divide(mS, Q.TWO), 10));
  }

  public void testHadamardMultiply() {
    assertEquals("6+7*x+4*x^2+8*x^3+10*x^4+72*x^5+2*x^6+48*x^7+10*x^8+24*x^9+20*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.hadamardMultiply(mS, mT), 10));
  }

  public void testShift() {
    assertEquals("3*x^2+x^3+4*x^4+x^5+5*x^6+9*x^7+2*x^8+6*x^9+5*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.shift(mS, 2), 10));
    assertEquals("4+x+5*x^2+9*x^3+2*x^4+6*x^5+5*x^6+3*x^7+5*x^8+8*x^9+9*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.shift(mS, -2), 10));
  }

  public void testDiff() {
    assertEquals("1+8*x+3*x^2+20*x^3+45*x^4+12*x^5+42*x^6+40*x^7+27*x^8+50*x^9+88*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.diff(mS), 10));
  }

  public void testIntegrate() {
    assertEquals("3*x+(1/2)*x^2+(4/3)*x^3+(1/4)*x^4+x^5+(3/2)*x^6+(2/7)*x^7+(3/4)*x^8+(5/9)*x^9+(3/10)*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.integrate(mS), 10));
  }

  public void testTruncate() {
    assertEquals("3+x+4*x^2+x^3", SeriesRing.SQ.toString(SeriesRing.SQ.truncate(mS, 3), 10));
    assertEquals("x^3+5*x^4+9*x^5+2*x^6+6*x^7+5*x^8+3*x^9+5*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.leftTruncate(mS, 3), 10));
  }

  public void testXToTheN() {
    assertEquals("1+(1/3)*x^5", SeriesRing.SQ.toString(SeriesRing.SQ.onePlusXToTheN(Q.ONE_THIRD, 5), 10));
    assertEquals("1-(1/3)*x^5", SeriesRing.SQ.toString(SeriesRing.SQ.oneMinusXToTheN(Q.ONE_THIRD, 5), 10));
    assertEquals("(1/3)*x^5", SeriesRing.SQ.toString(SeriesRing.SQ.monomial(Q.ONE_THIRD, 5), 10));
  }

  public void testSquare() {
    assertEquals("9+6*x+25*x^2+14*x^3+48*x^4+72*x^5+71*x^6+122*x^7+101*x^8+170*x^9+189*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.square(mS), 10));
  }

  public void testPow() {
    assertEquals("1", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, 0), 10));
    assertEquals("3+x+4*x^2+x^3+5*x^4+9*x^5+2*x^6+6*x^7+5*x^8+3*x^9+5*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, 1), 10));
    assertEquals("9+6*x+25*x^2+14*x^3+48*x^4+72*x^5+71*x^6+122*x^7+101*x^8+170*x^9+189*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, 2), 10));
    assertEquals("2187+5103*x+25515*x^2+48762*x^3+152334*x^4+297675*x^5+701589*x^6+1368676*x^7+2652517*x^8+5027533*x^9+8798440*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, 7), 10));
    assertEquals("2187+5103*x+25515*x^2+48762*x^3+152334*x^4+297675*x^5+701589*x^6+1368676*x^7+2652517*x^8+5027533*x^9+8798440*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, Z.SEVEN), 10));
    assertEquals("27*x^9+27*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(SeriesRing.SQ.shift(mS, 3), 3), 10));
    assertEquals("(1/27)-(1/27)*x-(10/81)*x^2+(107/729)*x^3+(74/729)*x^4-(1054/2187)*x^5+(11674/19683)*x^6+(5989/6561)*x^7-(47047/19683)*x^8+(118853/531441)*x^9+(2443513/531441)*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.pow(mS, -3), 10));
  }

  public void testSubstitutePower() {
    assertEquals("3+x^3+4*x^6+x^9", SeriesRing.SQ.toString(SeriesRing.SQ.substitute(mS, 3), 10));
  }

  public void testSubstitute() {
    assertEquals("9229+291291*x+4243167*x^2+37880715*x^3+233735158*x^4+1076007888*x^5+3940147465*x^6+12163627032*x^7+33121502725*x^8+81749854752*x^9+186010480207*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.substitute(SeriesRing.SQ.toPolynomial(mS, 10), mT), 10));
  }

  public void testSerlaplace() {
    assertEquals("3+x+8*x^2+6*x^3+120*x^4+1080*x^5+1440*x^6+30240*x^7+201600*x^8+1088640*x^9+18144000*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.serlaplace(mS), 10));
  }

  public void testEval() {
    assertEquals(Q.valueOf(404340), SeriesRing.SQ.eval(mS, Q.THREE, 10));
  }

  public void testEta() {
    assertEquals("1-x-x^2+x^5+x^7", SeriesRing.SQ.toString(SeriesRing.SQ.eta(), 10));
  }

  public void testCoefficientField() {
    assertEquals(IntegerField.SINGLETON, SeriesRing.SZ.coefficientField());
  }

  public void testDivide() {
    assertEquals("(3/2)-(19/4)*x+(143/8)*x^2-(1051/16)*x^3+(7711/32)*x^4-(56243/64)*x^5+(412087/128)*x^6-(3020523/256)*x^7+(22136079/512)*x^8-(162224739/1024)*x^9+(1188856103/2048)*x^10", SeriesRing.SQ.toString(SeriesRing.SQ.divide(mS, mT), 10));
    final Series<Q> u = SeriesRing.SQ.divide(mS, SeriesRing.SQ.shift(mT, 3));
    assertEquals("-(1051/16)+(7711/32)*x-(56243/64)*x^2+(412087/128)*x^3-(3020523/256)*x^4+(22136079/512)*x^5-(162224739/1024)*x^6+(1188856103/2048)*x^7-(8712448667/4096)*x^8+(63848643839/8192)*x^9-(467910725011/16384)*x^10", SeriesRing.SQ.toString(u, 10));
    assertEquals(new Q(3, 2), u.coeff(-3)); // Laurent-style terms also exist
  }

}
