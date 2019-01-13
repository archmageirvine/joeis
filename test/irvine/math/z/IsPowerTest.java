package irvine.math.z;

import irvine.factor.prime.Fast;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IsPowerTest extends TestCase {

  public void testIsPower() {
    Z z = new Z("3362095853201812742282475234995233875224247377");
    assertEquals(17, z.isPower().intValue());
    assertEquals(37, z.auxiliary());
    z = new Z("23579862807187687270915313889834048690556871023829152733062311506561028146244314879478806519361845498904579826227019968983967192710216633345597491195626684673666959874708516228234332288173459509561908213732873901398271741064628594189926945355044108161317352198460118072013814539011542209051668701409145841805366983246618645655779121972948894886676912361877345615021511506250828646843694573155972074515603033581189168543554710070073376373326794579475250356603913698792557690539111061554925258295924685969394666898079644291260322355946672280611514187651532095138758113520189009440510406666758310019625614576840096538743501197696523017351009");
    assertEquals(17, z.isPower().intValue());
    assertEquals(37 * 7 * 2, z.auxiliary());
    final Z y = new Z("219846011807201381453901154220905166870140914584180536698324661864565577912197294889");
    z = y.pow(60);
    assertEquals(y, z.isPower());
    assertEquals(60, z.auxiliary());
  }

  public void testPowersOf2() {
    Z z = Z.FOUR;
    final int step = 3;
    for (int k = 2; k < 100; k += step, z = z.shiftLeft(step)) {
      assertEquals(Z.TWO, z.isPower());
      assertEquals(k, z.auxiliary());
    }
  }

  public void test1() {
    final Z z = Z.valueOf(1540798875);
    assertEquals(Z.valueOf(3 * 5 * 7 * 11), z.isPower());
    assertEquals(3, z.auxiliary());
  }

  public void test2() {
    final Z z = Z.valueOf(1073741827);
    final Z z6 = z.square().multiply(z).square();
    assertEquals(z, z6.isPower());
    assertEquals(6, z6.auxiliary());
  }

  public void testBug1() {
    final Z z = new Z("1172584768329999741660840635081835605015307491");
    // [ <570084733, 1>, <666966283, 1>, <1309620359, 1>, <1473349099, 1>, <1598269009, 1> ]
    final Z zz = z.pow(223);
    assertEquals(z, zz.isPower());
    assertEquals(223, zz.auxiliary());
  }

  public void testEight() {
    final Z z = Z.EIGHT;
    assertEquals(Z.TWO, z.isPower());
    assertEquals(3, z.auxiliary());
  }

  public void testNine() {
    final Z z = Z.NINE;
    assertEquals(Z.THREE, z.isPower());
    assertEquals(2, z.auxiliary());
  }

  public void test27() {
    final Z z = Z.valueOf(27);
    assertEquals(Z.THREE, z.isPower());
    assertEquals(3, z.auxiliary());
  }

  public void test36() {
    final Z z = Z.valueOf(36);
    assertEquals(Z.SIX, z.isPower());
    assertEquals(2, z.auxiliary());
  }

  public void test81() {
    final Z z = Z.valueOf(81);
    assertEquals(Z.THREE, z.isPower());
    assertEquals(4, z.auxiliary());
  }

  public void test32749() {
    final Z z = Z.valueOf(32749).pow(32749);
    assertEquals(32749, z.isPower().intValue());
    assertEquals(32749, z.auxiliary());
  }

  private void checkNonPower(final Z n) {
    assertNull(n.isPower());
    assertEquals(1, n.auxiliary());
  }

  public void testNonPower() {
    checkNonPower(Z.TWO.negate());
    checkNonPower(Z.TWO);
    checkNonPower(Z.THREE);
    checkNonPower(Z.FIVE);
    checkNonPower(Z.SEVEN);
    checkNonPower(Z.valueOf(11));
    checkNonPower(Z.valueOf(13));
    checkNonPower(Z.SIX);
    checkNonPower(Z.TEN);
    checkNonPower(Z.valueOf(15));
    checkNonPower(Z.valueOf(9009));
    checkNonPower(new Z("411111111111111111111111111111111111111111111111111111113343333333333333333333457"));
  }

  public void testRandomSelection() {
    final Random r = new Random();
    final Fast prime = new Fast();
    for (int k = 2; k < 333; k += 13) {
      final int pc = 1 + r.nextInt(5);
      Z base = Z.ONE;
      for (int j = 0; j < pc; ++j) {
        final long v = prime.nextPrime(r.nextInt(Integer.MAX_VALUE));
        final Z vv = Z.valueOf(v);
        if (!base.mod(vv).equals(Z.ZERO)) {
          base = base.multiply(vv);
        }
      }
      if (!Z.ONE.equals(base)) {
        final Z power = base.pow(k);
        //System.err.println("base = " + base + " power = " + k);
        assertEquals(base, power.isPower());
        assertEquals(k, power.auxiliary());
      }
    }
  }
}
