package irvine.factor.prime;

import irvine.math.z.Z;

/**
 * Tests the fast prime tester.
 *
 * @author Sean A. Irvine
 */
public class FastTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Fast();
  }

  // test against the Cullen numbers
  public void testCullen() {
    final Fast fast = new Fast();
    for (int i = 1; i < 200; ++i) {
      // n = i*2^i+1
      final Z n = Z.valueOf(i).shiftLeft(i).setBit(0);
      if (i != 141 && i != 1) {
        assertTrue(String.valueOf(n), !fast.isPrime(n));
      } else {
        assertTrue(String.valueOf(n), fast.isPrime(n));
      }
    }
  }

  // test against Mersenne numbers
  public void testMersenne() {
    final Fast fast = new Fast();
    for (int i = 4; i < 200; ++i) {
      // n = 2^i-1
      final Z n = Z.ONE.shiftLeft(i).subtract(Z.ONE);
      switch (i) {
      case 5:
      case 7:
      case 13:
      case 17:
      case 19:
      case 31:
      case 61:
      case 89:
      case 107:
      case 127:
        assertTrue(String.valueOf(n), fast.isPrime(n));
        break;
      default:
        assertTrue(String.valueOf(n), !fast.isPrime(n));
      }
    }

    // big ones
    assertTrue(fast.isPrime(Z.ONE.shiftLeft(21701).subtract(Z.ONE)));
    assertTrue(fast.isPrime(Z.ONE.shiftLeft(44497).subtract(Z.ONE)));
    assertTrue(!fast.isPrime(Z.ONE.shiftLeft(44498).subtract(Z.ONE)));
    assertTrue(!fast.isPrime(Z.ONE.shiftLeft(44501).subtract(Z.ONE)));
    // Next ones comment out because too slow
    //    assertTrue(fast.isPrime(Z.ONE.shiftLeft(1257787).subtract(Z.ONE)));
    //    assertTrue(!fast.isPrime(Z.ONE.shiftLeft(1257788).subtract(Z.ONE)));
  }

  /**
   * Test a number which was a bug in earlier versions.
   *
   */
  public void testBuggy() {
    assertFalse(new Fast().isPrime(29341L));
  }

}
