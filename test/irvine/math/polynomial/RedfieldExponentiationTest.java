package irvine.math.polynomial;

import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RedfieldExponentiationTest extends TestCase {

  public void testC() {
    final CycleIndex b = new CycleIndex("B", MultivariateMonomial.create(1, 4), MultivariateMonomial.create(2, 2));
    b.multiply(Q.HALF);
    assertEquals("J_1(B)*J_1(B) = 2x_2^2 + 6x_1^4", RedfieldExponentiation.j(b, 1).pow(RedfieldMultiply.OP, 2, Integer.MAX_VALUE).toString());
    assertEquals("J_2(B) = x_4 + (3/2)x_2^2 + 3x_1^2x_2 + (1/2)x_1^4", RedfieldExponentiation.j(b, 2).toString());
  }

  public void testS2S3() {
    final CycleIndex zs2s3 = SymmetricGroup.create(2).cycleIndex().op(StandardMultiply.OP, SymmetricGroup.create(3).cycleIndex());
    assertEquals("Z(S2)*Z(S3) = (1/6)x_2x_3 + (1/4)x_1x_2^2 + (1/6)x_1^2x_3 + (1/3)x_1^3x_2 + (1/12)x_1^5", zs2s3.toString());
    assertEquals("J_1(Z(S2)*Z(S3)) = (1/6)x_2x_3 + (1/4)x_1x_2^2 + (1/6)x_1^2x_3 + (1/3)x_1^3x_2 + (1/12)x_1^5", RedfieldExponentiation.j(zs2s3, 1).toString());
    // Equation (7.4.15) in Graphical Enumeration
    assertEquals("J_2(Z(S2)*Z(S3)) = (1/6)x_2x_3 + (1/2)x_1x_4 + (5/4)x_1x_2^2 + (1/6)x_1^2x_3 + (5/6)x_1^3x_2 + (1/12)x_1^5", RedfieldExponentiation.j(zs2s3, 2).toString());
    assertEquals("J_3(Z(S2)*Z(S3)) = (2/3)x_2x_3 + (1/4)x_1x_2^2 + (5/3)x_1^2x_3 + (1/3)x_1^3x_2 + (1/12)x_1^5", RedfieldExponentiation.j(zs2s3, 3).toString());
    assertEquals("J_4(Z(S2)*Z(S3)) = (1/6)x_2x_3 + (5/2)x_1x_4 + (5/4)x_1x_2^2 + (1/6)x_1^2x_3 + (5/6)x_1^3x_2 + (1/12)x_1^5", RedfieldExponentiation.j(zs2s3, 4).toString());
  }

  public void testPowers1() {
    final CycleIndex zs2s3 = SymmetricGroup.create(2).cycleIndex().op(StandardMultiply.OP, SymmetricGroup.create(3).cycleIndex());
    // Equations (7.4.16) in Graphical Enumeration
    final CycleIndex j1 = RedfieldExponentiation.j(zs2s3, 1);
    assertEquals(Z.valueOf(107), j1.pow(RedfieldMultiply.OP, 4, Integer.MAX_VALUE).eval(1).toZ());
  }

  public void testPowers2() {
    final CycleIndex zs2s3 = SymmetricGroup.create(2).cycleIndex().op(StandardMultiply.OP, SymmetricGroup.create(3).cycleIndex());
    // Equations (7.4.16) in Graphical Enumeration
    final CycleIndex j2 = RedfieldExponentiation.j(zs2s3, 2);
    final CycleIndex j2a = j2.op(RedfieldMultiply.OP, j2);
    assertEquals(Z.valueOf(23), j2a.eval(1).toZ());
  }

  public void testPowers3() {
    final CycleIndex zs2s3 = SymmetricGroup.create(2).cycleIndex().op(StandardMultiply.OP, SymmetricGroup.create(3).cycleIndex());
    // Equations (7.4.16) in Graphical Enumeration
    final CycleIndex j1 = RedfieldExponentiation.j(zs2s3, 1);
    final CycleIndex j2 = RedfieldExponentiation.j(zs2s3, 2);
    final CycleIndex ci = j1.pow(RedfieldMultiply.OP, 2, Integer.MAX_VALUE).op(RedfieldMultiply.OP, j2);
    assertEquals(Z.valueOf(27), ci.eval(1).toZ());
  }
}
