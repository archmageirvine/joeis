package irvine.math.group;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test factorial computers.
 *
 * @author Sean A. Irvine
 */
public class RingFactorialTest extends TestCase {

  public void testBad() {
    final RingFactorial<Z> f = RingFactorial.instance(Integers.SINGLETON);
    try {
      f.factorial(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("n must be nonnegative", e.getMessage());
    }
    try {
      f.factorial(-2);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("n must be nonnegative", e.getMessage());
    }
    try {
      f.factorial(-1000);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("n must be nonnegative", e.getMessage());
    }
  }

  public void testGood() {
    final RingFactorial<Z> f = RingFactorial.instance(Integers.SINGLETON);
    assertEquals(Z.ONE, f.factorial(0));
    assertEquals(Z.ONE, f.factorial(1));
    assertEquals("2", f.factorial(2).toString());
    assertEquals("6", f.factorial(3).toString());
    assertEquals("24", f.factorial(4).toString());
    assertEquals("120 ", "120", f.factorial(5).toString());
    assertEquals("720", "720", f.factorial(6).toString());
    assertEquals("3628800", f.factorial(10).toString());
    assertEquals("2432902008176640000", f.factorial(20).toString());
    assertEquals("265252859812191058636308480000000", f.factorial(30).toString());
    assertEquals("30414093201713378043612608166064768844377641568960512000000000000", f.factorial(50).toString());
    assertEquals("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000", f.factorial(100).toString());
    assertEquals("788657867364790503552363213932185062295135977687173263294742533244359449963403342920304284011984623904177212138919638830257642790242637105061926624952829931113462857270763317237396988943922445621451664240254033291864131227428294853277524242407573903240321257405579568660226031904170324062351700858796178922222789623703897374720000000000000000000000000000000000000000000000000", f.factorial(200).toString());
  }

  public void testSingleton() {
    assertEquals(RingFactorial.instance(Integers.SINGLETON), RingFactorial.instance(Integers.SINGLETON));
    assertEquals(RingFactorial.instance(Rationals.SINGLETON), RingFactorial.instance(Rationals.SINGLETON));
    assertFalse(RingFactorial.instance(Integers.SINGLETON).equals(RingFactorial.instance(Rationals.SINGLETON)));
  }

  public void testRationals() {
    final RingFactorial<Q> f = RingFactorial.instance(Rationals.SINGLETON);
    assertEquals(Q.ONE, f.factorial(0));
    assertEquals(Q.ONE, f.factorial(1));
    assertEquals("2", f.factorial(2).toString());
    assertEquals("6", f.factorial(3).toString());
    assertEquals("24", f.factorial(4).toString());
    assertEquals("120 ", "120", f.factorial(5).toString());
    assertEquals("720", "720", f.factorial(6).toString());
  }
}
