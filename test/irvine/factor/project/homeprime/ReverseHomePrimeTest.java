package irvine.factor.project.homeprime;

import java.util.Arrays;
import java.util.List;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ReverseHomePrimeTest extends TestCase {

  public void test() {
    final List<Z> nums = ReverseHomePrime.homePrimeTree(new Z("3331113965338635107"), 10);
    final Z[] v = nums.toArray(new Z[0]);
    Arrays.sort(v);
    assertEquals(27, v.length);
    assertEquals(8, v[0].intValue());
    assertEquals(126, v[1].intValue());
    assertEquals(222, v[2].intValue());
    assertEquals(674, v[3].intValue());
    assertEquals(851, v[4].intValue());
    assertEquals(2337, v[5].intValue());
    assertEquals(29171, v[6].intValue());
    assertEquals(31941, v[7].intValue());
    assertEquals(600021, v[8].intValue());
    assertEquals(33371313, v[9].intValue());
    assertEquals(311123771, v[10].intValue());
    assertEquals(1810744282L, v[11].longValue());
    assertEquals(6168338997L, v[12].longValue());
    assertEquals(7149317941L, v[13].longValue());
    assertEquals(22931219729L, v[14].longValue());
    assertEquals(32056112999L, v[15].longValue());
    assertEquals(45544485717L, v[16].longValue());
    assertEquals(50962978611L, v[17].longValue());
    assertEquals(112084656339L, v[18].longValue());
    assertEquals(3347911118189L, v[19].longValue());
    assertEquals(11613496501723L, v[20].longValue());
    assertEquals(27182240085289L, v[21].longValue());
    assertEquals(97130517917327L, v[22].longValue());
    assertEquals(531832651281459L, v[23].longValue());
    assertEquals(280025688047715963L, v[24].longValue());
    assertEquals(993341896015905321L, v[25].longValue());
    assertEquals(3331113965338635107L, v[26].longValue());
  }

  public void testBad() {
    try {
      ReverseHomePrime.homePrimeTree(null, 10);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testUnit() {
    assertEquals(1, ReverseHomePrime.homePrimeTree(Z.ONE, 10).size());
    assertEquals(1, ReverseHomePrime.homePrimeTree(Z.TWO, 10).size());
    assertEquals(1, ReverseHomePrime.homePrimeTree(Z.THREE, 10).size());
  }
}

