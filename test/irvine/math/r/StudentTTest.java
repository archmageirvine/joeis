package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StudentTTest extends TestCase {

  public void testStudentT() {
    // nonpositive degress of freedom should give NaN
    assertEqualsLocal(Double.NaN, StudentT.studentT(0, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-1, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-5, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-Integer.MAX_VALUE, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(0, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-1, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-5, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.studentT(-Integer.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);

    // parameter = 0 is 0.5
    for (int k = 1; k < 5000; ++k) {
      assertEquals(0.5, StudentT.studentT(k, 0.0), 1.0E-15);
    }
    assertEquals(0.51, StudentT.studentT(1, 0.030), 1.0E-2);
    assertEquals(0.51, StudentT.studentT(2, 0.028), 1.0E-2);
    assertEquals(0.51, StudentT.studentT(5, 0.026), 1.0E-2);
    assertEquals(0.51, StudentT.studentT(50, 0.025), 1.0E-2);
  }

  public void testIStudentT() {
    // nonpositive degress of freedom should give NaN
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(0, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-1, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-5, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-Integer.MAX_VALUE, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(0, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-1, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-5, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(-Integer.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);

    // p not probability also gives NaN
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, Double.MAX_VALUE), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, -Double.MAX_VALUE), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, Double.NEGATIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(1, Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, Double.MAX_VALUE), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, -Double.MAX_VALUE), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, Double.NEGATIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, StudentT.inverseStudentT(10, Double.POSITIVE_INFINITY), 0.0);

    // parameter = 0.5 is 0.0
    for (int k = 1; k < 5000; ++k) {
      assertEquals(0.0, StudentT.inverseStudentT(k, 0.5), 1.0E-15);
    }
    // identity test
    for (int k = 1; k < 150; k += 10) {
      for (double t = 0.0; t < 8.0; t += 0.1) {
        final double t2 = StudentT.inverseStudentT(k, StudentT.studentT(k, t));
        if (t != t2) {
          assertEquals("(k, t)=(" + k + ", " + t + ")", 0.0, (t - t2) / (t + t2), 1.0E-4);
        }
      }
    }
    // identity test
    for (int k = 1; k < 5000; k += 10) {
      for (double t = 0.1; t < 1.0; t += 0.03) {
        final double t2 = StudentT.studentT(k, StudentT.inverseStudentT(k, t));
        if (t != t2) {
          assertEquals("i(k, t)=(" + k + ", " + t + ")", 0.0, (t - t2) / (t + t2), 1.0E-4);
        }
      }
    }
  }

}
