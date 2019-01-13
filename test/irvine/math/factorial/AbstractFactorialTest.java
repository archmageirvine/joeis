package irvine.math.factorial;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test factorial computers.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractFactorialTest extends TestCase {


  /** Get the instance to be tested. */
  public abstract Factorial getInstance();

  public void testBad() {
    final Factorial f = getInstance();
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
    final Factorial f = getInstance();
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
    //    assertEquals(-1590020225, f.factorial(1000).hashCode());
    //    assertEquals(1488333268, f.factorial(10000).hashCode());
  }

  public void testDoubleFactorial() {
    final Factorial f = getInstance();
    try {
      assertEquals(Z.ONE, f.doubleFactorial(1));
      assertEquals(Z.TWO, f.doubleFactorial(2));
      assertEquals(Z.THREE, f.doubleFactorial(3));
      assertEquals(Z.EIGHT, f.doubleFactorial(4));
      assertEquals(Z.valueOf(15), f.doubleFactorial(5));
      assertEquals(Z.valueOf(48), f.doubleFactorial(6));
      assertEquals(Z.valueOf(105), f.doubleFactorial(7));
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  /*
  public void testHard() {
    Factorial f = getInstance();
    //    assertEquals(1306767119, f.factorial(55109).hashCode());
    //    assertEquals(1983912948, f.factorial(55110).hashCode());
    //    assertEquals(1843000065, f.factorial(55111).hashCode());
    //    assertEquals(656925996, f.factorial(55112).hashCode());
  }
  */

  /*
  public void testTiming() {
    final Factorial f = getInstance();
    int h = 0;
    final long t = System.currentTimeMillis();
    for (int i = 0; i < 2000; ++i) {
      h ^= f.factorial(i).hashCode();
    }
    System.err.println(f.getClass().getName() + " " + (System.currentTimeMillis() - t) + " to get " + Integer.toHexString(h));
    final long t2 = System.currentTimeMillis();
    h = f.factorial(20000).hashCode();
    System.err.println(f.getClass().getName() + " " + (System.currentTimeMillis() - t2) + " to get " + Integer.toHexString(h));
  }
  */

}
