package irvine.factor.prime;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the Prime interface classes.
 * @author Sean A. Irvine
 */
public abstract class AbstractPrimeTest extends TestCase {

  /** The prime validator to be tested */
  protected Prime mP = null;

  @Override
  public void tearDown() throws Exception {
    super.tearDown();
    mP = null;
  }

  /**
   * Test the primality of various small numbers
   */
  public void testSmallNumbers() {
    // test isPrime(long)
    assertTrue("2 is prime", mP.isPrime(2L));
    assertTrue("3 is prime", mP.isPrime(3L));
    assertTrue("5 is prime", mP.isPrime(5L));
    assertTrue("7 is prime", mP.isPrime(7L));
    assertTrue("11 is prime", mP.isPrime(11L));
    assertTrue("13 is prime", mP.isPrime(13L));
    assertTrue("17 is prime", mP.isPrime(17L));
    assertTrue("19 is prime", mP.isPrime(19L));
    assertTrue("0 is composite", !mP.isPrime(0L));
    assertTrue("1 is composite", !mP.isPrime(1L));
    assertTrue("4 is composite", !mP.isPrime(4L));
    assertTrue("6 is composite", !mP.isPrime(6L));
    assertTrue("8 is composite", !mP.isPrime(8L));
    assertTrue("9 is composite", !mP.isPrime(9L));
    assertTrue("25 is composite", !mP.isPrime(25L));
    assertTrue("63 is composite", !mP.isPrime(63L));
    assertTrue("-1 is composite", !mP.isPrime(-1L));
    assertTrue("-2 is composite", !mP.isPrime(-2L));
    assertTrue("-3 is composite", !mP.isPrime(-3L));
  }

  public void testNextPrime() {
    // test nextPrime(long)
    assertEquals(2L, mP.nextPrime(-5L));
    assertEquals(2L, mP.nextPrime(0L));
    assertEquals(2L, mP.nextPrime(1L));
    assertEquals(3L, mP.nextPrime(2L));
    assertEquals(5L, mP.nextPrime(3L));
    assertEquals(5L, mP.nextPrime(4L));
    try {
      mP.nextPrime(9223372036854775783L);
      fail();
    } catch (final ArithmeticException e) {
      // expected
    }
  }

  public void testPrevPrime() {
    // test prevPrime(long)
    assertEquals(0L, mP.prevPrime(-5L));
    assertEquals(0L, mP.prevPrime(0L));
    assertEquals(0L, mP.prevPrime(1L));
    assertEquals(0L, mP.prevPrime(2L));
    assertEquals(2L, mP.prevPrime(3L));
    assertEquals(3L, mP.prevPrime(4L));
    assertEquals(3L, mP.prevPrime(5L));

    // don't do this next test for TrialDivision since it takes a long time
    if (!(mP instanceof TrialDivision)) {
      final long u = mP.prevPrime(Long.MAX_VALUE);
      if (u != 0) {
        assertEquals(9223372036854775783L, u);
      }
    }
  }

  public void testZCrossReference() {
    // xref to Z methods
    for (long i = 0L; i < 1000L; ++i) {
      assertEquals(mP.isPrime(i), mP.isPrime(Z.valueOf(i).longValue()));
      assertEquals(mP.nextPrime(i), mP.nextPrime(Z.valueOf(i).longValue()));
      assertEquals(mP.prevPrime(i), mP.prevPrime(Z.valueOf(i).longValue()));
    }
  }

  private static final Z[] B50 = {
    new Z("593576150699299"),
    new Z("966027290561969"),
    new Z("775584629217901"),
    new Z("651078041182411"),
    new Z("623947753599113"),
    new Z("924061898528347"),
    new Z("570440458710511"),
    new Z("838029662110871"),
    new Z("957405305295611"),
    new Z("1042012626967969"),
    new Z("1063900674423623"),
    new Z("609243197749997"),
    new Z("748864756839389"),
    new Z("840939741778363"),
    new Z("767920318663639"),
    new Z("1065618212284543"),
    new Z("663922097166637"),
    new Z("886046624955419"),
    new Z("788381853290203"),
    new Z("622773166077157"),
    new Z("773390118176779"),
    new Z("891158532753877"),
    new Z("1117113157616999"),
    new Z("1005139565587681"),
    new Z("996925199149387"),
    new Z("843372273423599"),
    new Z("849749867376331"),
    new Z("1050985984906889"),
    new Z("680834849817851"),
    new Z("906994804516049"),
    new Z("697435175748583"),
    new Z("1066711398682697"),
    new Z("1075778365684837"),
    new Z("1024280269498141"),
    new Z("946094363640493"),
    new Z("999742719818797"),
    new Z("1060956109864363"),
    new Z("610598022401797"),
    new Z("684825159663377"),
    new Z("692144910592313"),
    new Z("802537127656931"),
    new Z("899081393699473"),
    new Z("748370132038861"),
    new Z("804009819345259"),
    new Z("584791493123641"),
    new Z("978080745659029"),
    new Z("793430044176307"),
    new Z("818572284131597"),
    new Z("1026402113326433"),
    new Z("1000402908999587"),
  };

  public void test50bitPrimes() {
    for (final Z b50 : B50) {
      assertTrue(String.valueOf(b50), mP.isPrime(b50));
    }
  }

  public void test50bitComposites() {
    for (final Z b50 : B50) {
      assertTrue(String.valueOf(b50), !mP.isPrime(b50.add(Z.TWO)));
    }
  }

}
