package irvine.math.r;

import junit.framework.TestCase;

import static irvine.TestUtils.assertEqualsLocal;

/**
 * Tests mathematical functions. Many of the explicit values given here in
 * the tests were computed using the independent Magma number theory
 * package.
 *
 * @author Sean A. Irvine
 */
public class BesselJTest extends TestCase {

  public void testJ0() {
    assertEqualsLocal(Double.NaN, BesselJ.j0(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, BesselJ.j0(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, BesselJ.j0(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(1, BesselJ.j0(0.0), 1E-12);
    // comparisons from Magma
    assertEquals(0.997501562066, BesselJ.j0(0.1), 1E-7);
    assertEquals(0.99002497224, BesselJ.j0(0.2), 1E-7);
    assertEquals(0.977626246538, BesselJ.j0(0.3), 1E-7);
    assertEquals(0.96039822666, BesselJ.j0(0.4), 1E-7);
    assertEquals(0.938469807241, BesselJ.j0(0.5), 1E-7);
    assertEquals(0.912004863497, BesselJ.j0(0.6), 1E-7);
    assertEquals(0.881200888607, BesselJ.j0(0.7), 1E-7);
    assertEquals(-0.260051954902, BesselJ.j0(3), 1E-7);
    assertEquals(-0.292064347651, BesselJ.j0(3.1), 1E-7);
    assertEquals(-0.320188169657, BesselJ.j0(3.2), 1E-7);
    assertEquals(-0.344296260399, BesselJ.j0(3.3), 1E-7);
    assertEquals(-0.364295596762, BesselJ.j0(3.4), 1E-7);
    assertEquals(-0.380127739987, BesselJ.j0(3.5), 1E-7);
    assertEquals(-0.391768983701, BesselJ.j0(3.6), 1E-7);
    assertEquals(-0.399230203371, BesselJ.j0(3.7), 1E-7);
    assertEquals(-0.402556410179, BesselJ.j0(3.8), 1E-7);
    assertEquals(-0.401826014888, BesselJ.j0(3.9), 1E-7);
    assertEquals(-0.397149809864, BesselJ.j0(4), 1E-7);
    assertEquals(-0.388669679836, BesselJ.j0(4.1), 1E-7);
    assertEquals(-0.376557054368, BesselJ.j0(4.2), 1E-7);
    assertEquals(0.122033354593, BesselJ.j0(5.9), 1E-7);
    assertEquals(0.150645257251, BesselJ.j0(6), 1E-7);
    assertEquals(0.177291422243, BesselJ.j0(6.1), 1E-7);
    assertEquals(0.201747222949, BesselJ.j0(6.2), 1E-7);
    assertEquals(-0.11206845611, BesselJ.j0(11.3), 1E-7);
    assertEquals(-0.090214500248, BesselJ.j0(11.4), 1E-7);
    assertEquals(-0.067653948112, BesselJ.j0(11.5), 1E-7);
    assertEquals(0.21498916588, BesselJ.j0(13.5), 1E-7);
    assertEquals(0.210133161369, BesselJ.j0(13.6), 1E-7);
    assertEquals(0.203220832633, BesselJ.j0(13.7), 1E-7);
    assertEquals(0.194335635216, BesselJ.j0(13.8), 1E-7);
    assertEquals(0.183579855458, BesselJ.j0(13.9), 1E-7);
    assertEquals(0.17107347611, BesselJ.j0(14), 1E-7);
    assertEquals(0.156952877033, BesselJ.j0(14.1), 1E-7);
    assertEquals(0.141369384657, BesselJ.j0(14.2), 1E-7);
    assertEquals(0.124487685284, BesselJ.j0(14.3), 1E-7);
    assertEquals(0.10648411849, BesselJ.j0(14.4), 1E-7);
    assertEquals(0.08754486801, BesselJ.j0(14.5), 1E-7);
    assertEquals(0.067864068323, BesselJ.j0(14.6), 1E-7);
    assertEquals(0.047641845902, BesselJ.j0(14.7), 1E-7);
    assertEquals(0.027082314586, BesselJ.j0(14.8), 1E-7);
    assertEquals(0.006391544891, BesselJ.j0(14.9), 1E-7);
    assertEquals(-0.014224472827, BesselJ.j0(15), 1E-7);
    for (double x = 1.0; x < 1E308; x *= Math.PI) {
      assertEqualsLocal(BesselJ.j0(x), BesselJ.j0(-x), 1E-12);
    }
  }

  public void testJ() {
    // comparisons from magma
    assertEquals(2.32661479e-8, BesselJ.j(-10, Constants.HALF_PI), 1E-8);
    assertEquals(2.00949722554e-5, BesselJ.j(-10, Math.PI), 1E-8);
    assertEquals(0.000867553192, BesselJ.j(-10, 4.71238898), 1E-8);
    assertEquals(0.010138456511, BesselJ.j(-10, Constants.TAU), 1E-8);
    assertEquals(0.053709272855, BesselJ.j(-10, 7.85398163), 1E-8);
    assertEquals(0.158734056904, BesselJ.j(-10, 9.42477796), 1E-8);
    assertEquals(-0.251680179192, BesselJ.j(-9, 9.42477796), 1E-8);
    assertEquals(-0.308977242561, BesselJ.j(-9, 10.99557429), 1E-8);
    assertEquals(-0.145109558756, BesselJ.j(-9, 12.56637061), 1E-8);
    assertEquals(0.135269733037, BesselJ.j(-9, 14.13716694), 1E-8);
    assertEquals(3.352197435e-6, BesselJ.j(-8, Constants.HALF_PI), 1E-8);
    assertEquals(0.000696121996, BesselJ.j(-8, Math.PI), 1E-8);
    assertEquals(-0.038799020309, BesselJ.j(-7, 4.71238898), 1E-8);
    assertEquals(-0.157521130112, BesselJ.j(-7, Constants.TAU), 1E-8);
    assertEquals(-0.311413576191, BesselJ.j(-7, 7.85398163), 1E-8);
    assertEquals(0.102813243414, BesselJ.j(-6, 4.71238898), 1E-8);
    assertEquals(0.277688405283, BesselJ.j(-6, Constants.TAU), 1E-8);
    assertEquals(0.345936541248, BesselJ.j(-6, 7.85398163), 1E-8);
    assertEquals(-0.002245357123, BesselJ.j(-5, Constants.HALF_PI), 1E-8);
    assertEquals(-0.052141184367, BesselJ.j(-5, Math.PI), 1E-8);
    assertEquals(-0.223012754165, BesselJ.j(-5, 4.71238898), 1E-8);
    assertEquals(-0.21824040409, BesselJ.j(-5, 14.13716694), 1E-8);
    assertEquals(0.013996039809, BesselJ.j(-4, Constants.HALF_PI), 1E-8);
    assertEquals(0.151424577631, BesselJ.j(-4, Math.PI), 1E-8);
    assertEquals(0.370434519225, BesselJ.j(-4, 4.71238898), 1E-8);
    assertEquals(0.315680466939, BesselJ.j(-4, Constants.TAU), 1E-8);
    assertEquals(-0.069467184594, BesselJ.j(-4, 7.85398163), 1E-8);
    assertEquals(-0.272126244157, BesselJ.j(-4, 9.42477796), 1E-8);
    assertEquals(-0.227004931913, BesselJ.j(-3, 10.99557429), 1E-8);
    assertEquals(-0.096566032838, BesselJ.j(-3, 12.56637061), 1E-8);
    assertEquals(-0.150470089179, BesselJ.j(-2, 7.85398163), 1E-8);
    assertEquals(0.218713705519, BesselJ.j(-2, 9.42477796), 1E-8);
    assertEquals(0.13994066796, BesselJ.j(-2, 10.99557429), 1E-8);
    assertEquals(-0.182101735642, BesselJ.j(-2, 12.56637061), 1E-8);
    assertEquals(-0.129520443743, BesselJ.j(-2, 14.13716694), 1E-8);
    assertEquals(0, BesselJ.j(-1, 0), 1E-8);
    assertEquals(-0.566824088906, BesselJ.j(-1, Constants.HALF_PI), 1E-8);
    assertEquals(-0.28461534318, BesselJ.j(-1, Math.PI), 1E-8);
    assertEquals(-0.176725199112, BesselJ.j(-1, 9.42477796), 1E-8);
    assertEquals(0.176096934095, BesselJ.j(-1, 10.99557429), 1E-8);
    assertEquals(0.154530815584, BesselJ.j(-1, 12.56637061), 1E-8);
    assertEquals(-0.154115070794, BesselJ.j(-1, 14.13716694), 1E-8);
    assertEquals(1, BesselJ.j(0, 0), 1E-8);
    assertEquals(0.472001215768, BesselJ.j(0, Constants.HALF_PI), 1E-8);
    assertEquals(0, BesselJ.j(1, 0), 1E-8);
    assertEquals(0.566824088906, BesselJ.j(1, Constants.HALF_PI), 1E-8);
    assertEquals(0.116061336037, BesselJ.j(6, 9.42477796), 1E-8);
    assertEquals(-0.201014545178, BesselJ.j(6, 10.99557429), 1E-8);
    assertEquals(0.145109558756, BesselJ.j(9, 12.56637061), 1E-8);
    assertEquals(-0.135269733037, BesselJ.j(9, 14.13716694), 1E-8);
    assertEquals(2.32661479e-8, BesselJ.j(10, Constants.HALF_PI), 1E-8);
    assertEquals(2.00949722554e-5, BesselJ.j(10, Math.PI), 1E-8);
    assertEquals(0.000867553192, BesselJ.j(10, 4.71238898), 1E-8);
    assertEquals(0.010138456511, BesselJ.j(10, Constants.TAU), 1E-8);
    assertEquals(0.053709272855, BesselJ.j(10, 7.85398163), 1E-8);
    assertEquals(0.158734056904, BesselJ.j(10, 9.42477796), 1E-8);
    assertEquals(0.280189068832, BesselJ.j(10, 10.99557429), 1E-8);
    assertEquals(0.274228068709, BesselJ.j(10, 12.56637061), 1E-8);
    assertEquals(0.060760032283, BesselJ.j(10, 14.13716694), 1E-8);
  }

  public void testJ2() {
    // NOTE this testing only covers a small area of the possible domain
    // compare to int function
    for (int i = -10; i < 10; ++i) {
      for (double x = Constants.HALF_PI; x < 15.0; x += Constants.HALF_PI) {
        assertEquals(BesselJ.j(i, x), BesselJ.j((double) i, x), 1E-8);
      }
    }
    assertEquals(0.2518929403260009457267700620, BesselJ.j(0.5, 0.1), 1E-8);
    assertEquals(0.3544507442114011032876821833, BesselJ.j(0.5, 0.2), 1E-8);
    assertEquals(0.4304935173281245650200272826, BesselJ.j(0.5, 0.3), 1E-8);
    assertEquals(0.4912770420750676550119142736, BesselJ.j(0.5, 0.4), 1E-8);
    assertEquals(0.5409737899345280913309131346, BesselJ.j(0.5, 0.5), 1E-8);
    assertEquals(0.5816181889041795609759700056, BesselJ.j(0.5, 0.6), 1E-8);
    assertEquals(0.6143610667912650832211755579, BesselJ.j(0.5, 0.7), 1E-8);
    assertEquals(0.1192146987054873405741133227, BesselJ.j(1.5, 0.6), 1E-8);
    assertEquals(0.1482635083201016227379577292, BesselJ.j(1.5, 0.7), 1E-8);
    assertEquals(0.1784020675109651862988770531, BesselJ.j(1.5, 0.8), 1E-8);
    assertEquals(0.2092124839979926676449984235, BesselJ.j(1.5, 0.9), 1E-8);
    assertEquals(0.2402978391234270108958430447, BesselJ.j(1.5, 1.0), 1E-8);
    assertEquals(0.0001680887190033412703341044678, BesselJ.j(2.5, 0.1), 1E-8);
    assertEquals(0.0009488172155374899226967077197, BesselJ.j(2.5, 0.2), 1E-8);
    assertEquals(0.002605301855658667695211226989, BesselJ.j(2.5, 0.3), 1E-8);
    assertEquals(0.0003048577299635901170629272776, BesselJ.j(3.5, 0.4), 1E-8);
    assertEquals(0.0006623785681459423608531730129, BesselJ.j(3.5, 0.5), 1E-8);
    assertEquals(0.001246173154988841880858410229, BesselJ.j(3.5, 0.6), 1E-8);
    assertEquals(0.0003004351580129534871793667673, BesselJ.j(4.5, 0.8), 1E-8);
    assertEquals(0.0005064820136390929100326352692, BesselJ.j(4.5, 0.9), 1E-8);
    assertEquals(0.0008066739042609609487128435529, BesselJ.j(4.5, 1.0), 1E-8);
    assertEquals(0.0000002108337455655421765997471287, BesselJ.j(6.5, 0.6), 1E-8);
    assertEquals(0.0000005717539426973487220336153163, BesselJ.j(6.5, 0.7), 1E-8);
    assertEquals(0.0000000004059631803814844196921211775, BesselJ.j(7.5, 0.4), 1E-8);
    assertEquals(0.000000002158546507176514846551852353, BesselJ.j(7.5, 0.5), 1E-8);
    assertEquals(0.000000008445285894563412067247025126, BesselJ.j(7.5, 0.6), 1E-8);
    assertEquals(0.00000002673329867137677795149279893, BesselJ.j(7.5, 0.7), 1E-8);
    assertEquals(0.00000007245573819455607064937381235, BesselJ.j(7.5, 0.8), 1E-8);
    assertEquals(0.0000001743975330927335573964560775, BesselJ.j(7.5, 0.9), 1E-8);
    assertEquals(0.0000003821974121348042226451653335, BesselJ.j(7.5, 1.0), 1E-8);

  }

  public void testLargeValues() {
    assertEquals(1.938376E-181, BesselJ.j(100.25, 1.2), 1E-187);
    assertEquals(0.095344006588, BesselJ.j(100.25, 100.2), 1E-8);
    assertEquals(1.1643103196232E-120, BesselJ.j(500.25, 225.0), 1E-126);
    assertEquals(0.057970898, BesselJ.j(500.25, 500.5), 1E-6);
    assertEquals(0.021049946532784, BesselJ.j(700.97, 1500.1), 1E-6);
    assertEquals(0.0, BesselJ.j(-700.97, 1500.1));
    assertTrue(Double.isNaN(BesselJ.j(100.25, -1.2)));
  }
  
  public void testBoundaryCases() {
    assertEquals(1.0, BesselJ.j(2.4374546038554372E-264, 3.9315151033026283E-11), 1E-6);
    assertEquals(0.024103149, BesselJ.j(198.43241641588082, 193.08741204770152), 1E-6);
    assertEquals(-5.146275777E-65, BesselJ.j(4.4925120110118124E126, -2.247943801737533E128), 1E-71);
    assertEquals(0.00394089668, BesselJ.j(2113.003358817072, 4460.572162408623), 1E-7);
    assertEquals(-0.0106553644, BesselJ.j(2870.8704249261905, 3198.1487989088773), 1E-7);
  }
  
  /*
  public void testFindCase() {
    final java.util.Random r = new java.util.Random();
    while (true) {
      final double n = Double.longBitsToDouble(r.nextLong());
      if (Double.isNaN(n) || Double.isInfinite(n)) {
        continue;
      }
      final double x = Double.longBitsToDouble(r.nextLong());
      if (Double.isNaN(x) || Double.isInfinite(x)) {
        continue;
      }
      try {
        BesselJ.j(n, x);
      } catch (final RuntimeException e) {
        System.out.println(n + ", " + x);
        fail();
      }
    }
  }
  */
}

