package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Tests mathematical functions. Many of the explicit values given here in
 * the tests were computed using the independent Magma number theory
 * package.
 *
 * @author Sean A. Irvine
 */
public class EllipticTest extends TestCase {

  public void testK() {
    // test special cases
    assertEqualsLocal(Double.NaN, Elliptic.k(1.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(-0.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Double.NaN), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Elliptic.k(0.0), 1.0E-12);
    assertEqualsLocal(Constants.HALF_PI, Elliptic.k(1.0), 1.0E-12);

    assertEquals(1.61244134872021939822991636037, Elliptic.k(0.9), 1.0E-12);
    assertEquals(1.65962359861052800085124765635, Elliptic.k(0.8), 1.0E-12);
    assertEquals(1.71388944817879106203893484190, Elliptic.k(0.7), 1.0E-12);
    assertEquals(1.77751937149125332350299005797, Elliptic.k(0.6), 1.0E-12);
    assertEquals(1.85407467730137191843385033575, Elliptic.k(0.5), 1.0E-12);
    assertEquals(1.94956774980602588266177077843, Elliptic.k(0.4), 1.0E-12);
    assertEquals(2.075363135292469143853440541761, Elliptic.k(0.3), 1.0E-12);
    assertEquals(2.257205326820853655083255986802, Elliptic.k(0.2), 1.0E-12);
    assertEquals(2.57809211334817318820257068375, Elliptic.k(0.1), 1.0E-12);
  }

  public void testK2() {
    // test special cases
    assertEqualsLocal(Double.NaN, Elliptic.k(Constants.HALF_PI, 1.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Constants.HALF_PI, -0.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Constants.HALF_PI, Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Constants.HALF_PI, Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.k(Constants.HALF_PI, Double.NaN), 1.0E-12);
    assertEqualsLocal(Constants.HALF_PI, Elliptic.k(Constants.HALF_PI, 0.0), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Elliptic.k(Constants.HALF_PI, 1.0), 1.0E-12);

    for (double phi = -5.0; phi < 5.0; phi += 0.1) {
      assertEquals(phi, Elliptic.k(phi, 0.0), 1.0E-8);
    }
    for (double m = 0.0; m < 1.0; m += 0.01) {
      assertEquals(Elliptic.k(1.0 - m), Elliptic.k(Constants.HALF_PI, m), 1.0E-6);
    }
    // spot checks
    assertEquals(0.100016640833863363074646313172, Elliptic.k(0.1, 0.1), 1.0E-8);
    assertEquals(0.100033296623084890253551871506, Elliptic.k(0.1, 0.2), 1.0E-8);
    assertEquals(0.100049967394351275989623033940, Elliptic.k(0.1, 0.3), 1.0E-8);
    assertEquals(0.100066653174421872279941764755, Elliptic.k(0.1, 0.4), 1.0E-8);
    assertEquals(0.100083353990128956464690752464, Elliptic.k(0.1, 0.5), 1.0E-8);
    assertEquals(0.100100069868378000274907358727, Elliptic.k(0.1, 0.6), 1.0E-8);
    assertEquals(0.100116800836147940136122643737, Elliptic.k(0.1, 0.7), 1.0E-8);
    assertEquals(0.100133546920491448734988597049, Elliptic.k(0.1, 0.8), 1.0E-8);
    assertEquals(0.100150308148535207856043943385, Elliptic.k(0.1, 0.9), 1.0E-8);
    assertEquals(5.65933025469786656088713914501, Elliptic.k(5.5, 0.1), 1.0E-8);
    assertEquals(5.84044701363284824015670359732, Elliptic.k(5.5, 0.2), 1.0E-8);
    assertEquals(6.0494984733726151357363470281589, Elliptic.k(5.5, 0.3), 1.0E-8);
    assertEquals(6.295563093874344657350751107697, Elliptic.k(5.5, 0.4), 1.0E-8);
    assertEquals(6.59283507754173717500242725791, Elliptic.k(5.5, 0.5), 1.0E-8);
    assertEquals(6.96530342132374730745464667236, Elliptic.k(5.5, 0.6), 1.0E-8);
    assertEquals(7.458353702044185455616246634625, Elliptic.k(5.5, 0.7), 1.0E-8);
    assertEquals(8.174875714990540808288244536644, Elliptic.k(5.5, 0.8), 1.0E-8);
    assertEquals(9.446751979728035848464936088265, Elliptic.k(5.5, 0.9), 1.0E-8);
  }


  public void testE() {
    // test special cases
    assertEqualsLocal(Double.NaN, Elliptic.e(1.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(-0.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Double.NaN), 1.0E-12);
    assertEqualsLocal(Constants.HALF_PI, Elliptic.e(1.0), 1.0E-12);
    assertEqualsLocal(1.0, Elliptic.e(0.0), 1.0E-12);

    assertEquals(1.530757636897763202469069076770, Elliptic.e(0.9), 1.0E-12);
    assertEquals(1.489035058095852929441653885523, Elliptic.e(0.8), 1.0E-12);
    assertEquals(1.445363064412665262011617601547, Elliptic.e(0.7), 1.0E-12);
    assertEquals(1.399392138897432250263138553481, Elliptic.e(0.6), 1.0E-12);
    assertEquals(1.350643881047675502520174789655, Elliptic.e(0.5), 1.0E-12);
    assertEquals(1.298428035046913167597731641383, Elliptic.e(0.4), 1.0E-12);
    assertEquals(1.241670567945822750871511327033, Elliptic.e(0.3), 1.0E-12);
    assertEquals(1.178489924327838522967340233999, Elliptic.e(0.2), 1.0E-12);
    assertEquals(1.104774732704073326090398870519, Elliptic.e(0.1), 1.0E-12);
  }

  public void testE2() {
    // test special cases
    assertEqualsLocal(Double.NaN, Elliptic.e(Constants.HALF_PI, 1.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Constants.HALF_PI, -0.1), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Constants.HALF_PI, Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Constants.HALF_PI, Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NaN, Elliptic.e(Constants.HALF_PI, Double.NaN), 1.0E-12);
    assertEqualsLocal(Constants.HALF_PI, Elliptic.e(Constants.HALF_PI, 0.0), 1.0E-12);
    assertEqualsLocal(1.0, Elliptic.e(Constants.HALF_PI, 1.0), 1.0E-12);

    for (double phi = -5.0; phi < 5.0; phi += 0.1) {
      assertEquals(phi, Elliptic.e(phi, 0.0), 1.0E-8);
    }
    for (double m = 0.0; m < 1.0; m += 0.01) {
      assertEquals(Elliptic.e(1.0 - m), Elliptic.e(Constants.HALF_PI, m), 1.0E-6);
    }
    // spot checks
    assertEquals(0.099983364145928921451215833335, Elliptic.e(0.1, 0.1), 1.0E-8);
    assertEquals(0.099966723310290240133497073823, Elliptic.e(0.1, 0.2), 1.0E-8);
    assertEquals(0.099950077487752828851109815514, Elliptic.e(0.1, 0.3), 1.0E-8);
    assertEquals(0.099933426672975197704850674845, Elliptic.e(0.1, 0.4), 1.0E-8);
    assertEquals(0.099916770860605464399419249470, Elliptic.e(0.1, 0.5), 1.0E-8);
    assertEquals(0.099900110045281324437555272726, Elliptic.e(0.1, 0.6), 1.0E-8);
    assertEquals(0.099883444221630021200399348759, Elliptic.e(0.1, 0.7), 1.0E-8);
    assertEquals(0.099866773384268315913533038981, Elliptic.e(0.1, 0.8), 1.0E-8);
    assertEquals(0.099850097527802457498150935216, Elliptic.e(0.1, 0.9), 1.0E-8);
    assertEquals(5.346980987443452304476673998880, Elliptic.e(5.5, 0.1), 1.0E-8);
    assertEquals(5.187342717976376454519995637554, Elliptic.e(5.5, 0.2), 1.0E-8);
    assertEquals(5.0200300899892930481027669079195, Elliptic.e(5.5, 0.3), 1.0E-8);
    assertEquals(4.84365284019499057045552525338, Elliptic.e(5.5, 0.4), 1.0E-8);
    assertEquals(4.65630611632027286828077794822, Elliptic.e(5.5, 0.5), 1.0E-8);
    assertEquals(4.455238769082028579962025503756, Elliptic.e(5.5, 0.6), 1.0E-8);
    assertEquals(4.236165892102360590578080087057, Elliptic.e(5.5, 0.7), 1.0E-8);
    assertEquals(3.99157413336128954790873646329, Elliptic.e(5.5, 0.8), 1.0E-8);
    assertEquals(3.70503290481536918681725817279, Elliptic.e(5.5, 0.9), 1.0E-8);

  }

  public void testsn() {
    // test m = 0, 1, -1
    for (double x = -1.0; x < 1.0; x += 0.01) {
      assertEquals(Math.sin(x), Elliptic.sn(x, 0.0), 1.0E-8);
      assertEquals(Math.tanh(x), Elliptic.sn(x, 1.0), 1.0E-8);
    }
  }

  public void testcn() {
    // test m = 0, 1, -1
    for (double x = -1.0; x < 1.0; x += 0.01) {
      assertEquals(Math.cos(x), Elliptic.cn(x, 0.0), 1.0E-8);
      assertEquals(1.0 / Math.cosh(x), Elliptic.cn(x, 1.0), 1.0E-8);
    }
  }

  public void testdn() {
    // test m = 0, 1, -1
    for (double x = -1.0; x < 1.0; x += 0.01) {
      assertEquals(1.0, Elliptic.dn(x, 0.0), 1.0E-8);
      assertEquals(1.0 / Math.cosh(x), Elliptic.dn(x, 1.0), 1.0E-8);
    }
  }

  public void testsncn() {
    for (double x = -3.0; x < 3.0; x += 0.1) {
      for (double m = 0.01; m < 1.0; m += 0.01) {
        final double sn = Elliptic.sn(x, m);
        final double cn = Elliptic.cn(x, m);
        assertEqualsLocal(1.0, sn * sn + cn * cn, 1.0E-10);
      }
    }
  }

  public void testsndn() {
    for (double x = -3.0; x < 3.0; x += 0.1) {
      for (double m = 0.01; m < 1.0; m += 0.01) {
        final double sn = Elliptic.sn(x, m);
        final double dn = Elliptic.dn(x, m);
        assertEqualsLocal("sn(" + x + "," + m + ")", 1.0, m * sn * sn + dn * dn, 1.0E-3);
      }
    }
  }


  public void testPhi() {
    // don't know kow to test this fn
    assertEqualsLocal(Double.NaN, Elliptic.phi(Double.NaN, Double.NaN), 1.0E-10);
  }


}

